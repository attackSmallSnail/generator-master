<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${BasePackageName}${DaoPackageName}.${ClassName}Mapper">

    <resultMap id="${EntityName}ResultMap" type="${BasePackageName}${EntityPackageName}.${ClassName}">
        ${ResultMap}
        ${Association}
        ${Collection}
    </resultMap>

    <resultMap id="${EntityName}ResultMapVo" type="${BasePackageName}${VoPackageName}.${ClassName}Vo">
        ${ResultMap}
        ${Association}
        ${Collection}
    </resultMap>

    <sql id="${EntityName}Columns">
        ${ColumnMap}
    </sql>

    <sql id="${EntityName}Joins">
        ${Joins}
    </sql>

    <select id="get" resultMap="${EntityName}ResultMap">
        SELECT
        <include refid="${EntityName}Columns" />
        FROM ${TableName} <include refid="${EntityName}Joins" />
        <where>
        ${TableName}.${PrimaryKey} = ${Id}
        </where>
    </select>

    <select id="findList" resultMap="${EntityName}ResultMap">
        SELECT
        <include refid="${EntityName}Columns" />
        FROM ${TableName} <include refid="${EntityName}Joins" />
        <where>
            <#-- AND ${TableName}.name LIKE concat('%',#{name},'%')-->
        </where>
    </select>

    <select id="findListByReq" resultMap="${EntityName}ResultMapVo" parameterType="${BasePackageName}${ReqPackageName}.${ClassName}Req">
        SELECT
        <include refid="${EntityName}Columns" />
        FROM ${TableName} <include refid="${EntityName}Joins" />
        <where>
        <#-- AND ${TableName}.name LIKE concat('%',#{name},'%')-->
        </where>
    </select>

    <select id="findAllList" resultMap="${EntityName}ResultMap">
        SELECT
        <include refid="${EntityName}Columns" />
        FROM ${TableName} <include refid="${EntityName}Joins" />
        <where>
        </where>
    </select>

    <insert id="insert" parameterType="${BasePackageName}${EntityPackageName}.${ClassName}">
        INSERT INTO ${TableName}(
            ${InsertProperties}
        )
        VALUES (
            ${InsertValues}
        )
    </insert>

    <insert id="insertBatch">
        INSERT INTO ${TableName}(
            ${InsertProperties}
        )
        <foreach collection ="list" item="${EntityName}" separator ="union all">
        (
            SELECT
            ${InsertBatchValues}
            FROM DUAL
        )
        </foreach>
    </insert>

    <update id="update" parameterType="${BasePackageName}${EntityPackageName}.${ClassName}">
        UPDATE ${TableName}
        ${UpdateProperties}
        WHERE ${PrimaryKey} = ${WhereId}
    </update>

    <update id="delete" parameterType="${BasePackageName}${EntityPackageName}.${ClassName}">
        DELETE FROM ${TableName}
        WHERE ${PrimaryKey} = ${WhereId}
    </update>

</mapper>
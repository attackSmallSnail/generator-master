package com.greedystar.generator.application;

import com.greedystar.generator.invoker.Many2ManyInvoker;
import com.greedystar.generator.invoker.One2ManyInvoker;
import com.greedystar.generator.invoker.SingleInvoker;
import com.greedystar.generator.invoker.base.Invoker;

/**
 * Author GreedyStar
 * Date   2018/9/5
 */
public class Main {

    public static void main(String[] args) {
        single();
    }

    public static void many2many() {
        Invoker invoker = new Many2ManyInvoker.Builder()
                .setTableName("user")
                .setClassName("User")
                .setParentTableName("role")
                .setParentClassName("Role")
                .setRelationTableName("user_role")
                .setForeignKey("userId")
                .setParentForeignKey("roleId")
                .build();
        invoker.execute();
    }

    public static void one2many() {
        Invoker invoker = new One2ManyInvoker.Builder()
                .setTableName("user")
                .setClassName("User")
                .setParentTableName("office")
                .setParentClassName("Office")
                .setForeignKey("officeId")
                .build();
        invoker.execute();
    }

    public static void single() {
//        Invoker invoker1 = new SingleInvoker.Builder()
//                .setTableName("IM_MOD_SOURCE_SHEET")
//                .setClassName("ImModSourceSheetPojo")
//                .build();
//        invoker1.execute();
//        Invoker invoker2 = new SingleInvoker.Builder()
//                .setTableName("IM_MOD_SOURCE_SHEET")
//                .setClassName("ImModSourceSheetPojo")
//                .build();
//        invoker2.execute();
//        Invoker invoker3 = new SingleInvoker.Builder()
//                .setTableName("IM_MOD_TABLE_UNIT")
//                .setClassName("ImModTableUnitPojo")
//                .build();
//        invoker3.execute();
        Invoker invoker3 = new SingleInvoker.Builder()
                .setTableName("IM_KAFKA_LOG")
                .setClassName("ImKafkaLogPojo")
                .build();
        invoker3.execute();
//        Invoker invoker4 = new SingleInvoker.Builder()
//                .setTableName("DRUG_LIST_MAN_HEAD")
//                .setClassName("DrugListManHeadPojo")
//                .build();
//        invoker4.execute();
//
//        Invoker invoker4 = new SingleInvoker.Builder()
//                .setTableName("IM_MOD_SOURCE_ORG")
//                .setClassName("ImModSourceOrgPojo")
//                .build();
//        invoker4.execute();
//        Invoker invoker5 = new SingleInvoker.Builder()
//                .setTableName("IM_IMP_TABLE_SET")
//                .setClassName("ImImpTableSetPojo")
//                .build();
//        invoker5.execute();
//        Invoker invoker6 = new SingleInvoker.Builder()
//                .setTableName("IM_IMP_TABLE_DETAIL")
//                .setClassName("ImImpTableDetailPojo")
//                .build();
//        invoker6.execute();
//
//        Invoker invoker7 = new SingleInvoker.Builder()
//                .setTableName("IM_IMP_TABLE_COLUMN")
//                .setClassName("ImImpTableColumnPojo")
//                .build();
//        invoker7.execute();
//        Invoker invoker8 = new SingleInvoker.Builder()
//                .setTableName("IM_IMP_COLUMN_CODE")
//                .setClassName("ImImpColumnCodePojo")
//                .build();
//        invoker8.execute();
//        Invoker invoker9 = new SingleInvoker.Builder()
//                .setTableName("IM_LOG")
//                .setClassName("ImLogPojo")
//                .build();
//        invoker9.execute();
//
//        Invoker invoker10 = new SingleInvoker.Builder()
//                .setTableName("IM_FILE")
//                .setClassName("ImFilePojo")
//                .build();
//        invoker10.execute();
//        Invoker invoker11 = new SingleInvoker.Builder()
//                .setTableName("IM_TEMPORARY")
//                .setClassName("ImTemporaryPojo")
//                .build();
//        invoker11.execute();
//        Invoker invoker12 = new SingleInvoker.Builder()
//                .setTableName("IM_DATA_CHECK")
//                .setClassName("ImDataCheckPojo")
//                .build();
//        invoker12.execute();
//
//        Invoker invoker13 = new SingleInvoker.Builder()
//                .setTableName("IM_CHILD_DATA_CHECK")
//                .setClassName("ImChildDataCheckPojo")
//                .build();
//        invoker13.execute();
//
//        Invoker invoker14 = new SingleInvoker.Builder()
//                .setTableName("IM_CHECK_IMP_COLUMN")
//                .setClassName("ImCheckImpColumnPojo")
//                .build();
//        invoker14.execute();
//        Invoker invoker15 = new SingleInvoker.Builder()
//                .setTableName("IM_SX_CHECK_IMP_COLUMN")
//                .setClassName("ImSxCheckImpColumnPojo")
//                .build();
//        invoker15.execute();
    }

}

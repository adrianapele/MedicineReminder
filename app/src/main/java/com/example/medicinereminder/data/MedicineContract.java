package com.example.medicinereminder.data;

import android.provider.BaseColumns;

public class MedicineContract
{

    public static final class MedicineEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "medicines";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_MEDICINE_NAME = "name";
        public static final String COLUMN_MEDICINE_QUANTITY = "quantity";
        public static final String COLUMN_MEDICINE_PERIOD = "period";

    }
}

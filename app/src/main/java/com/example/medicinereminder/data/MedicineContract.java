package com.example.medicinereminder.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class MedicineContract
{
    public static final String CONTENT_AUTHORITY = "com.example.medicinereminder";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_MEDICINES = MedicineEntry.TABLE_NAME;

    public static final class MedicineEntry implements BaseColumns
    {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_MEDICINES);
        public static final String CONTENT_LIST_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_MEDICINES;
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_MEDICINES;


        public static final String TABLE_NAME = "medicines";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_MEDICINE_NAME = "name";
        public static final String COLUMN_MEDICINE_QUANTITY = "quantity";
        public static final String COLUMN_MEDICINE_PERIOD = "period";

    }
}

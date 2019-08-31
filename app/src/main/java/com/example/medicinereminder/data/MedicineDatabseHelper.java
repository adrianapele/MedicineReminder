package com.example.medicinereminder.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MedicineDatabseHelper extends SQLiteOpenHelper
{

    private static final String DATABSE_NAME = "reminder.db";
    private static final int DATABASE_VERSION = 1;

    public MedicineDatabseHelper(Context context)
    {
        super(context, DATABSE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String sqlStatement = "CREATE TABLE "
                + MedicineContract.MedicineEntry.TABLE_NAME
                + " ("
                + MedicineContract.MedicineEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + MedicineContract.MedicineEntry.COLUMN_MEDICINE_NAME + " TEXT NOT NULL, "
                + MedicineContract.MedicineEntry.COLUMN_MEDICINE_QUANTITY + "INTEGER NOT NULL, "
                + MedicineContract.MedicineEntry.COLUMN_MEDICINE_PERIOD + "TEXT NOT NULL);";

        db.execSQL(sqlStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
    }
}

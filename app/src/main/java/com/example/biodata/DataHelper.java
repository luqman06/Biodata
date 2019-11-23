package com.example.biodata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

private static final String DATABASE_NAME = "biodatadiri.db";
private static final int DATABASE_VERSION = 1;

public DataHelper (Context context){
    super(context,DATABASE_NAME,null,DATABASE_VERSION);
}


    @Override
    public void onCreate(SQLiteDatabase db) {
    String sq1 = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
        Log.d("Data","onCreate" + sq1);
        db.execSQL(sq1);
        sq1 = "INSERT INTO biodata(no, nama, tgl, jk, alamat) VALUES ('1', 'Luqman Rijalludien', '1998-11-06', 'Laki', 'Bantul');";
        db.execSQL(sq1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }
}

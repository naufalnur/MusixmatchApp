package com.example.Xmusic.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {MusicData.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MusicDao dao();

    private static AppDatabase appDatabase;

    public static AppDatabase iniDb(Context context) {
        if (appDatabase == null)
            appDatabase = Room.databaseBuilder(context,AppDatabase.class,"iniDb").allowMainThreadQueries().build();
        return appDatabase;
    }
}

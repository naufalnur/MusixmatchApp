package com.example.Xmusic.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MusicDao {
    @Insert
    long insertData(MusicData musicData);

    @Query("SELECT * FROM music_fav order by id desc")
    List<MusicData>getData();

    @Delete
    void deleteData(MusicData item);

}

package com.example.Xmusic.view.activity;

import android.view.View;

import com.example.Xmusic.database.AppDatabase;
import com.example.Xmusic.database.MusicData;

import java.util.List;

public interface MainContact {

    interface view extends View.OnClickListener {}

    interface presenter {
        void deleteData(AppDatabase database, MusicData musicData);
    }

    interface read extends View.OnClickListener{
        void getData(List<MusicData> list);
    }

    interface delete {
        void successDel();

        void deleteData(MusicData item);
    }
}

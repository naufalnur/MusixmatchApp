package com.example.Xmusic.presenter;

import android.content.Context;
import android.os.AsyncTask;

import com.example.Xmusic.database.AppDatabase;
import com.example.Xmusic.database.MusicData;
import com.example.Xmusic.view.activity.MainContact;

public class PresenterDao implements MainContact.presenter {
    MainContact.view view;
    MainContact.delete viewDel;

    public PresenterDao(MainContact.view view) {
        this.view = view;
    }

    public PresenterDao(MainContact.delete viewDel) {
        this.viewDel = viewDel;
    }

    @Override
    public void deleteData(AppDatabase database, MusicData musicData) {
        new DeleteData(database, musicData).execute();
    }

    private class DeleteData extends AsyncTask<Void, Void, Void> {
        private AppDatabase database;
        private MusicData musicData;
        Context context;

        public DeleteData(AppDatabase database, MusicData musicData) {
        this.database = database;
        this.musicData = musicData;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            database.dao().deleteData(musicData);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            viewDel.successDel();
        }
    }
}

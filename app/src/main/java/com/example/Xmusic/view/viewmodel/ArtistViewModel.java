package com.example.Xmusic.view.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.Xmusic.model.artist.ArtistAliasListItem;
import com.example.Xmusic.model.artist.ArtistListItem;
import com.example.Xmusic.model.artist.ArtistResponse;
import com.example.Xmusic.service.ApiMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArtistViewModel extends ViewModel {
    private ApiMain apiMain;
    private MutableLiveData<ArrayList<ArtistListItem>> listArtist = new MutableLiveData<>();

    public void setListArtist() {
        if (this.apiMain == null) {
            apiMain = new ApiMain();
        }
        apiMain.getApi().getArtistChart().enqueue(new Callback<ArtistResponse>() {
            @Override
            public void onResponse(Call<ArtistResponse> call, Response<ArtistResponse> response) {
                ArtistResponse responseArtist = response.body();
                if (responseArtist != null && responseArtist.getMessage() != null) {
                    ArrayList<ArtistListItem> artistListItems = responseArtist.getMessage().getBody().getArtistList();  //MASIH SALAH KAYANYA
                    listArtist.postValue(artistListItems);
                }
            }

            @Override
            public void onFailure(Call<ArtistResponse> call, Throwable t) {

            }
        });
    }
    public LiveData<ArrayList<ArtistListItem>> getArtist() {
        return listArtist;
    }
}

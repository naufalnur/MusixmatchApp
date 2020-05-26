package com.example.Xmusic.view.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.Xmusic.model.track.TrackListItem;
import com.example.Xmusic.model.track.TrackResponse;
import com.example.Xmusic.service.ApiMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TrackViewModel extends ViewModel {
    private ApiMain apiMain;
    private MutableLiveData<ArrayList<TrackListItem>> listTrack = new MutableLiveData<>();

    public void setTrackChart(){
        if(this.apiMain ==null){
            apiMain = new ApiMain();
        }

        apiMain.getApi().getTrackChart().enqueue(new Callback<TrackResponse>() {
            @Override
            public void onResponse(Call<TrackResponse> call, Response<TrackResponse> response) {
                TrackResponse responseTrending = response.body();
                if(responseTrending !=null && responseTrending.getMessage() !=null){
                    ArrayList<TrackListItem> trackList = responseTrending.getMessage().getBody().getTrackList();
                    listTrack.postValue(trackList);
                }
            }

            @Override
            public void onFailure(Call<TrackResponse> call, Throwable t) {

            }
        });
    }

    public LiveData<ArrayList<TrackListItem>> getTrack(){
        return listTrack;
    }
}

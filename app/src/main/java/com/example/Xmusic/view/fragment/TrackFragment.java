package com.example.Xmusic.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Xmusic.R;
import com.example.Xmusic.adapter.TrackAdapter;
import com.example.Xmusic.model.track.TrackListItem;
import com.example.Xmusic.view.viewmodel.TrackViewModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TrackFragment extends Fragment {

    private RecyclerView recyclerView;
    private TrackAdapter trackAdapter;
    private TrackViewModel trackViewModel;

    public TrackFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_track, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        trackAdapter = new TrackAdapter(getContext());
        trackAdapter.notifyDataSetChanged();

        recyclerView = view.findViewById(R.id.rv_track);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        trackViewModel = new ViewModelProvider(this).get(TrackViewModel.class);
        trackViewModel.setTrackChart();
        trackViewModel.getTrack().observe(this,getTrack);

        recyclerView.setAdapter(trackAdapter);
    }

    private Observer<ArrayList<TrackListItem>> getTrack = new Observer<ArrayList<TrackListItem>>() {
        @Override
        public void onChanged(ArrayList<TrackListItem> trackListItems) {
            if (trackListItems!=null){
                trackAdapter.setData(trackListItems);
            }
        }
    };

}

package com.example.Xmusic.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Xmusic.R;
import com.example.Xmusic.adapter.ArtistAdapter;
import com.example.Xmusic.model.artist.ArtistAliasListItem;
import com.example.Xmusic.model.artist.ArtistListItem;
import com.example.Xmusic.view.viewmodel.ArtistViewModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArtistFragment extends Fragment {

    private ArtistAdapter artistAdapter;
    private RecyclerView rvArtist;
    private ArtistViewModel artistViewModel;

    public ArtistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artist, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        artistAdapter = new ArtistAdapter(getContext());
        artistAdapter.notifyDataSetChanged();

        rvArtist = view.findViewById(R.id.fragmentartist_rv);
        rvArtist.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        artistViewModel = new ViewModelProvider(this).get(ArtistViewModel.class);
        artistViewModel.setListArtist();
        artistViewModel.getArtist().observe(this,getArtist);

        rvArtist.setAdapter(artistAdapter);
    }

    private Observer<ArrayList<ArtistListItem>> getArtist = new Observer<ArrayList<ArtistListItem>>() {
        @Override
        public void onChanged(ArrayList<ArtistListItem> artistListItems) {
            if( artistListItems != null) {
                artistAdapter.setData(artistListItems);
            }
        }
    };
}

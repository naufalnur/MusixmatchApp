package com.example.Xmusic.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Xmusic.R;
import com.example.Xmusic.model.track.TrackListItem;
import com.example.Xmusic.view.viewmodel.TrackViewModel;

import java.util.ArrayList;

public class TrackAdapter extends RecyclerView.Adapter<TrackAdapter.ViewHolder> {

    private ArrayList<TrackListItem> trackItems = new ArrayList<>();
    private Context context;

    private int position;

    public TrackAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<TrackListItem> items) {
        trackItems.clear();
        trackItems.addAll(items);
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_track, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTrack.setText(trackItems.get(position).getTrack().getTrackName());
        holder.tvArtist.setText(trackItems.get(position).getTrack().getArtistName());

    }

    @Override
    public int getItemCount() {
        return trackItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTrack, tvArtist;
        CardView cvItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvItem = itemView.findViewById(R.id.itemlist_cv);
            tvArtist = itemView.findViewById(R.id.tv_artis);
            tvTrack = itemView.findViewById(R.id.tv_track);
        }
    }
}

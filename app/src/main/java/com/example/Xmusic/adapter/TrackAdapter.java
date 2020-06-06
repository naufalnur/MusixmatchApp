package com.example.Xmusic.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Xmusic.R;
import com.example.Xmusic.database.AppDatabase;
import com.example.Xmusic.database.MusicData;
import com.example.Xmusic.model.track.TrackListItem;
import com.example.Xmusic.view.viewmodel.TrackViewModel;

import java.util.ArrayList;

public class TrackAdapter extends RecyclerView.Adapter<TrackAdapter.ViewHolder> {

    private ArrayList<TrackListItem> trackItems = new ArrayList<>();
    private Context context;
    AppDatabase appDatabase;

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
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tvTrack.setText(trackItems.get(position).getTrack().getTrackName());
        holder.tvArtist.setText(trackItems.get(position).getTrack().getArtistName());
        holder.btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MusicData musicData = new MusicData();
                musicData.setTrackName(trackItems.get(position).getTrack().getTrackName());
                musicData.setArtistName(trackItems.get(position).getTrack().getArtistName());

                appDatabase.dao().insertData(musicData);
                Toast.makeText(context, "Added to Favorite", Toast.LENGTH_SHORT).show();
                Log.d("TrackAdapter", "Success addedd to favorite");
            }
        });
        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String track = "Share" + trackItems.get(position).getTrack().getTrackName();
                intent.putExtra(Intent.EXTRA_TEXT, track);
                context.startActivity(Intent.createChooser(intent, "Share Using"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return trackItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTrack, tvArtist;
        CardView cvItem;
        ImageView btnShare, btnFav;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvItem = itemView.findViewById(R.id.itemlist_cv);
            tvArtist = itemView.findViewById(R.id.tv_artis);
            tvTrack = itemView.findViewById(R.id.tv_track);
            btnShare = itemView.findViewById(R.id.btn_share);
            btnFav = itemView.findViewById(R.id.btn_add_fav);
            appDatabase = AppDatabase.iniDb(context);
        }
    }
}

package com.example.Xmusic.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Xmusic.R;
import com.example.Xmusic.model.artist.ArtistListItem;
import com.example.Xmusic.view.activity.ArtistDetails;

import java.util.ArrayList;

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.ViewHolder> {

    private ArrayList<ArtistListItem> artistListItems = new ArrayList<>();

    private Context context;

    public ArtistAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<ArtistListItem> artistItems) {
        artistListItems.clear();
        artistListItems.addAll(artistItems);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_artist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.tvName.setText(artistListItems.get(position).getArtist().getArtistName());
        holder.tvRate.setText(String.valueOf(artistListItems.get(position).getArtist().getArtistRating()));
        holder.cvArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, artistListItems.get(position).getArtist().getArtistName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, ArtistDetails.class);
                intent.putExtra("detail_artistName", artistListItems.get(position).getArtist().getArtistName());
                intent.putExtra("detail_artistCountry", artistListItems.get(position).getArtist().getArtistCountry());
                intent.putExtra("detail_artistTwitter", artistListItems.get(position).getArtist().getArtistTwitterUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return artistListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvRate;
        CardView cvArtist;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvArtist = itemView.findViewById(R.id.artistlist_cv);
            tvName = itemView.findViewById(R.id.tv_artist_name);
            tvRate = itemView.findViewById(R.id.tv_artist_rating);
        }
    }
}

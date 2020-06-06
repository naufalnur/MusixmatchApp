package com.example.Xmusic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Xmusic.R;
import com.example.Xmusic.database.AppDatabase;
import com.example.Xmusic.database.MusicData;
import com.example.Xmusic.view.activity.MainContact;

import java.util.List;

public class FavAdapter extends RecyclerView.Adapter<FavAdapter.Holder> {
    private Context context;
    private List<MusicData> list;
    private MainContact.delete viewDel;
    private AppDatabase appDatabase;
    private MusicData musicData;

    public FavAdapter(Context context, List<MusicData> list, MainContact.delete viewDel) {
        this.context = context;
        this.list = list;
        this.viewDel = viewDel;
    }

    @NonNull
    @Override
    public FavAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_fav, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FavAdapter.Holder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        private TextView tvTrackName, tvArtistName;
        private ImageView btnRemove;

        public Holder(@NonNull View itemView) {
            super(itemView);
            tvTrackName = itemView.findViewById(R.id.tv_fav_track);
            tvArtistName = itemView.findViewById(R.id.tv_fav_artis);
            btnRemove = itemView.findViewById(R.id.btn_remove);
        }

        public void bind(int position) {
            final MusicData musicData = list.get(position);
            tvTrackName.setText(musicData.getTrackName());
            tvArtistName.setText(musicData.getArtistName());
            btnRemove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    viewDel.deleteData(musicData);
                }
            });
        }
    }
}

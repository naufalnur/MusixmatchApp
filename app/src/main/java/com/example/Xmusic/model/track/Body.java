package com.example.Xmusic.model.track;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Body{

	@SerializedName("track_list")
	private ArrayList<TrackListItem> trackList;

	public void setTrackList(ArrayList<TrackListItem> trackList){
		this.trackList = trackList;
	}

	public ArrayList<TrackListItem> getTrackList(){
		return trackList;
	}
}
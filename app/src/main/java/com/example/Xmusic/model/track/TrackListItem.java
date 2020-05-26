package com.example.Xmusic.model.track;

import com.google.gson.annotations.SerializedName;

public class TrackListItem{

	@SerializedName("track")
	private Track track;

	public void setTrack(Track track){
		this.track = track;
	}

	public Track getTrack(){
		return track;
	}
}
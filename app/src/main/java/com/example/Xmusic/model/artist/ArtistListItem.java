package com.example.Xmusic.model.artist;

import com.google.gson.annotations.SerializedName;

public class ArtistListItem{

	@SerializedName("artist")
	private Artist artist;

	public void setArtist(Artist artist){
		this.artist = artist;
	}

	public Artist getArtist(){
		return artist;
	}

	@Override
 	public String toString(){
		return 
			"ArtistListItem{" + 
			"artist = '" + artist + '\'' + 
			"}";
		}
}
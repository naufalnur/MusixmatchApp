package com.example.Xmusic.model.artist;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ArtistCredits{

	@SerializedName("artist_list")
	private List<Object> artistList;

	public void setArtistList(List<Object> artistList){
		this.artistList = artistList;
	}

	public List<Object> getArtistList(){
		return artistList;
	}

	@Override
 	public String toString(){
		return 
			"ArtistCredits{" + 
			"artist_list = '" + artistList + '\'' + 
			"}";
		}
}
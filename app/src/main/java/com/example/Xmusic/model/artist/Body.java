package com.example.Xmusic.model.artist;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Body{

	@SerializedName("artist_list")
	private ArrayList<ArtistListItem> artistList;

	public void setArtistList(ArrayList<ArtistListItem> artistList){
		this.artistList = artistList;
	}

	public ArrayList<ArtistListItem> getArtistList(){
		return artistList;
	}

	@Override
 	public String toString(){
		return 
			"Body{" + 
			"artist_list = '" + artistList + '\'' + 
			"}";
		}
}
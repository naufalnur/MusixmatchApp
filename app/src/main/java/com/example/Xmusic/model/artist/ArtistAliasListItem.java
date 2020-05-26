package com.example.Xmusic.model.artist;

import com.google.gson.annotations.SerializedName;

public class ArtistAliasListItem{

	@SerializedName("artist_alias")
	private String artistAlias;

	public void setArtistAlias(String artistAlias){
		this.artistAlias = artistAlias;
	}

	public String getArtistAlias(){
		return artistAlias;
	}

	@Override
 	public String toString(){
		return 
			"ArtistAliasListItem{" + 
			"artist_alias = '" + artistAlias + '\'' + 
			"}";
		}
}
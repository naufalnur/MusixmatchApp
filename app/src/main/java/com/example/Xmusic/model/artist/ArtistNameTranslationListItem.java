package com.example.Xmusic.model.artist;

import com.google.gson.annotations.SerializedName;

public class ArtistNameTranslationListItem{

	@SerializedName("artist_name_translation")
	private ArtistNameTranslation artistNameTranslation;

	public void setArtistNameTranslation(ArtistNameTranslation artistNameTranslation){
		this.artistNameTranslation = artistNameTranslation;
	}

	public ArtistNameTranslation getArtistNameTranslation(){
		return artistNameTranslation;
	}

	@Override
 	public String toString(){
		return 
			"ArtistNameTranslationListItem{" + 
			"artist_name_translation = '" + artistNameTranslation + '\'' + 
			"}";
		}
}
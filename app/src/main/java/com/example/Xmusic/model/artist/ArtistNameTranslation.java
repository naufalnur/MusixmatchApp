package com.example.Xmusic.model.artist;

import com.google.gson.annotations.SerializedName;

public class ArtistNameTranslation{

	@SerializedName("translation")
	private String translation;

	@SerializedName("language")
	private String language;

	public void setTranslation(String translation){
		this.translation = translation;
	}

	public String getTranslation(){
		return translation;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	@Override
 	public String toString(){
		return 
			"ArtistNameTranslation{" + 
			"translation = '" + translation + '\'' + 
			",language = '" + language + '\'' + 
			"}";
		}
}
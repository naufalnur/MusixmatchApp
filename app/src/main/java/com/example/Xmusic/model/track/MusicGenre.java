package com.example.Xmusic.model.track;

import com.google.gson.annotations.SerializedName;

public class MusicGenre{

	@SerializedName("music_genre_id")
	private int musicGenreId;

	@SerializedName("music_genre_vanity")
	private String musicGenreVanity;

	@SerializedName("music_genre_parent_id")
	private int musicGenreParentId;

	@SerializedName("music_genre_name_extended")
	private String musicGenreNameExtended;

	@SerializedName("music_genre_name")
	private String musicGenreName;

	public void setMusicGenreId(int musicGenreId){
		this.musicGenreId = musicGenreId;
	}

	public int getMusicGenreId(){
		return musicGenreId;
	}

	public void setMusicGenreVanity(String musicGenreVanity){
		this.musicGenreVanity = musicGenreVanity;
	}

	public String getMusicGenreVanity(){
		return musicGenreVanity;
	}

	public void setMusicGenreParentId(int musicGenreParentId){
		this.musicGenreParentId = musicGenreParentId;
	}

	public int getMusicGenreParentId(){
		return musicGenreParentId;
	}

	public void setMusicGenreNameExtended(String musicGenreNameExtended){
		this.musicGenreNameExtended = musicGenreNameExtended;
	}

	public String getMusicGenreNameExtended(){
		return musicGenreNameExtended;
	}

	public void setMusicGenreName(String musicGenreName){
		this.musicGenreName = musicGenreName;
	}

	public String getMusicGenreName(){
		return musicGenreName;
	}
}
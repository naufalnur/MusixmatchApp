package com.example.Xmusic.model.track;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PrimaryGenres{

	@SerializedName("music_genre_list")
	private List<Object> musicGenreList;

	public void setMusicGenreList(List<Object> musicGenreList){
		this.musicGenreList = musicGenreList;
	}

	public List<Object> getMusicGenreList(){
		return musicGenreList;
	}
}
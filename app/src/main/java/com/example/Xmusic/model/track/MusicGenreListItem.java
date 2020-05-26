package com.example.Xmusic.model.track;

import com.google.gson.annotations.SerializedName;

public class MusicGenreListItem{

	@SerializedName("music_genre")
	private MusicGenre musicGenre;

	public void setMusicGenre(MusicGenre musicGenre){
		this.musicGenre = musicGenre;
	}

	public MusicGenre getMusicGenre(){
		return musicGenre;
	}
}
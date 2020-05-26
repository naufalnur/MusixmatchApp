package com.example.Xmusic.model.artist;

import com.google.gson.annotations.SerializedName;

public class ArtistResponse{

	@SerializedName("message")
	private Message message;

	public void setMessage(Message message){
		this.message = message;
	}

	public Message getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"ArtistResponse{" + 
			"message = '" + message + '\'' + 
			"}";
		}
}
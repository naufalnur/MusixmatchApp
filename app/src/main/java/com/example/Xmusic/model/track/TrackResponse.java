package com.example.Xmusic.model.track;

import com.google.gson.annotations.SerializedName;

public class TrackResponse{

	@SerializedName("message")
	private Message message;

	public void setMessage(Message message){
		this.message = message;
	}

	public Message getMessage(){
		return message;
	}
}
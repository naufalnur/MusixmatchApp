package com.example.Xmusic.model.track;

import com.google.gson.annotations.SerializedName;

public class Message{

	@SerializedName("header")
	private Header header;

	@SerializedName("body")
	private Body body;

	public void setHeader(Header header){
		this.header = header;
	}

	public Header getHeader(){
		return header;
	}

	public void setBody(Body body){
		this.body = body;
	}

	public Body getBody(){
		return body;
	}
}
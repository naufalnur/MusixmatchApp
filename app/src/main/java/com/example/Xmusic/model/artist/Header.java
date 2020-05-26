package com.example.Xmusic.model.artist;

import com.google.gson.annotations.SerializedName;

public class Header{

	@SerializedName("status_code")
	private int statusCode;

	@SerializedName("execute_time")
	private double executeTime;

	public void setStatusCode(int statusCode){
		this.statusCode = statusCode;
	}

	public int getStatusCode(){
		return statusCode;
	}

	public void setExecuteTime(double executeTime){
		this.executeTime = executeTime;
	}

	public double getExecuteTime(){
		return executeTime;
	}

	@Override
 	public String toString(){
		return 
			"Header{" + 
			"status_code = '" + statusCode + '\'' + 
			",execute_time = '" + executeTime + '\'' + 
			"}";
		}
}
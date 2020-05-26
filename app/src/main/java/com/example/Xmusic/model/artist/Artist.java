package com.example.Xmusic.model.artist;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Artist{

	@SerializedName("artist_alias_list")
	private List<Object> artistAliasList;

	@SerializedName("updated_time")
	private String updatedTime;

	@SerializedName("artist_comment")
	private String artistComment;

	@SerializedName("artist_name")
	private String artistName;

	@SerializedName("artist_twitter_url")
	private String artistTwitterUrl;

	@SerializedName("restricted")
	private int restricted;

	@SerializedName("artist_rating")
	private int artistRating;

	@SerializedName("artist_country")
	private String artistCountry;

	@SerializedName("artist_credits")
	private ArtistCredits artistCredits;

	@SerializedName("artist_id")
	private int artistId;

	@SerializedName("artist_name_translation_list")
	private List<Object> artistNameTranslationList;

	public void setArtistAliasList(List<Object> artistAliasList){
		this.artistAliasList = artistAliasList;
	}

	public List<Object> getArtistAliasList(){
		return artistAliasList;
	}

	public void setUpdatedTime(String updatedTime){
		this.updatedTime = updatedTime;
	}

	public String getUpdatedTime(){
		return updatedTime;
	}

	public void setArtistComment(String artistComment){
		this.artistComment = artistComment;
	}

	public String getArtistComment(){
		return artistComment;
	}

	public void setArtistName(String artistName){
		this.artistName = artistName;
	}

	public String getArtistName(){
		return artistName;
	}

	public void setArtistTwitterUrl(String artistTwitterUrl){
		this.artistTwitterUrl = artistTwitterUrl;
	}

	public String getArtistTwitterUrl(){
		return artistTwitterUrl;
	}

	public void setRestricted(int restricted){
		this.restricted = restricted;
	}

	public int getRestricted(){
		return restricted;
	}

	public void setArtistRating(int artistRating){
		this.artistRating = artistRating;
	}

	public int getArtistRating(){
		return artistRating;
	}

	public void setArtistCountry(String artistCountry){
		this.artistCountry = artistCountry;
	}

	public String getArtistCountry(){
		return artistCountry;
	}

	public void setArtistCredits(ArtistCredits artistCredits){
		this.artistCredits = artistCredits;
	}

	public ArtistCredits getArtistCredits(){
		return artistCredits;
	}

	public void setArtistId(int artistId){
		this.artistId = artistId;
	}

	public int getArtistId(){
		return artistId;
	}

	public void setArtistNameTranslationList(List<Object> artistNameTranslationList){
		this.artistNameTranslationList = artistNameTranslationList;
	}

	public List<Object> getArtistNameTranslationList(){
		return artistNameTranslationList;
	}

	@Override
 	public String toString(){
		return 
			"Artist{" + 
			"artist_alias_list = '" + artistAliasList + '\'' + 
			",updated_time = '" + updatedTime + '\'' + 
			",artist_comment = '" + artistComment + '\'' + 
			",artist_name = '" + artistName + '\'' + 
			",artist_twitter_url = '" + artistTwitterUrl + '\'' + 
			",restricted = '" + restricted + '\'' + 
			",artist_rating = '" + artistRating + '\'' + 
			",artist_country = '" + artistCountry + '\'' + 
			",artist_credits = '" + artistCredits + '\'' + 
			",artist_id = '" + artistId + '\'' + 
			",artist_name_translation_list = '" + artistNameTranslationList + '\'' + 
			"}";
		}
}
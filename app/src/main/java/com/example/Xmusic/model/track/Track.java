package com.example.Xmusic.model.track;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Track{

	@SerializedName("updated_time")
	private String updatedTime;

	@SerializedName("track_share_url")
	private String trackShareUrl;

	@SerializedName("primary_genres")
	private PrimaryGenres primaryGenres;

	@SerializedName("track_name_translation_list")
	private List<Object> trackNameTranslationList;

	@SerializedName("artist_name")
	private String artistName;

	@SerializedName("commontrack_id")
	private int commontrackId;

	@SerializedName("artist_id")
	private int artistId;

	@SerializedName("explicit")
	private int explicit;

	@SerializedName("num_favourite")
	private int numFavourite;

	@SerializedName("track_rating")
	private int trackRating;

	@SerializedName("has_richsync")
	private int hasRichsync;

	@SerializedName("track_id")
	private int trackId;

	@SerializedName("instrumental")
	private int instrumental;

	@SerializedName("album_name")
	private String albumName;

	@SerializedName("restricted")
	private int restricted;

	@SerializedName("has_subtitles")
	private int hasSubtitles;

	@SerializedName("album_id")
	private int albumId;

	@SerializedName("has_lyrics")
	private int hasLyrics;

	@SerializedName("track_edit_url")
	private String trackEditUrl;

	@SerializedName("track_name")
	private String trackName;

	public void setUpdatedTime(String updatedTime){
		this.updatedTime = updatedTime;
	}

	public String getUpdatedTime(){
		return updatedTime;
	}

	public void setTrackShareUrl(String trackShareUrl){
		this.trackShareUrl = trackShareUrl;
	}

	public String getTrackShareUrl(){
		return trackShareUrl;
	}

	public void setPrimaryGenres(PrimaryGenres primaryGenres){
		this.primaryGenres = primaryGenres;
	}

	public PrimaryGenres getPrimaryGenres(){
		return primaryGenres;
	}

	public void setTrackNameTranslationList(List<Object> trackNameTranslationList){
		this.trackNameTranslationList = trackNameTranslationList;
	}

	public List<Object> getTrackNameTranslationList(){
		return trackNameTranslationList;
	}

	public void setArtistName(String artistName){
		this.artistName = artistName;
	}

	public String getArtistName(){
		return artistName;
	}

	public void setCommontrackId(int commontrackId){
		this.commontrackId = commontrackId;
	}

	public int getCommontrackId(){
		return commontrackId;
	}

	public void setArtistId(int artistId){
		this.artistId = artistId;
	}

	public int getArtistId(){
		return artistId;
	}

	public void setExplicit(int explicit){
		this.explicit = explicit;
	}

	public int getExplicit(){
		return explicit;
	}

	public void setNumFavourite(int numFavourite){
		this.numFavourite = numFavourite;
	}

	public int getNumFavourite(){
		return numFavourite;
	}

	public void setTrackRating(int trackRating){
		this.trackRating = trackRating;
	}

	public int getTrackRating(){
		return trackRating;
	}

	public void setHasRichsync(int hasRichsync){
		this.hasRichsync = hasRichsync;
	}

	public int getHasRichsync(){
		return hasRichsync;
	}

	public void setTrackId(int trackId){
		this.trackId = trackId;
	}

	public int getTrackId(){
		return trackId;
	}

	public void setInstrumental(int instrumental){
		this.instrumental = instrumental;
	}

	public int getInstrumental(){
		return instrumental;
	}

	public void setAlbumName(String albumName){
		this.albumName = albumName;
	}

	public String getAlbumName(){
		return albumName;
	}

	public void setRestricted(int restricted){
		this.restricted = restricted;
	}

	public int getRestricted(){
		return restricted;
	}

	public void setHasSubtitles(int hasSubtitles){
		this.hasSubtitles = hasSubtitles;
	}

	public int getHasSubtitles(){
		return hasSubtitles;
	}

	public void setAlbumId(int albumId){
		this.albumId = albumId;
	}

	public int getAlbumId(){
		return albumId;
	}

	public void setHasLyrics(int hasLyrics){
		this.hasLyrics = hasLyrics;
	}

	public int getHasLyrics(){
		return hasLyrics;
	}

	public void setTrackEditUrl(String trackEditUrl){
		this.trackEditUrl = trackEditUrl;
	}

	public String getTrackEditUrl(){
		return trackEditUrl;
	}

	public void setTrackName(String trackName){
		this.trackName = trackName;
	}

	public String getTrackName(){
		return trackName;
	}
}
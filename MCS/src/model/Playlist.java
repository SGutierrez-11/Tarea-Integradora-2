package model;

public class Playlist{
	
	//CONSTANTS
	
	public static final int MAX_SONGS=30;
	public static final int MAX_GENRES=6;
	
	//ATTRIBUTES
	
	private String namePlaylist;
	private int duration;
	
	//RELATIONS
	
	private Genre[] genre;
	private Song[] songs;
	
	//BUILDER
	
	public Playlist(String namePlaylist){
		
		this.namePlaylist=namePlaylist;
		this.duration=duration;
		this.genre= new Genre[MAX_GENRES];
		this.songs= new Song[MAX_SONGS];
		
	}
	
	/**
	*@return String return the namePlaylist.
	*/
	
	public String getNamePlaylist(){
		return namePlaylist;
	}
	
	/**
	*@param NamePlaylist are the name of the Playlist.
	*/
	
	public void setNamePlaylist(int duration){
		this.namePlaylist=namePlaylist;
	}

	/**
	*@return int return the duration.
	*/
	
	public int getDuration(){
		return duration;
	}
	
	/**
	*@param duration are the duration of the Playlist.
	*/
	
	public void setDuration(int duration){
		this.duration=duration;
	}

	/**
	*@return Genre return the genre.
	*/
	
	public Genre[] getGenre(){
		return genre;
	}
	
	/**
	*@param genre are the genre of the Playlist.
	*/
	
	public void setGenre(Genre[] genre){
		this.genre=genre;
	}
	
	/**
	*@return Song return the songs.
	*/
	
	public Song[] getSongs(){
		return songs;
	}
	
	/**
	*@param Song are the songs of the Playlist.
	*/
	
	public void setSongs(Song[] songs){
		this.songs=songs;
	}
	
}
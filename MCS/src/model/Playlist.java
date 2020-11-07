package model;

public class Playlist{
	
	public static final int MAX_SONGS=30;
	public static final int MAX_GENRES=6;
	//atributos
	private String namePlaylist;
	private int duration;
	
	//relaciones
	
	private Genre[] genre;
	private Song[] songs;
	
	public Playlist(String namePlaylist){
		
		this.namePlaylist=namePlaylist;
		this.duration=duration;
		this.genre= new Genre[MAX_GENRES];
		this.songs= new Song[MAX_SONGS];
		
	}
	
	public String getNamePlaylist(){
		return namePlaylist;
	}
	public void setNamePlaylist(int duration){
		this.namePlaylist=namePlaylist;
	}


	public int getDuration(){
		return duration;
	}
	public void setDuration(int duration){
		this.duration=duration;
	}


	public Genre[] getGenre(){
		return genre;
	}
	public void setGenre(Genre[] genre){
		this.genre=genre;
	}
	
	
	public Song[] getSongs(){
		return songs;
	}
	public void setSongs(Song[] songs){
		this.songs=songs;
	}
	
}
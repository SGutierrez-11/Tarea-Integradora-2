package model;

public class Song{
	
	private String title;
	private String artist;
	private String release;
	private int duration;
	
	private Genre genre;
	
	public Song(String title, String artist, String release, int duration, String genre){
		this.title=title;
		this.artist=artist;
		this.release=release;
		this.duration=duration;
		Genre genre1=Genre.valueOf(genre);
		this.genre=genre1;
	}
	
	public String showSong(){
		
		 String profileSong = "";
        profileSong += "********** Cancion **********\n"+
                "** Titulo: "+title+"\n"+
                "** Artista/Banda: "+artist+"\n"+
                "** Duracion: "+duration+"\n"+
                "** Genero: "+genre+"\n"+
                "**************************\n";
        return profileSong;
		
	}
	
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	
	
	public String getArtist(){
		return artist;
	}
	public void setArtist(String artist){
		this.artist=artist;
	}
	
	
	public String getRelease(){
		return release;
	}
	public void setRelease(){
		this.release=release;
	}
	
	
	public int getDuration(){
		return duration;
	}
	public void setDuration(int duration){
		this.duration=duration;
	}
	
	
	public Genre getGenre(){
		return genre;
	}
	public void setGenre(Genre genre){
		this.genre=genre;
	}
	
	
}
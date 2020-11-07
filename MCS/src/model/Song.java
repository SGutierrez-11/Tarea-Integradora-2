package model;

public class Song{
	
	//ATTRIBUTES
	
	private String title;
	private String artist;
	private String release;
	private int duration;
	
	//RELATIONS
	
	private Genre genre;
	
	//BUILDER
	
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
	
	/**
	*@return String return the title.
	*/
	
	public String getTitle(){
		return title;
	}
	
	/**
	*@param title are the title of the song.
	*/
	
	public void setTitle(String title){
		this.title=title;
	}
	
	/**
	*@return String return the artist.
	*/
	
	public String getArtist(){
		return artist;
	}
	
	/**
	*@param artist are the artist of the song.
	*/
	
	public void setArtist(String artist){
		this.artist=artist;
	}
	
	/**
	*@return String return the release.
	*/
	
	public String getRelease(){
		return release;
	}
	
	/**
	*@param release are the release of the song.
	*/
	
	public void setRelease(){
		this.release=release;
	}
	
	/**
	*@return int return the duration.
	*/
	
	public int getDuration(){
		return duration;
	}
	
	/**
	*@param duration are the duration of the song.
	*/
	
	public void setDuration(int duration){
		this.duration=duration;
	}
	
	/**
	*@return Genre return the genre.
	*/
	
	public Genre getGenre(){
		return genre;
	}
	
	/**
	*@param genre are the genre of the song.
	*/
	
	public void setGenre(Genre genre){
		this.genre=genre;
	}
	
	
}
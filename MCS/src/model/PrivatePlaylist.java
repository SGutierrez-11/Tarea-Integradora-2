package model;

public class PrivatePlaylist extends Playlist{
	
	private User theUser;
	
	public PrivatePlaylist(String name){
		super(name);
		this.theUser=theUser;
	}
	
	public User getTheUser(){
		return theUser;
	}
	
	public void setTheUser(User newUser){
		this.theUser=newUser;
	}
	
}
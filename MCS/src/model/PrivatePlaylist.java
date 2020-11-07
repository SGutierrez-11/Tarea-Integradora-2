package model;

public class PrivatePlaylist extends Playlist{
	
	//RELATIONS
	
	private User theUser;
	
	//BUILDER
	
	public PrivatePlaylist(String name){
		super(name);
		this.theUser=theUser;
	}
	
	/**
	*@return User return the user.
	*/
	
	public User getTheUser(){
		return theUser;
	}
	
	/**
	*@param newUser are the new user.
	*/
	
	public void setTheUser(User newUser){
		this.theUser=newUser;
	}
	
}
package model;

public class RestritedPlaylist extends Playlist{
	
	private String[] users;
	
	public RestritedPlaylist(String[] users, String name){
		super(name);
		this.users= users;
	}
	
	public String[] getUsers(){
		return users;
	}
	
	public void setUsers(String[] users){
		this.users=users;
	}
	
}
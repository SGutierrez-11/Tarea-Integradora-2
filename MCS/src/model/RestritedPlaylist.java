package model;

public class RestritedPlaylist extends Playlist{
	
	//ATTRIBUTES
	
	private String[] users;
	
	//BUILDER
	
	public RestritedPlaylist(String[] users, String name){
		super(name);
		this.users= users;
	}
	
		/**
    * @return String[] return the users.
    */
	
	public String[] getUsers(){
		return users;
	}
	
	/**
	*@param users are the users to the set method.
	*/
	
	public void setUsers(String[] users){
		this.users=users;
	}
	
}
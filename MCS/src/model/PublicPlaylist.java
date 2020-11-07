package model;

public class PublicPlaylist extends Playlist{
	
	//ATTRIBUTES
	
	private double qualification;
	
	//BUILDER
	
	public PublicPlaylist(double qualification, String name){
		super(name);
		this.qualification=qualification;
	}
	
	/**
	*@return double return  the qualification.
	*/
	
	public double getQualification(){
		
		return qualification;
		
	}
	
	/**
	*@param qualification are the qualification to the set method.
	*/
	
	public void setQualification(double qualification){
		
		this.qualification=qualification;
		
	}
	
}
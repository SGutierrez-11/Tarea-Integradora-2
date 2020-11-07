package model;

public class PublicPlaylist extends Playlist{
	
	private double qualification;
	
	public PublicPlaylist(double qualification, String name){
		super(name);
		this.qualification=qualification;
	}
	
	public double getQualification(){
		
		return qualification;
		
	}
	
	public void setQualification(double qualification){
		
		this.qualification=qualification;
		
	}
	
}
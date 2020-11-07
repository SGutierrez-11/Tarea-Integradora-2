package model;

public class User{
	
	//ATTRIBUTES
	
	private String name;
	private String password;
	private int age;
	private int amountSongs;
	
	//RELATIONS
	
	private Category category;
	
	//BUILDER
	
	public User(String name, String password, int age){
		
		this.name=name;
		this.password=password;
		this.age=age;
		this.category=category.NEWBIE;
		this.amountSongs=0;
		
	}
	
	
	public String showUser(){
		
		String profile = "";
		
		profile+= "********** Usuario **********\n"+
                "** Nombre: "+name+"\n"+
                "** Edad: "+age+"\n"+
                "** Categoria: "+category+"\n"+
                "**************************\n";
		
		return profile;
		
	}
	
	/**
	*@return String return the name.
	*/
	
	public String getName(){
		return name;
	}
	
	/**
	*@param name are the name of the user.
	*/
	
	public void setName(String name){
		this.name=name;
	}
	
	/**
	*@return String return the password.
	*/
	
	public String getPassword(){
		return password;
	}
	
	/**
	*@param password are the password of the user.
	*/
	
	public void setPassword(String password){
		this.password=password;
	}
	
	/**
	*@return int return the age.
	*/
	
	public int getAge(){
		return age;
	}
	
	/**
	*@param age are the age of the user.
	*/
	
	public void setAge(int age){
		this.age=age;
	}
	
	/**
	*@return Category return the category.
	*/
	
	public Category getCategory(){
		return category;
	}
	
	/**
	*@param category are the category of the user.
	*/
	
	public void setCategory(Category category){
		this.category=category;
	}
	
	/**
	*@return int return the AmountSongs.
	*/
	
	public int getAmountSongs(){
		return amountSongs;
	}
	
	/**
	*@param amountSongs are the amount of the song.
	*/
	
	public void setAmountSongs(){
		this.amountSongs=amountSongs;
	}
	
	/**
	*param amountSongs is the sum of the songs.
	*/
	
	public void addSongs(){
		amountSongs++;
	}
	
	
}
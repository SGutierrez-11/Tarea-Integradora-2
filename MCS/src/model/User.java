package model;

public class User{
	
	private String name;
	private String password;
	private int age;
	private int amountSongs;
	
	private Category category;
	
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
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	
	public Category category(){
		return category;
	}
	public void setCategory(Category category){
		this.category=category;
	}
	
	
	public int getAmountSongs(){
		return amountSongs;
	}
	public void setAmountSongs(){
		this.amountSongs=amountSongs;
	}
	
	
	public void addSongs(){
		amountSongs++;
	}
	
	
}
package ui;

import model.*;

import java.util.Scanner;

public class Main{
	
	private MCS mcs;
	private Scanner sc;
	
	public Main(){
		sc = new Scanner(System.in);
		mcs = new MCS();
	}
	
	public static void main(String[] args){
		
		Main main = new Main();
		
		int option=0;
		
		do{
			option= main.showMenu();
			main.executeOption(option);
			
		}while(option!=0);
		
	}
	
	/**
	*this method is for show the menu.
	*<b> pre: </b>: Show the menu to the people.
	*@return int return the option.
	*/
	
	public int showMenu(){
		
		int option=0;
		
		System.out.println("¡Bienvenido al menu principal! \n"+
		"(1) Crear usuario. \n"+
		"(2) Crear playlist. \n"+
		"(3) Agregar cancion al pool. \n"+
		"(4) Mostrar usuarios. \n"+
		"(5) Mostrar canciones.\n"+
		"(0) Salir. \n");
		
		option = sc.nextInt();
		
		sc.nextLine();
		
		return option;
	}
	
	/**
	This method put the option that the user choose in the menu.
	*@param option is the option for the selection of the menu.
	*/
	
	
	public void executeOption(int option){
		
		switch(option){
			
			case 0:
			
			System.out.println("Hasta la proxima..!");
			
			break;
			
			case 1:
			
			addUser();
			
			break;
			
			case 2:
			
			addPlaylist();
		
			break;
			
			case 3:
			
			addSong();
			
			break;
			
			case 4:
			
			showUserList();
			
			break;
			
			case 5:
			
			showSongList();
			
			break;
			
		}
		
	}
	
	/**
	*<b> pre: </b>: add a new user for the program.
	*/
	
	
		public void addUser(){

        System.out.println("Ahora, ingresa los siguientes datos... ");
        System.out.print("Nombre de usuario: ");
				
        String name = sc.nextLine();
				
        System.out.print("Contraseña: ");
				
        String password = sc.nextLine();
				
        System.out.print("Edad: ");
				
        int age = sc.nextInt();
				
        sc.nextLine();
				
        mcs.addUser(name, password, age);
				
    }
		
		/**
		*<b> pre: </b>: add a new playlist for the program.
		*/
		
		
		    public void addPlaylist(){

        System.out.println("Ahora, ingrese lo siguiente...");

        System.out.print("Nombre de la playlist: ");
				
        String namePlaylist = sc.nextLine();
				
				System.out.println("Duración de la playlist (En segundos): ");
				
				int duration = sc.nextInt();
				
        mcs.addPlaylist(namePlaylist, duration);
    }
	
		/**
		*<b> pre: </b>: add a new song for the program.
		*<b> pos: </b>: Choose the user that is choosing the song and select the genre.
		*/
		
		
		public void addSong(){

        System.out.println("Ahora bien, ingresa los siguientes campos...");
        int pos = whoUser();
        System.out.print("Titulo de la cancion: ");
        String title = sc.nextLine();
        System.out.print("Artista/Banda: ");
        String artist = sc.nextLine();
        System.out.print("Fecha de lanzamiento: ");
        String release = sc.nextLine();
        System.out.print("Minutos: ");
        int minutes = sc.nextInt();
        sc.nextLine();
        System.out.print("Segundos: ");
        int seconds = sc.nextInt();
        sc.nextLine();
        int duration = (minutes*60)+seconds;
        String genre = chooseGenre();
        mcs.addSong(pos, title, artist, release, duration, genre);
    }
		
		/**
		*<b> pre: </b>: choose a genre for the program.
		*/

    public String chooseGenre(){
        String genre = "";
        System.out.println("Escoga el genero de la cancion: \n");
        System.out.print("(1) Rock. \n"+
                         "(2) Hip hop. \n"+
                         "(3) Classic. \n"+
                         "(4) Reggae. \n"+
                         "(5) Salsa. \n"+
                         "(6) Metal. \n");
												 
        int option3 = sc.nextInt();
				
        sc.nextLine();
				
        switch(option3){
            case 1:
                genre = "ROCK";
            break;
            case 2:
                genre = "HIP_HOP";
            break;
            case 3:
                genre = "CLASSIC";
            break;
            case 4:
                genre = "REGGAE";
            break;
            case 5:
                genre = "SALSA";
            break;
            case 6:
                genre = "METAL";
            break;
        }
        return genre;
    }
		
		/**
		*<b> pre: </b>: select the user who is adding.
		*/
		
		
		public int whoUser(){
			
        System.out.println("Seleccione el usuario que esta usando: ");
				
        System.out.print(mcs.showUsersName());
        
				int pos = sc.nextInt();
        
				sc.nextLine();
        
				return pos;
    }
		
		/**
		*<b> pre: </b>: show the list of the users.
		*/

		public void showUserList(){
        System.out.print(mcs.showUsers());
    }
		
		/**
		*<b> pre: </b>: show the list of the songs.
		*/
		
		public void showSongList(){
        System.out.print(mcs.showSongs());
    }
}
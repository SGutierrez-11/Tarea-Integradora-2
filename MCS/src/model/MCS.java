package model;

public class MCS{
	
	public static final int MAX_USERS=10;
	public static final int MAX_PLAYLISTS=20;
	public static final int MAX_SONGS=30;
	
	
	
	private User[] users;
	private Song[] songs;
	private Playlist[] playlists;
	
	public MCS(){
		
		this.users= new User[MAX_USERS];
		this.songs= new Song[MAX_SONGS];
		this.playlists= new Playlist[MAX_PLAYLISTS];
		
	}
	
		public void addUser(String name, String password, int age){
        int pos = 0;
        boolean out = false;
        for(int i = 0; i<MAX_USERS && out == false; i++){
            if(users[i] == null){
                pos = i;
                out = true;
            }
        }
        users[pos] = new User(name, password, age);
    }
   
		public String showUsers(){
        String msg = "\n ------------- Usuarios -------------\n \n";
        for(int i = 0; i<amountUsers(); i++){
            msg += users[i].showUser() + "\n";
        }
        return msg;
    }

    public String showUsersName(){
        String msg = "\n ------------- Usuarios -------------\n \n";
        for(int i = 0; i<amountUsers(); i++){
            msg += (i+1) + ". " + users[i].getName() + "\n";
        }
        return msg;
    }

    public void addSong(int posUser, String title, String artist, String release, int duration, String genre){
        int pos = 0;
        boolean out = false;
        for(int i = 0; i<MAX_SONGS && out == false; i++){
            if(songs[i] == null){
                pos = i;
                out = true;
            }
        }
        songs[pos] = new Song(title, artist, release, duration, genre);
        users[posUser-1].addSongs();
        switch(users[posUser-1].getAmountSongs()){
            case 3:
                users[posUser-1].setCategory(Category.LITTLE_CONTRIBUTOR);
            break;
            case 10:
                users[posUser-1].setCategory(Category.MILD_CONTRIBUTOR);
            break;
            case 30:
                users[posUser-1].setCategory(Category.STAR_CONTRIBUTOR);
        }
    }

    public String showSongs(){
        String msg = "\n ------------- Canciones -------------\n \n";
        for(int i = 0; i<amountSongs(); i++){
            msg += songs[i].showSong() + "\n";
        }
        return msg;
    }

    public void addPlaylist(String namePlaylist, int duration){
        int pos = 0;
        boolean out = false;
        for(int i = 0; i<MAX_PLAYLISTS && out == false; i++){
            if(playlists[i] == null){
                pos = i;
                out = true;
            }
        }
        playlists[pos] = new Playlist(namePlaylist);
    }
	
	

		public boolean spaceUser(){
        boolean spaceU = false;
        for(int i = 0; i<MAX_USERS && spaceU == false; i++){
            if(users[i] == null){
                spaceU = true;
            }
        }
        return spaceU;
    }

		public int amountUsers(){
        int amountU = 0;
        for(int i = 0; i<MAX_USERS; i++){
            if(users[i] != null){
                amountU++;
            }
        }
        return amountU;
    }
	
	
		public boolean spaceSongs(){
        boolean spaceS = false;
        for(int i = 0; i<MAX_SONGS && spaceS == false; i++){
            if(songs[i] == null){
                spaceS = true;
            }
        }
        return spaceS;
    }

		public int amountSongs(){
        int amountS = 0;
        for(int i = 0; i<MAX_SONGS; i++){
            if(songs[i] != null){
                amountS++;
            }
        }
        return amountS;
    }
		
		public boolean spacePlaylists(){
        boolean spaceP = false;
        for(int i = 0; i<MAX_PLAYLISTS && spaceP == false; i++){
            if(playlists[i] == null){
                spaceP = true;
            }
        }
        return spaceP;
    }

    public int amountPlaylists(){
        int amountP = 0;
        for(int i = 0; i<MAX_PLAYLISTS; i++){
            if(playlists[i] != null){
                amountP++;
            }
        }
        return amountP;
    }
		
}
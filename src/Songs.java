
public class Songs {
	private String title ;
	private String artist ;
	private String album ;
	private String composer ;
	private int year ;
	private int track ;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public Songs(String title,String artist,String album, String composer, int year, int track ){
		this.title =title;
		this.artist =artist;
		this.album =album;
		this.composer =composer;
		this.year=year;
		this.track =track;
		
	}
	
	public Songs(String title, String artist){
		this(title, artist, "","",0,0);
	}

	
	public void show(){
		System.out.println(getArtist() + " " + getTitle() + " ( " + getAlbum() + ", "  +getYear()+ ", " +getTrack() + "번 track, "+ getComposer() + "작곡 )") ;
		
	}
	
	
}

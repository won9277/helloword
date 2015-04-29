
public class Songsmain {

	public static void main(String[] args) {
		/*Songs ss = new Songs();
		
		ss.setAlbum("Real");
		ss.setArtist("아이유");
		ss.setComposer("이민수");
		ss.setTitle("좋은날");
		ss.setTrack(3);
		ss.setYear(2010);*/
		
		
		Songs a = new Songs("Real","아이유","이민수" , "좋은나", 3,2010);
		a.show();
		Songs b = new Songs("러빋ㅇ유","씻타"," " , "null", 0,0);
		b.show();
		Songs c = new Songs("여수밤바다","벜벜","" , "", 0 ,2010);
		c.show();

	}

}

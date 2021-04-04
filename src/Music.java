
public class Music 
{
	int num;
	String title;
	String singer;
	String album;
	
	public Music() 
	{
		
	}
	
	public Music(int num)
	{
		this.num = num;
	}
	
	public Music(String title, String singer, String album)
	{
		this.title = title;
		this.singer = singer;
		this.album = album;
	}
	
	public void printInfo()
	{
		System.out.println("노래 제목 : "+title);
		System.out.println("가수 : "+singer);
		System.out.println("앨범 : "+album);
	}
}

package javaexercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MusicShop {
	public static void main(String[] args)throws IOException{
		while(true)
		{
			login();
			
			int choice=Integer.parseInt(getStr());
			if(choice==0)
			{
				break;
			}else
			{
				Choice(choice);
			}
			
			
			
		}
		System.out.println("欢迎下次光临！");
	}
	
	public static void  login()
	{
		
		System.out.println(loginStr1);
		System.out.println(loginStr2);
		System.out.println(loginStr3);
		System.out.println(loginStr4);

	}
	public static void Choice(int choiceNum) throws IOException
	{
		switch(choiceNum)
		{
		case 1:
			System.out.print("请输入专辑名称：");
			String albumName=getStr().toString();
			if(SearchAlbum(albumName)!=null)
				System.out.println(SearchAlbum(albumName).toString());
			else
				System.out.println("这张专辑无货");
			break;
		case 2:
			System.out.print("请输入歌曲名称：");
			String songName=getStr().toString();
			if(SearchSong(songName)!=null)
			{
				System.out.println(SearchSong(songName).toString());
			}else
				System.out.println("歌曲不存在");
			break;
		case 3:
			System.out.print("请输入购买专辑名称：");
			String buyAlbum=(String)getStr();
			System.out.println("请输入购买数量:");
			int numAlbum=System.in.read();
			double sumPrice =SearchAlbum(buyAlbum).getPrice()*numAlbum;
			System.out.println("总价："+sumPrice+" $");
			break;
		case 4:
			System.out.println("歌曲名称：");
			String songName4=getStr().toString();
			System.out.println("歌手：");
			String singer4=getStr().toString();
			System.out.println("单曲价格：");
			double price4=Double.parseDouble(getStr());
			AddSongs(songName4,singer4,price4);
			break;
		}
	}
	
	public static String getStr() throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String str=buf.readLine();
		return str;
	}
	/*查找专辑*/
	public static Album SearchAlbum(String albumName)
	{
		if(albumStore.containsKey(albumName))
		{			
			return albumStore.get(albumName);
		}else
			return null;
	}
	
	public static Songs SearchSong(String songName)
	{
		for(int i=0;i<songsList.size();i++)
		{
			if (songsList.get(i).getName().equals(songName)) {

				return songsList.get(i);
			} 
		}
		return null;
	}
	
	public static void AddSongs(String songName,String singer,double price)
	{
		Songs newSong=new Songs(songName,singer,price);
		songsList.add(newSong);
	}

	private static String loginStr1="1.查询专辑";
	private static String loginStr2="2.查询歌曲";
	private static String loginStr3="3.购买专辑";
	private static String loginStr4="4.新增歌曲";
	private static Map<String,Album> albumStore=new HashMap<String,Album>();
	private static ArrayList<Songs> songsList=new ArrayList<Songs>();
}

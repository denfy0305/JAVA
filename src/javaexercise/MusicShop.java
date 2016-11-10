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
		System.out.println("��ӭ�´ι��٣�");
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
			System.out.print("������ר�����ƣ�");
			String albumName=getStr().toString();
			if(SearchAlbum(albumName)!=null)
				System.out.println(SearchAlbum(albumName).toString());
			else
				System.out.println("����ר���޻�");
			break;
		case 2:
			System.out.print("������������ƣ�");
			String songName=getStr().toString();
			if(SearchSong(songName)!=null)
			{
				System.out.println(SearchSong(songName).toString());
			}else
				System.out.println("����������");
			break;
		case 3:
			System.out.print("�����빺��ר�����ƣ�");
			String buyAlbum=(String)getStr();
			System.out.println("�����빺������:");
			int numAlbum=System.in.read();
			double sumPrice =SearchAlbum(buyAlbum).getPrice()*numAlbum;
			System.out.println("�ܼۣ�"+sumPrice+" $");
			break;
		case 4:
			System.out.println("�������ƣ�");
			String songName4=getStr().toString();
			System.out.println("���֣�");
			String singer4=getStr().toString();
			System.out.println("�����۸�");
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
	/*����ר��*/
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

	private static String loginStr1="1.��ѯר��";
	private static String loginStr2="2.��ѯ����";
	private static String loginStr3="3.����ר��";
	private static String loginStr4="4.��������";
	private static Map<String,Album> albumStore=new HashMap<String,Album>();
	private static ArrayList<Songs> songsList=new ArrayList<Songs>();
}

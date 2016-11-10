package javaexercise;
import java.util.*;

public class Album {
	public Album()
	{
		
	}
	
	public void setAlbumName(String name)
	{
		this.albumName=name;
	}
	
	public void addAlbumSongs(Songs x)
	{
		albumSongs.add(x);
	}
	
	public String getAlbumName()
	{
		return this.albumName;
	}
	
	public double getPrice()
	{
		double sumPrice=0.0;
		for(int i=0;i<albumSongs.size();i++)
		{
			sumPrice+=albumSongs.get(i).getPrice();
		}
		return sumPrice;
	}
	
	public String toString()
	{
		StringBuffer str=new StringBuffer("");
		str.append(albumName+"| ");
		for(int i=0;i<albumSongs.size();i++)
		{
			str.append(albumSongs.get(i).getName()+"| ");
		}
		return str.toString();
	}
	
	/*
	 * instance variables */
	private String albumName;
	private ArrayList<Songs> albumSongs;

}

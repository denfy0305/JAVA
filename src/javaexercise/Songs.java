package javaexercise;
/**
 * 歌曲类  显示歌曲的详细信息  歌曲名字，歌手以及价格*/
public class Songs {
	public Songs(String name,String singer,double price)
	{
		this.name=name;
		this.singer=singer;
		this.price=price;
	}
	public void setPrice(double newPrice){
		this.price=newPrice;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getSinger()
	{
		return this.singer;
	}
	
    public double getPrice()
    {
    	return this.price;
    }
	public String toString(){
		return ("\""+name+"| "+singer+"| "+price+"$\"");
	}
	
	private String name;
	private String singer;
	private double price;
	
}

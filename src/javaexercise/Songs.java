package javaexercise;
/**
 * ������  ��ʾ��������ϸ��Ϣ  �������֣������Լ��۸�*/
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

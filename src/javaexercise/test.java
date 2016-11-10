package javaexercise;
import java.util.*;
import java.io.*;
import java.security.MessageDigest;
public class test {

	public final static String[] hexDigits={
			"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"
	};
	
	public static String createPassword(String inputString){
		return encodeByMD5(inputString);
	}
	
	public static boolean authenticatePassword(String password,String inputString){
		if(password.equals(encodeByMD5(inputString))){
			return true;
		}else 
			return false;
	}
	
	private static String encodeByMD5(String originString){
		if(originString!=null)
		{
			try{
				MessageDigest md=MessageDigest.getInstance("MD5");
				byte[] results=md.digest(originString.getBytes());
				String resultString=byteArrayToHexString(results);
				return resultString.toUpperCase();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return null;
	}
	
	private static String byteArrayToHexString(byte[] b){
		StringBuffer resultsb=new StringBuffer();
		for(int i=0;i<b.length;i++)
		{
			resultsb.append(byteToHexString(b[i]));
		}
		return resultsb.toString();
	}
	
	private static String byteToHexString(byte b)
	{
		int n=b;
		if(n<0)
			n=256+n;//???why
		int d1=n/16;
		int d2=n%16;
		return hexDigits[d1]+hexDigits[d2];
	}
	public static void main(String[] args) throws IOException
	{
		/*while(true)
		{*/
			//System.out.print("ÇëÊäÈë×Ö·û´®£º");
			//BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			//String str = buf.readLine();
			//int i=Integer.parseInt(str);
			int mathnum=2;
			int x=mathnum<<2;
			/*if(str.equals("exit"))
				break;*/
			System.out.println(x);
			String password=test.createPassword("888888");
			System.out.println("888888¼ÓÃÜºó"+password);
			
		//}
		
	}
}

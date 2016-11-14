package javaexercise;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.omg.CORBA_2_3.portable.InputStream;
import org.omg.CORBA_2_3.portable.OutputStream;

public class exercise1112 {
	
	public static class Annoyance extends Exception{ public Annoyance()
		{
		   System.out.println("AAAAAA");
		};
		}
	public  static class Sneeze extends Annoyance{}; //serialVersionUID作用：  序列化时为了保持版本的兼容性，即在版本升级时反序列化仍保持对象的唯一性。 
	public static class Bneeze extends Sneeze{};
	
/*	private static class MyTask implements Callable<Integer>
	{
		private int upperBounds;
		public MyTask(int upperBounds){
			this.upperBounds=upperBounds;
		}
		
		@Override
		public Integer call() throws Exception{
			int sum=0;
			for(int i=0;i<upperBounds;i++){
				sum+=i;
			}
			return sum;
		}
	}*/
	
	public static void fileCopy(String source,String target) throws IOException{
		try(FileInputStream in=new FileInputStream(source)){
			try(FileOutputStream out=new FileOutputStream(target)){
				byte[] buffer=new byte[4096];
				int bytesToRead;
				while((bytesToRead=in.read(buffer))!=-1){
					out.write(buffer, 0, bytesToRead);
				}
			}
	
		}catch(IOException ex)
		{
			System.out.println(ex.getStackTrace());
		}
	}
	public static void main(String[] args) throws Exception{
		/*LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt.getYear());
		System.out.println(dt.getMonth());
		System.out.println(dt.getMonthValue());
		
		DateTimeFormatter newFormatter=DateTimeFormatter.ofPattern("yyyy/MM/dd/hh:mm:ss");
		System.out.println(dt.format(newFormatter));
		
		LocalDateTime yesday=dt.minusDays(1);
		System.out.println(yesday.format(newFormatter));*/
		
	/*	try{
			try{
				throw new Bneeze();
			}catch(Annoyance a){  //抛出异常的子类时，  子类和父类异常同等对待
				Exception e=new Exception();
				System.out.println("Caught Annoyance!");
				throw  e;			
			}
		}catch(Sneeze s) 
		{
			System.out.println("Caught Sneeze!");
			return;
		}finally
		{
			System.out.println("Hello World!");
		}*/
		
		/*Set<Student> set=new TreeSet<>();
		set.add(new Student("YYH",28));
		set.add(new Student("DF",26));
		set.add(new Student("GY",27));
		
		for(Student str:set)
		{
			System.out.println(str);
		}*/
		
	/*	List<Future<Integer>> list=new ArrayList<>();
		ExecutorService service=Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++)
		{
			list.add(service.submit(new MyTask(100)));
			
		}
		
		int sum=0;
		for(Future<Integer> future:list)
		{
			sum+=future.get();
			System.out.println(sum);
		}
		
		System.out.println(sum);
		service.shutdown();*/
		
	/*	File f=new File("/D:/JAVA");
		for(File temp:f.listFiles())
		{
			if(temp.isFile()||temp.isDirectory())
				System.out.println(temp.getName());
			
		}*/
		/*
		String str="北京市(朝阳区)(西城区)(海淀区)";
		Pattern p=Pattern.compile(".*?(?=\\()");
		Matcher m=p.matcher(str);
		if(m.find())
		{
			System.out.println(m.group());
		}
		
		String x=String.class.newInstance();
		x="hello";
		System.out.println(x);*/
		
		/*Object ob=new Object();  //未解决问题
		Songs x=new Songs(ob,"wb",0.99);
		Object y=ReflectionUtil.getValue(x.name, "x.singer");
		System.out.println(y.toString());*/
		
		String str="hello";
		Method m=str.getClass().getMethod("toUpperCase");
		System.out.println(m.invoke(str));
		
		Comparator<Integer> cmp=new Comparator<Integer>(){
			public int compare(Integer x,Integer y)
			{
				if(x<y)
					return 1;
				return 0;
			}
			
		};
	
		Integer[] x={
				9,2,8,5,7,3};
		List<Integer[]> il=new ArrayList<Integer[]>();
		il.add(x);
		BubbleSort x1=new BubbleSort();
		x1.sort(x,cmp);
		for(Integer y:x)
		   System.out.println(y);
		
		/*Integer[] qsortArray={9,34,6,2,14,0};
		QuickSort qs=new QuickSort();
		qs.qSort(qsortArray, 0, qsortArray.length-1);
		for(Integer x:qsortArray)
			System.out.print(x+" ");*/
		
		
	}
	

}

package javaexercise;

import java.util.*;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionUtil {
	private ReflectionUtil(){
		throw new AssertionError();
	}
	
	public static Object getValue(Object target,String fieldName){
		Class<?> clazz=target.getClass();
		String[] fs=fieldName.split("\\.");
		
		try{
			for(int i=0;i<fs.length-1;i++)
			{
				Field f=clazz.getDeclaredField(fs[i]);
				f.setAccessible(true);
				target=f.get(target);
				clazz=target.getClass();
			}
			
			Field f=clazz.getDeclaredField(fs[fs.length-1]);
			f.setAccessible(true);
			return f.get(target);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public static void setValue(Object target,String fieldName,Object value)
	{
		Class<?> clazz=target.getClass();
		String[] fs=fieldName.split("\\.");
		
		try
		{
			for(int i=0;i<fs.length-1;i++)
			{
				Field f=clazz.getDeclaredField(fs[i]);
				f.setAccessible(true);
				Object val=f.get(target);
				if(val==null)
				{
					Constructor<?> c=f.getType().getDeclaredConstructor();
					c.setAccessible(true);
					val=c.newInstance();
					f.set(target, val);
				}
				target=val;
				clazz=target.getClass();
			}
			
			Field f=clazz.getDeclaredField(fs[fs.length-1]);
			f.setAccessible(true);
			f.set(target, value);
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}

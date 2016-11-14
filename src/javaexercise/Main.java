package javaexercise;

public class Main {
	public void test(Object o) {
		System.out.println("Object");
	}
	public void test(String s) {
		System.out.println("String");
	}
	public static void main(String[] args) {
		Main that = new Main();
		that.test(null);
		
	    String a = "abc";
        String b = "ab" + "c";
        String c=new String("abc");
        System.out.println(a == c);
        System.out.println(a.hashCode());
        System.out.println(c);
	}
}
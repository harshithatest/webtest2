package Java.test;

public class MirrorImage {
	
		  public static void main(String[] args) {

		    String str = "Radhar";
		    String str2=str.toLowerCase();
		    int strlen = str2.length();
		    
		   String rev= new String("");
		    for(int i=(strlen-1); i>=0; --i) {
		    	rev=rev+str2.charAt(i);
		    }
		    if(rev.equals(str2)) {
		    System.out.println(str2);
		    
		    }else {
		    	System.out.println("no equal");
		    }
		  }}
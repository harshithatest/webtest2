package Java.test;

public class RevEachWord {

	public static void main(String[] args) {
		//hello world - dleow olleh
 String str= "hello world", rev="";//original string
 for(int i =(str.length()-1); i>=0; i--) {
	 rev+=str.charAt(i);
	
 }
 System.out.println(rev);
 
	
	
	//welcome to java = emoclew ot avaj 
	String str2= "welcome to java", rev2="";
	//spliting string into words
	String word[]= str2.split(" ");
	
	for(String w:word) //storing splitted words into string w
	{
		String revstr="";
		for(int j=(w.length()-1); j>=0; j--){
			revstr+=w.charAt(j);//emoclew
		}
		
		//rev2+=revstr+ " ";
		System.out.print(revstr+" ");//more efficient
	}
		//System.out.print(rev2);//more flexible
	
	}
}

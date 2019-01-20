package communityuni.com;

import java.util.StringTokenizer;

public class Bài1 {
	// Cách 1
/*
	  public static String timChuoi(String s) {	  
		  int vtCuoi1 = s.lastIndexOf("/"); 
		  int vtCuoi2 = s.lastIndexOf(".") ; 
		  String s1 = s.substring(vtCuoi1+1,vtCuoi2); 
		  return s1 ; 
	  }
*/

	public static void main(String[] args) {
		// Của Cách 1
/*
		  String s = "D:/music/bolero/longme.mp3"; String s1 = timChuoi(s);
		  System.out.println(s1);
*/
		String s = "D:/music/bolero/longme.mp3" ;
		// Cách 2
/*		
		 StringTokenizer token = new StringTokenizer(s,"/");
		 while(token.hasMoreTokens()) { 
		 String value = token.nextToken();
		  if(value.equals("longme.mp3")) 
		  	System.out.println(value); 
		  }
*/ 
		// Cách 3
		String[] arr = s.split("\\/");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("longme.mp3"))
				System.out.println(arr[i]);
		}
		for(String x : arr) {
			if(x.equals("longme.mp3")) {
				System.out.println(x);
			}else if(x.equals("longme")) {
				System.out.println(x);
			}
		}
	}
}

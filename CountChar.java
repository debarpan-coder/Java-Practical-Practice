import java.util.*;

class CountChar{
	public static void main(String [] args){
		String sen = "Mr. Suvendu Chowdhury";
		for(int i=0;i<sen.length();i++){

			char temp = sen.charAt(i);
			int c=0;

			for(int j=0;j<sen.length();j++){
				if(temp==sen.charAt(j)){
					c++;
				}
			}
			System.out.println("Character : "+temp + "	Frecuency is : "+c);
		}
		//System.out.println(sen);
		
	}
}
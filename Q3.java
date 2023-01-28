import java.util.*;
public class Q3{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		StringBuffer st=new StringBuffer();
		System.out.println("Input string is : " + str);
		for (int i=0 ; i < str.length(); i++){
			if (str.charAt(i)=='a' || str.charAt(i) == 'A'){
				st.append(str.charAt(i));
			}else if (str.charAt(i)=='e' || str.charAt(i) == 'E'){
				st.append(str.charAt(i));
			}else if (str.charAt(i)=='i' || str.charAt(i) == 'I'){
				st.append(str.charAt(i));
			}else if (str.charAt(i)=='o' || str.charAt(i) == 'O'){
				st.append(str.charAt(i));
			}else if (str.charAt(i)=='u' || str.charAt(i) == 'U'){
				st.append(str.charAt(i));
			}else if (str.charAt(i)==' ' || str.charAt(i)=='.' || str.charAt(i)==','){
				st.append(str.charAt(i));
			}
		}
		System.out.println("The resultant string is : \n"+st);
	}
}
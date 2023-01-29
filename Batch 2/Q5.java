import java.util.*;
class Q5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence ");
		String str= sc.nextLine();
		sc.close();
		int size=str.length();
		String[][] arr=new String[size][2];
		for(int i=0;i<size;i++){
			arr[i][1]="0";
		}
		int indx=0;
		arr[indx][0]=String.valueOf(str.charAt(0));
		outer:
		for (int i=0; i<str.length();i++){
			char temp=str.charAt(i);
			for (int k=0;k<indx;k++){
				if (arr[k][0].charAt(0)==temp && Integer.parseInt(arr[k][1])>1){
					continue outer;
				}
			}
			arr[indx][0]=String.valueOf(temp);
			int f=0;
			for (int j=0;j<size;j++){
				if (temp==str.charAt(j)){
					f++;
				}
			}
			arr[indx][1]=String.valueOf(f);
			indx++;
		}
		for(String[] d:arr){
			if (Integer.parseInt(d[1])>0){
				System.out.println(d[0]+" Occurs " +d[1]+" times ");
			} 
		}
	}
}
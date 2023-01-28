import java.util.*;

class Node{
	int data;
	Node Next;

}

class LinklistSuv{
	public static LinkedList<Integer> traverse(Node start){
		LinkedList<Integer> l = new LinkedList<>();
		while(start!=null){
			l.add(start.data);
			System.out.print(start.data+" ");
			start=start.Next;
		}
		System.out.println();
		return l;
	}

	public static void reverseLinklist(LinkedList<Integer> l){
		for(int i=l.size()-1;i>=0;i--){
			System.out.print(l.get(i)+" ");
		}		
	}
}


class Test{
	public static void main(String [] suv){
		Node head = new Node(); 
		Node n1 = new Node(); 
		Node n2 = new Node(); 
		Node n3 = new Node(); 

		head.data=10;
		head.Next=n1;

		n1.data=20;
		n1.Next=n2;

		n2.data=30;
		n2.Next=n3;

		n3.data=40;
		n3.Next=null;

		System.out.println("Linklist element are :");
		LinkedList<Integer> l = LinklistSuv.traverse(head);

		System.out.println("Reverse Linklist element are :");
		LinklistSuv.reverseLinklist(l);
	}
}
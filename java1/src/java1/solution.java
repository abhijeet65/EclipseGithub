package java1;
import java.util.*;

import java.util.Deque;
import java.util.LinkedList;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList<missedCall> queue = new LinkedList<missedCall>()
				  {
			private static final long serialVersionUID = -6707803882461262867L;

            public boolean add(missedCall object) {
                boolean result;
                if(this.size() < 2)
                    result = super.add(object);
                else
                {
                    super.removeFirst();
                    result = super.add(object);
                }
                return result;
            }
        };
				  LinkedList<missedCall> queue1 = new LinkedList<missedCall>()
						  {
						private static final long serialVersionUID = -6707803882461262867L;

			            public boolean add(missedCall object) {
			                boolean result;
			                if(this.size() < 2)
			                    result = super.add(object);
			                else
			                {
			                    super.removeFirst();
			                    result = super.add(object);
			                }
			                return result;
			            }
			        };
		System.out.println("Welcome to Phonebook\n");
		
		int n=1;	  
		while(n==1)
		{
			System.out.println("entre the phne number ");
			int num=sc.nextInt();
			System.out.println("Enter the time of call");
			int t=sc.nextInt();
			System.out.println("Entre the origin");
			String ori=sc.next();
			System.out.println("Entre the name of caller");
			String name=sc.next();
			queue.addFirst(new missedCall(t, ori, name, num));
			
			System.out.println("Wnt more missed_calls?? \n1:yes 2:no\n");
			n=sc.nextInt();
		}
		
		System.out.println("\n---------------service missed call list--------------------------\n");
		while(queue.peekLast()!=null)
		{
			System.out.println(queue.peekLast());	
			System.out.println("Entre the choice\n1:delete_call\t2:next_call\t3:display_details");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("deleted"+queue.pollLast());break;
			case 2:System.out.println("moving to next entry->");
					queue1.addFirst(queue.pollLast());break;
			case 3:System.out.println(queue.peekLast());
					queue1.addFirst(queue.pollLast());break;
			default:System.out.println("enter the valid choice");
			}
		}
		System.out.println("want to print the final-> 1:yes \n----------------\n");
		if(sc.nextInt()==1){
		Helper h =new Helper();
		h.print(queue1);
		}
	}

}

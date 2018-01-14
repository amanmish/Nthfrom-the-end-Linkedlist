import java.util.*;
import java.io.*;
class nthfromend
{
	static Scanner sc=new Scanner(System.in);
	node head;
	node ptr,ptr1;
	class node
	{
		int d;
		node next;
		node()
		{
		}
		node(int data)
		{
			d=data;
			next=null;
		}
			
	}
	 void print()
	 {
		ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.d+" ");
			ptr=ptr.next;
		}
		System.out.println();
	 }
	 
	 public void append(int newdata)
	 {
		 node app=new node(newdata);
		 if (head == null)
         {
            head = new node(newdata);
            return;
         }
 
		 ptr=head;
		 while(ptr.next!=null)
		 {
			 ptr=ptr.next;
		 }
		 ptr.next=app;
	 }
	 public void fromend()
	 {
		 System.out.println("enter the nth from end");
		 int n=sc.nextInt();
		 int i;
		 ptr=head;
		 ptr1=head;
			 for(i=0;i<n;i++)
			 {
				 if(ptr==null)
                 {
					System.out.println(n+"is greater than the no. of "+"nodes in list");
					return;
				 }
				 ptr=ptr.next;
			 }
			 while(ptr!=null)
			 {
				 ptr1=ptr1.next;
				 ptr=ptr.next;
			 }
		 System.out.print(ptr1.d);
	 }
	 public static void main(String ar[])
	 {
		 nthfromend a=new nthfromend();
		 int i=0;
		 System.out.println("enter the number of element you want to store into linkedlist");
		 int n=sc.nextInt();
		 while(i<n)
		 {
		 System.out.println("enter the value");
		 int s=sc.nextInt();
		 a.append(s);
		 i++;
		 }
		 a.print();
		 a.fromend();
		 
	 }
}
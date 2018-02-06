package stalink;
class node{
	int v;
	node next;
}
class stack{
	node head=null;
	//node tail=null;
	public void push(int k)
	{   
		node a=new node();
		a.v=k;
		a.next=null;
		if(head==null)
		{
			head=a;
			
			
	
		}
		else 
		{
	a.next=head;
	head=a;
		}
		
	}
	public void pop()
	{
	if(head.next==null)
	{
		head=null;
	 
	}
	else
	{
		head=head.next;
	}
	}
	public void print()
	{
		node t=head;
		while(t!=null)
		{
			
			System.out.print(t.v);
			t=t.next;
			}
	}
}

public class slink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s=new stack();
		s.push(1);
		s.push(2);
        s.print();
	}

}

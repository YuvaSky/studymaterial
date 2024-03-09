import java.util.NoSuchElementException;

//Object of list class will be used by program as a list collection
public class MyLinkedList 
{
	private Node first=null;//MyLinkedList will keep reference of first node into variable first
	private Node last=null;//MyLinkedList will keep reference of last node into variable last
	
	public void add(String str)
	{
		//Code to create node
		Node newnode=new Node(str);
		//code to add node in list
		//before adding node into list check whether list is empty or not
		//if list is empty then make it first node as well as last node
		if(first==null)//When list is empty
		{
			first=newnode;
			last=newnode;
			return;
		}
		//code to add node at end of list
		last.next=newnode;
		newnode.prev=last;
		last=newnode;
	}
	public void addLast(String str)
	{
		add(str);
	}
	public void addFirst(String str)
	{
		Node newnode=new Node(str);
		if(first==null)//when list is empty
		{
			first=newnode;
			last=newnode;
			return;
		}
		//Code to add node at beginning of the list
		first.prev=newnode;
		newnode.next=first;
		first=newnode;
	}
	public void add(int index,String str)
	{
		int x=size();
		if(index>x || index<0)
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+x);
		if(index==0)//Make it first node
		{
			addFirst(str);
			return;
		}
		if(index==x)//Make it last node
		{
			addLast(str);
			return;
		}
		//Code to find reference of nodes between which this node will be added
		Node newnode=new Node(str);
		Node b1=first;
		for(int c=1;c<index;c++)
		{
			b1=b1.next;
		}
		Node b2=b1.next;
		b1.next=newnode;
		newnode.prev=b1;
		newnode.next=b2;
		b2.prev=newnode;
	}
	public void removeFirst()
	{
		if(first==null)
			throw new NoSuchElementException();
		if(size()==1)//when list has only one element
		{
			first=null;
			last=null;
			return;
		}
		first.next.prev=null;
		Node temp=first.next;
		first.next=null;
		first=temp;
	}
	public int size()
	{
		Node cur=first;
		int count=0;
		while(cur!=null)
		{
			count++;
			cur=cur.next;
		}
		return count;
	}
	public void showList()
	{
		Node cur=first;
		while(cur!=null)
		{
			System.out.println(cur.element);
			cur=cur.next;
		}
	}
}

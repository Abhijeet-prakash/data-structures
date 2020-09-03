

class Node
{
 int data;
 Node next;
}
public class LinkedList
{
public Node head;
public void insertAtHead(int data)
{
Node n=new Node();
n.data=data;
n.next=null;

if(head==null)
{
head=n;
}
else
{
n.next=head;
head=n;
}
}

public void prints()
{
 Node temp=head;
 if(temp==null)
 {
System.out.println("no elements");
return;
}
reversePrint(temp); 
}
public void reversePrint(Node temp)
{
 if(temp==null)
  return;
  reversePrint(temp.next);
 System.out.println(temp.data+" ");

}

public String toString()
{
Node temp=head;
if(temp==null)
{
return "no elements";
}
else
{
String s="";
while(temp!=null)
{
s=s+temp.data+" ";
temp=temp.next;
}
return s;
}

}




public void insertAtTail(int data)
{
Node n=new Node();
n.data=data;
n.next=null;

if(head==null)
{
head=n;
}
else
{
Node temp;
temp=head;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=n;
}

}

public void insertAtPos(int index,int data)
{
int len=size();
if(index==0)
{
insertAtHead(data);
}
else if(index==len)
{
insertAtTail(data);
}
else
{
int count=0;
Node temp,temp1;
Node n=new Node();
n.data=data;
n.next=null;

temp=head;
for(;count<index-1;count++)
{
temp=temp.next;
}
temp1=temp.next;
temp.next=n;
n.next=temp1;
}

}


public int size()
{
int i=1;
Node temp;
temp=head;
if(head==null)
{
return 0;
}
else
{
while(temp.next!=null)
{
i++;
temp=temp.next;
}
return i;
}
}

public void display()
{
Node temp;
temp=head;
if(head==null)
System.out.println("no elements");
else 
{
while(temp.next!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
System.out.println(temp.data);
}
}

public void removeHead()
{
if(head==null)
{
System.out.println("no elements");
}
else {
head=head.next;
}

}

public void removeTail()
{
if(head==null)
{
System.out.println("no elements");
}
else if(head.next==null)
{
head=null;
}
else 
{
Node temp=head;
int length=size();
for(int i=1;i<length-1;i++)
{
temp=temp.next;
}
temp.next=null;
}
}

public void removePos(int index)
{
Node temp,temp1;
if(index==0)
{
temp=head;
head=temp.next;

}
else
{
temp=head;
for(int i=0;i<index-1;i++)
{
temp=temp.next;
}
temp1=temp.next;
temp.next=temp1.next;
}
}
}



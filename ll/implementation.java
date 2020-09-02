
import java.io.*;
class implementation
{
public static void main(String args[])
{

int value,index,length;
System.out.println("implementation of linked list:-");
LinkedList list=new LinkedList();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try
{
while(true)
{
System.out.println("1.insertAtHead 2.insertAtTail 3.insertAtPos(index,data) 4.size 5.exit 6.display 7.removeHead 8.removeTail 9.removePos(index)");
int n=Integer.parseInt(br.readLine());
switch(n)
{
case 1:System.out.println("enter value");
       value=Integer.parseInt(br.readLine());       
       list.insertAtHead(value);
break;
case 2:System.out.println("enter value");
       value=Integer.parseInt(br.readLine());
       list.insertAtTail(value);
break;
case 3:System.out.println("enter index and value");
       index=Integer.parseInt(br.readLine());
       value=Integer.parseInt(br.readLine());
       list.insertAtPos(index,value);
break;
case 4:length=list.size();
       System.out.println(length);
break;
case 5:return;
case 6:list.display();
break;
case 7:list.removeHead();
break;
case 8:list.removeTail();
break;
case 9:System.out.println("enter index");
       index=Integer.parseInt(br.readLine());
       list.removePos(index);
break;
default: System.out.println("invalid option");       
}
}
}
catch(Exception e)
{
System.out.println("something went wrong");
}
}

}

import java.io.*;
class queue{
  public static void main(String args[])
  {
    int value;
System.out.println("implementation of queue:-");
LinkedList list=new LinkedList();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try
{
while(true)
{
System.out.println("1.enqueue 2.dequeue 3.size 4.print 5.exit ");
int n=Integer.parseInt(br.readLine());
switch(n)
{
case 1:System.out.println("enter value");
       value=Integer.parseInt(br.readLine());       
        list.insertAtTail(value);       
break;
case 2:list.removeHead();
break;
case 3:System.out.println(list.size());
break;
case 4:System.out.println(list);
break;
case 5:return;
default:System.out.println("invalid option");
}
}
 }
catch(Exception e)
{
System.out.println("something went wrong");
}
 

}
}


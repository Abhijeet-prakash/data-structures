import java.io.*;
class stack{
  public static void main(String args[])
  {
    int value;
System.out.println("implementation of Stack:-");
LinkedList list=new LinkedList();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try
{
while(true)
{
System.out.println("1.push 2.pop 3.print 4.exit ");
int n=Integer.parseInt(br.readLine());
switch(n)
{
case 1:System.out.println("enter value");
       value=Integer.parseInt(br.readLine());       
        list.insertAtTail(value);       
break;
case 2:list.removeTail();
break;
case 3:System.out.println(list);
break;
case 4:return;
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
import java.io.*;
class minheapTester
{
public static void main(String args[])
{
minheap min=new minheap();
min.insert(1);
min.insert(2);
min.insert(3);
min.insert(4);
min.insert(5);
min.insert(6);
min.insert(7);
min.insert(8);
min.insert(9);
min.print();
min.heapsort();
min.delete();
min.delete();
min.delete();

min.print();
min.heapsort();
}
}
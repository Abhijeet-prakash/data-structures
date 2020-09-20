import java.io.*;
class maxheapTester
{
public static void main(String args[])
{
maxheap maxi=new maxheap();
maxi.insert(1);
maxi.insert(2);
maxi.insert(3);
maxi.insert(4);
maxi.insert(5);
maxi.insert(6);
maxi.insert(7);
maxi.insert(8);
maxi.insert(9);
maxi.print();
maxi.heapsort();

maxi.delete();
maxi.delete();
maxi.delete();
maxi.print();
maxi.heapsort();


}
}
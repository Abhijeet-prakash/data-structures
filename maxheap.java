import java.util.*;
class maxheap
{
int temp,maximum,check=1,child;
public ArrayList<Integer> a=new ArrayList<>();

public void insert(int n)
{
if(a.size()==0)
{
a.add(n);
}
else{
a.add(n);
heapify(a.size()-1,a.size());
}
}

public void heapify(int index,int size)
{
if(index==0)
{
int left=1,right=2;
while(left<size||right<size)
{


if(left<size&&right<size)
{
if(a.get(index)>a.get(left)&&a.get(index)>a.get(right))
break;
else
{

maximum=(a.get(left)>a.get(right))?left:right;
temp=(int)a.get(index);
a.set(index,a.get(maximum));
a.set(maximum,temp);
}
index=maximum;
left=index*2+1;
right=index*2+2;
}

else
{
if(left<size)
child=left;
else
child=right;
if(a.get(index)>a.get(child))
break;
else
{
temp=(int)a.get(index);
a.set(index,a.get(child));
a.set(child,temp);
}
index=child;
left=index*2+1;
right=index*2+2;
}
}

}
else
{
check=1;
int parent=(index-1)/2;
while(check>=0)
{
if(a.get(parent)>a.get(index))
break;
else{
temp=(int)a.get(index);
a.set(index,a.get(parent));
a.set(parent,temp);
}
index=parent;
check=index-1;
parent=(index-1)/2;
}
}
}

public void delete()
{
if(a.size()==0)
System.out.println("no elements in heap");
else
{
System.out.println(a.get(0)+"removed");
temp=a.get(a.size()-1);
a.remove(a.size()-1);
a.set(0,temp);
heapify(0,a.size());
}
}

public void print()
{
if(a.size()==0)
{
System.out.println("no elements");
}
else
{
System.out.println("the elements in maxheap are:-");
for(int i=0;i<a.size();i++)
{
System.out.println(a.get(i));
}
}
}

public void heapsort()
{
if(a.size()==0)
System.out.println("no elements");
else{
System.out.println("after heapsort");
for(int i=a.size()-1;i>=0;i--)
{
temp=a.get(i);
a.set(i,a.get(0));
a.set(0,temp);
heapify(0,i);
}
print();
}
}

}

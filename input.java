import java.util.*;
class input
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int pcode;
String pname;
int age;

String[] items = new String[3];

for(int i =0;i<3;i++)
{
System.out.println("enter the pcode");
pcode=sc.nextInt();

System.out.println("enter the name");
pname=sc.next();

System.out.println("enter the age");
age=sc.nextInt();

items[i] = pcode+"name is"+pname+"age is"+age;
}

for(int i =0;i<3;i++)
{
System.out.println(items[i]);
}
}
}



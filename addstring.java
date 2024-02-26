import java.util.Scanner;
import java.util.Arrays;
public class addstring{
public static void main(String args[])
{
System.out.println("JACOB K M \n ROLLNO:32\nDATE:26-02-2024\nQ6.Sort String");
String name;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
name=sc.nextLine();
char array[]=name.toCharArray();
Arrays.sort(array);
name=new String(array);
System.out.println("sorted string is"+name);
}

}




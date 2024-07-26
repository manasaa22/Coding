/*A)	Develop Program to find the initials of a name.

Given a string name, we have to find the initials of the name 
 */
import java.util.Scanner;
class Q1
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your");
        //sc.nextLine();
        String s=sc.nextLine();
        String s4=s.toUpperCase();
        //Finding Initials
        String[] s1=s4.split(" ");
        for (int i=0;i<s1.length;i++)
        {
            String s2=s1[i];
            System.out.print(s2.charAt(0));
        }
    }
}
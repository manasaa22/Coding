
/*Change the given string according to the given conditions
Given a string S, the task is to change the string if it doesn’t follow any of the rules given below and print the updated string. The rules for the proofreading are: 
.  */
import java.util.Scanner;
public class p317 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(changeString(s));
    }
    public static String changeString(String str) {
		int n = str.length();
		StringBuilder result = new StringBuilder();
		int i = 0, j = 0;

		while (j < n) {
			if (j >= 2 && str.charAt(j) == str.charAt(j - 1)
					&& str.charAt(j) == str.charAt(j - 2)) {
				j++;
			}
			else if (j >= 3 && str.charAt(j) == str.charAt(j - 1)
					&& str.charAt(j - 2) == str.charAt(j - 3)) {
				j++;
			} else {
				result.append(str.charAt(j));
				i++;
				j++;
			}
		}

		return result.toString();
	}
}



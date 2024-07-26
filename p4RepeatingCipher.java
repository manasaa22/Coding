/*.Given string t
 — the result of encryption of some string s
. Your task is to decrypt it, i. e. find the string s
The first line contains integer n
 (1≤n≤55
) — the length of the encrypted string. The second line of the input contains t
 — the result of encryption of some string s
. It contains only lowercase Latin letters. The length of t
 is exactly n
It is guaranteed that the answer to the test exists.
Output
Print such string s
 that after encryption it equals t
Examples
input
6
baabbb
output
bab
input
10
ooopppssss
output
oops
input
1
z
output
z
 */
import java.util.Scanner;
public class p4RepeatingCipher {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String t=sc.next();
        System.out.println(decrypt(t));
    }
    public static String decrypt(String s){
        StringBuilder sb=new StringBuilder();
        int c=1;
        for(int i=0;i<s.length();i=i+c){
            char ch=s.charAt(i);
            sb.append(ch);c++;
        }
        return sb.toString().trim();
    }
}

/*B) Print characters in decreasing order of frequency

Given string str, the task is to print the characters in decreasing order of their frequency. If the frequency of two characters is the same then sort them in descending order alphabetically.
*/
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Q33B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int n =str.length();
        StringBuilder sb=new StringBuilder(str);
        str=sb.reverse().toString();
        printOrder(str,n);
    }
    public static void printOrder(String s,int n){
        LinkedHashMap<Character,Integer> t=new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            char c=s.charAt(i);
            if(!t.containsKey(c))
            t.put(c,1);
            else{
                t.put(c,t.get(c)+1);
            }
        }
        Map<Character, Integer> sortedMap = t.entrySet()
    .stream()
    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    .collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue,
        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(sortedMap);
    }
}

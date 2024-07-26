/*B) Most frequent word in first String which is not present in second String*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Q35B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Most frequent word:" + mostFreq(s1, s2));
    }

    public static String mostFreq(String s1, String s2) {
        List<String> al = new ArrayList<>(Arrays.asList(s1.split(" ")));
        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < al.size(); i++) {
            if(!s2.contains(al.get(i))){
                if (!h.containsKey(al.get(i))) {
                h.put(al.get(i), 1);
            } else {
                h.put(al.get(i), h.get(al.get(i)) + 1);
            }
            }
        }
        int max = Collections.max(h.values());
        List<String> res = new ArrayList<>();
        for (String m : h.keySet()) {
            System.out.println(s2.contains(m)+"   "+max+"     "+h.get(m));
            if (h.get(m) == max && !s2.contains(m)) {
                res.add(m);
                System.out.println("Inserted");
            }
        }

        if (res.isEmpty()) {
            return "No word found";
        }

        return Collections.min(res);
    }
}

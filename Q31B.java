/*Maximum difference between first and last indexes of an element in array*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q31B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Max: " + maxDiffIndices(a));
    }

    private static int maxDiffIndices(int[] arr) {
        int n = arr.length;
        int max = 0;
        Map<Integer, Integer> firstIndexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int c= arr[i];

            if (firstIndexMap.containsKey(c)) {
                int firstIndex = firstIndexMap.get(c);
                int curr = i - firstIndex;

                if (curr> max) {
                    max= curr;
                }
            } else {
                firstIndexMap.put(c, i);
            }
        }

        return max;
    }
}

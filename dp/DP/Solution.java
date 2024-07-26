/*import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assuming the input format is valid and consists of an integer N
        int N = scanner.nextInt(); // Read number of chocolates
        
        // Determine the winner based on N
        String winner = findWinner(N);
        
        // Print the winner to stdout
        System.out.println(winner);
        scanner.close();
    }

    public  static String findWinner(int N) {
        // To handle cases when N < 5
        boolean[] dp = new boolean[Math.max(N + 1, 6)];
        dp[0] = false; // Alice wins as Bob can't make a move
        dp[1] = true;  // Bob wins by taking 1 chocolate
        dp[2] = true;  // Bob wins by taking 2 chocolates
        if (N >= 5) {
            dp[5] = true;  // Bob wins by taking 5 chocolates
        }
        // Fill dp table for other values
        for (int i = 3; i <= N; i++) {
            // Bob wins if he can leave the stack in a losing position for Alice
            dp[i] = !dp[i - 1] || !dp[i - 2] || (i >= 5 && !dp[i - 5]);
        }

        // If dp[N] is true, Bob wins, otherwise Alice wins
        if(dp[N])
        return "BOb";
        else
        return "Alice";
    }
}
 */
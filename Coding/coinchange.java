import java.util.*;

public class coinchange {
    public static int coin(int coins[], int sum) {
        int n = coins.length;
        int w = sum;
        int dp[][] = new int[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < w + 1; i++) {
            dp[0][i] = 0;
        }
        dp[0][0] = 1;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                int val = coins[i - 1];
                if (val <= j) {
                    dp[i][j] = dp[i][j - val] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        int coins[] = { 1 };
        int sum = 0;

        int a = coin(coins, sum);
        System.out.println(a);
    }
}

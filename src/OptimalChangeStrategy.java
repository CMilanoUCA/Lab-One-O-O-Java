// Optimal Strategy Pattern

import java.util.Arrays;

public class OptimalChangeStrategy implements ChangeStrategy {
    @Override
    public Purse makeChange(double amount, Denomination[] currency) {
        int totalCents = (int) Math.round(amount * 100);
        int[] dp = new int[totalCents + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Build DP table
        for (int cent = 1; cent <= totalCents; cent++) {
            for (Denomination denom : currency) {
                int denomCents = (int)(denom.amt * 100);
                if (denomCents <= cent && dp[cent - denomCents] != Integer.MAX_VALUE) {
                    dp[cent] = Math.min(dp[cent], dp[cent - denomCents] + 1);
                }
            }
        }

        // Backtrack for Coins
        Purse purse = new Purse();
        int remaining = totalCents;
        while (remaining > 0) {
            Denomination bestDenom = null;
            for (Denomination denom : currency) {
                int denomCents = (int)(denom.amt * 100);
                if (denomCents <= remaining &&
                        dp[remaining] == dp[remaining - denomCents] + 1) {
                    bestDenom = denom;
                    break;
                }
            }
            purse.add(bestDenom, 1);
            remaining -= (int)(bestDenom.amt * 100);
        }
        return purse;
    }
}

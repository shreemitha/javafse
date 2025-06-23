public class Forecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return presentValue;
        }
        // Recursive step
        return predictFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using memoization (optional)
    public static double predictFutureMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = predictFutureMemo(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}

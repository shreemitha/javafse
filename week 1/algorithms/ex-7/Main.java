import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double growthRate = scanner.nextDouble() / 100;

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        // Basic recursive forecast
        double futureValue = Forecast.predictFutureValue(presentValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);

        // Optional: Using memoization
        double[] memo = new double[years + 1];
        double optimizedValue = Forecast.predictFutureMemo(presentValue, growthRate, years, memo);
        System.out.printf("Future value with memoization: %.2f%n", optimizedValue);

        scanner.close();
    }
}


package Algorithms_DataStructures.FinancialForecast;

public class GrowthCalculator {

    public static double futureValue(double currentAmount, double annualGrowth, int years) {

        if (years == 0) {
            return currentAmount;
        }

        return futureValue(currentAmount * (1 + annualGrowth), annualGrowth, years - 1);

    }

    public static void main(String[] args) {

        double initialValue = 15000;
        double growthRate = 0.08;
        int duration = 5;

        double finalValue = futureValue(initialValue, growthRate, duration);

        System.out.printf("Predicted Value after %d years = %.2f", duration, finalValue);

    }

}

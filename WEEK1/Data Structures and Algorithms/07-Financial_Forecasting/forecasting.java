public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base Case: No more periods to project
        if (periods == 0) {
            return presentValue;
        }
        // Recursive Case: Apply growth and call for remaining periods
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial investment
        double growthRate = 0.05; // 5% growth per period
        int periods = 5; // Forecasting 5 periods ahead

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods: " + futureValue);
    }
}

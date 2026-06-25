public class FinancialForecast {

    public static void main(String[] args) {

        double initialValue = FinancialData.getInitialValue();
        double growthRate = FinancialData.getGrowthRate();
        int years = FinancialData.getYears();

        double futureValue = ForecastCalculator.futureValue(initialValue, growthRate, years);

        System.out.println("Initial Value : " + initialValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : " + futureValue);
    }

}
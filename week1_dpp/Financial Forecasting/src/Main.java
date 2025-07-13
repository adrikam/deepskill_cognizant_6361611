public class Main {
    public static void main(String[] args) {
        double presentValue = 1000;
        double rate = 0.10;  
        int years = 5;

        System.out.println("Recursive Future Value Prediction\n");

        long start = System.nanoTime();
        double futureValue = FutureValueCalculator.calculateFutureValue(presentValue, rate, years);
        long end = System.nanoTime();
        System.out.println("Recursive FV: " + futureValue);
        System.out.println("Time Taken (ns): " + (end - start));

        System.out.println("\n Optimized with Memoization:");

        Double[] memo = new Double[years + 1];
        start = System.nanoTime();
        double memoValue = FutureValueCalculator.calculateFutureValueMemo(presentValue, rate, years, memo);
        end = System.nanoTime();
        System.out.println("Memoized FV: " + memoValue);
        System.out.println("Time Taken (ns): " + (end - start));
    }
}

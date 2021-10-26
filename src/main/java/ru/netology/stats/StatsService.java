package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }


    public int findAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }


    public int findMaxSales(int[] sales) {

        int maxMounth = sales[0];
        int maxMounthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (sale >= maxMounth) {
                maxMounth = sale;
                maxMounthNumber = i;

            }
        }

        return (maxMounthNumber + 1);

    }

    public int findMinSales(int[] sales) {

        int minMounth = sales[0];
        int minMounthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (sale <= minMounth) {
                minMounth = sale;
                minMounthNumber = i;

            }
        }

        return (minMounthNumber + 1);

    }

    public int findBelowAverage(int[] sales) {

        int counterBelowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (sale < findAverage(sales)) {
                counterBelowAverage += 1;

            }

        }

        return counterBelowAverage;

    }

    public int findAboveAverage(int[] sales) {

        int counterAboveAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (sale > findAverage(sales)) {
                counterAboveAverage += 1;

            }

        }

        return counterAboveAverage;

    }
}

package ru.netology.StatsService.Statistics;

public class StatsService {

    public int SumSales(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int AverageSumSales(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sum + sales[i]);
        }
        sum = sum / 12;
        return sum;
    }

    public int MaxMonth(int[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int MinMonth(int[] sales) {

        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {

        int minSalesDays = 0;
        int sum = AverageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sum) {
                minSalesDays++;
            }
        }
        return minSalesDays;
    }

    public int aboveAverageSales(int[] sales) {

        int maxSalesDays = 0;
        int sum = AverageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sum) {
                maxSalesDays++;
            }
        }
        return maxSalesDays;
    }
}

package ru.netology.stats;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int getMaxSaleMonth(long[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    public int getMinSaleMonth(long[] sales) {
        int MinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinMonth]) {
                MinMonth = i;
            }
        }
        return MinMonth + 1;
    }

    public int salesBellowAverage(long[] sales) {
        int total = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                total++;
            }
        }
        return total;
    }

    public int salesAboveAverage(long[] sales) {
        int total = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                total++;
            }
        }
        return total;
    }
}

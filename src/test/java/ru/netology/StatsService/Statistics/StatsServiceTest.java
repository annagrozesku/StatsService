package ru.netology.StatsService.Statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCountSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.SumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountAverageSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.AverageSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.MaxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.MinMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountAboveAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}

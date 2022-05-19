package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

        @Test
        public void findMax() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {13, 5, 8, 4, 5, 3, 8, 6, 16, 11, 12};
            long expected = 16;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

    @Test
    public void sameValue() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 1, 1, 1, 1};
        long expected = 1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    }


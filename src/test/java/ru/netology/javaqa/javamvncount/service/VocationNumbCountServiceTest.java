package ru.netology.javaqa.javamvncount.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VocationNumbCountServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")


    public void CalcNumbVocationYear(int expected, int income, int expenses, int threshold) {
        VocationNumbCountService service = new VocationNumbCountService();

        int actual = service.calculateCount(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}



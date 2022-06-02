package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void testCalcSquares(int minLimit, int maxLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(minLimit, maxLimit);

        Assertions.assertEquals(expected, actual);


    }
}

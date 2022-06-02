package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    // @CsvSource({
    //         "150,300,5",
    //         "149,301,5",
    //         "25,25,5",
    //         "49,99,3",
    //         "0,10,3",
    //         "200,300,3",
    //         "300,200,3",
    //         "100,300,8"
    //})

    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void testCalcSquares(int minLimit, int maxLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(minLimit, maxLimit);

        Assertions.assertEquals(expected, actual);


    }
}

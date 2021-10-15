package ru.netology.scr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'sqr between borders', 200, 300, 3"})
    void shouldCalculateSqrAndReturnCounter(String testName, int lowBorder, int highBorder, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(lowBorder, highBorder);

        assertEquals(expected, actual);

    }


}
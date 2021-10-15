package ru.netology.scr;

public class SQRService {
    public int calculate(int lowBorder, int highBorder) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= lowBorder && sqr <= highBorder) {
                counter++;
            }
        }
        return counter;
    }
}



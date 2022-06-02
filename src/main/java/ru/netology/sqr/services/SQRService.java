package ru.netology.sqr.services;

public class SQRService {

    public int calcSQR(int minLimit, int maxLimit) {
        int squares = 0;
        for (int i = 10; i <= 99; i++) {
            if (minLimit <= i * i && i * i <= maxLimit) {
                squares++;
            }
        }

        return squares;

    }


}

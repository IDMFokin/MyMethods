package com.gmail.idmfokin;

public class ToBinaryString {

    public String toBinaryString(int value) {
        if (value != 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (value > 0) {
            stringBuilder.append(value % 2);
            value = value / 2;
        }
        return stringBuilder.reverse().toString();
    }
}

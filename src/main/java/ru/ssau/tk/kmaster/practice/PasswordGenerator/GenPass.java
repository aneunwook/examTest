package ru.ssau.tk.kmaster.practice.PasswordGenerator;

import java.util.Locale;
import java.util.Random;

public class GenPass {

    static final private String alphabetLC = "abcdefghijklmnopqrstuvwxyz";
    static final private String alphabetUC = alphabetLC.toUpperCase();
    static final private String numbers = "1234567890";
    static final private String symbols = "`!@#$%^&?*(){}[]|/.,-+=";

    static public String generatePassword(int count) {

        String all = alphabetLC + alphabetUC + numbers + symbols;

        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(all.charAt(rand.nextInt(all.length())));
        }
        return sb.toString();
    }

    static public String generatePasswordWithoutSymbols(int count) {

        String all = alphabetLC + alphabetUC + numbers;

        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(all.charAt(rand.nextInt(all.length())));
        }
        return sb.toString();
    }

}

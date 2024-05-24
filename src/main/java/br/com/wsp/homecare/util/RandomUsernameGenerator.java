package br.com.wsp.homecare.util;

import java.security.SecureRandom;

public class RandomUsernameGenerator {

    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String LETTERS_AND_DIGITS = LETTERS + DIGITS;
    private static final SecureRandom RANDOM = new SecureRandom();


    public static String generateUsername(String name) {

        int length = 10;

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty");
        }

        int randomPartLength = length - name.length();

        if (randomPartLength <= 0) {
            return name.substring(0, length);
        }

        StringBuilder username = new StringBuilder(name.concat("_"));

        for (int i = 0; i < randomPartLength; i++) {

            int index = RANDOM.nextInt(LETTERS_AND_DIGITS.length());
            username.append(LETTERS_AND_DIGITS.charAt(index));
        }

        return username.toString();
    }
}
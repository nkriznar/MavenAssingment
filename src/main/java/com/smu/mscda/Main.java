package com.smu.mscda;

import org.apache.commons.lang3.text.WordUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program will capitalize the input string and generate MD5 hex! \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        if (!inputString.isEmpty()) {

            // Capitalize the first character using Apache Commons Text
            String capitalizedString = WordUtils.capitalize(inputString);
            System.out.println("\n Capitalized string is: " + capitalizedString);

            //Generate MD5 hex of the input string
            String md5Hex = generateMD5Hex(capitalizedString);
            System.out.println("\n MD5 Hex is: " + md5Hex);

        } else {
            System.out.println("\n Input string is empty.");
        }
    }

    public static String generateMD5Hex(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md.digest(input.getBytes());

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte md5Byte : md5Bytes) {
                hexString.append(String.format("%02x", md5Byte));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not available", e);
        }
    }
}

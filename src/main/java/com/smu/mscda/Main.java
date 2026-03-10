package com.smu.mscda;

import org.apache.commons.text.WordUtils;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MavenAssignment v3.11.8 (Jenkins CI/CD Demo) ===");
        System.out.println("This program will capitalize the input string and generate MD5 hex! \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        if (!inputString.isEmpty()) {

            // Capitalize the first character using Apache Commons Text
            String capitalizedString = WordUtils.capitalize(inputString);
            System.out.println("\n Capitalized string is: " + capitalizedString);

            // Generate MD5 hex of the input string
            String md5Hex = generateMD5Hex(capitalizedString);
            System.out.println("\n MD5 Hex is: " + md5Hex);

        } else {
            System.out.println("\n Input string is empty.");
        }
    }

    public static String generateMD5Hex(String input) {
        return DigestUtils.md5Hex(input);
    }
}

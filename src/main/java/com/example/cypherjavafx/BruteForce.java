package com.example.cypherjavafx;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class BruteForce {

    static void brute(String content) throws IOException {
        try (
                Scanner file = new Scanner(Paths.get("encrypt8.txt"))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String standalpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String encryptmessageupper = line.toUpperCase();
                StringBuilder sbdecrypt = new StringBuilder(encryptmessageupper);


                int key;
                int i;
                int index;
                char currentchar;
                char newchar;

                for (key = 1; key < 27; key++) {

                    sbdecrypt = new StringBuilder(encryptmessageupper);

                    for (i = 0; i < sbdecrypt.length(); i++) {
                        currentchar = sbdecrypt.charAt(i);
                        index = standalpha.indexOf(currentchar);
                        if (index != -1) {
                            index = index - key;
                            if (index < 0) {
                                index = index + 26;
                            }
                            newchar = standalpha.charAt(index);
                            sbdecrypt.setCharAt(i, newchar);
                        }
                    }
                    System.out.println("Key: " + key + " Decrypted String: " + sbdecrypt);
                }
            }
        }

    }}

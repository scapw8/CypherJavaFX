package com.example.cypherjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        launch();
        CaesarCypher cypher = new CaesarCypher(3);
        //  String originalMessage = "Coffee is the best fuel to code Java";
        // String cypheredMessage = cypher.cypher(originalMessage);
        //String finalMessage = cypher.decypher(cypheredMessage);
        //
        //       System.out.println(originalMessage) ;
        //       System.out.println(cypheredMessage);
        //       System.out.println(finalMessage);
        //       System.out.println(originalMessage.equals(finalMessage));

 //      /* Part one, still have to input the Regex for the alphabet */
 //     Scanner sc = new Scanner(System.in);
 //     System.out.println("Hi, please enter 1 for encrypt/decrypt mode or 2 for brute force mode");
 //     int mode = sc.nextInt();
 //
 //      if (mode == 1) {
 //          Scanner sc2 = new Scanner(System.in);
 //          System.out.println("For encryption press 1 and for decryption press 2");
 //          int mode2 = sc.nextInt();
 //          if (mode2 == 1) {
 //              try (Scanner file = new Scanner(Paths.get("TextFileInput.txt"))) {
 //                  while (file.hasNextLine()) {
 //                      String line = file.nextLine();
 //                      System.out.println(line);
 //                      System.out.println(cypher.decypher(line));
 //                      try (BufferedWriter writer = new BufferedWriter(new FileWriter("TextFileOutput3.txt"))) {
 //                          writer.write(cypher.decypher(line));
 //                          writer.close();
 //                      }
 //                  }
 //              }
 //          } else if (mode2 == 2) {
 //              try (Scanner file = new Scanner(Paths.get("TextFileOutput3.txt"))) {
 //                  while (file.hasNextLine()) {
 //                      String line = file.nextLine();
 //                      System.out.println(line);
 //                      System.out.println(cypher.cypher(line));
 //                      try (BufferedWriter writer = new BufferedWriter(new FileWriter("TextFileOutput3.txt"))) {
 //                          writer.write(cypher.cypher(line));
 //                          writer.close();
 //                      }
 //                  }
 //              }
 //          } else if (mode == 2) {
 //
 //
 //
 //          } else System.out.println("Please input only the number 1 or 2");
 //
 //      }
 //  }
    }    }

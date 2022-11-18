package com.example.cypherjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {

    @FXML
    private Label welcomeText;

    @FXML
    void Mode2(ActionEvent event) {

    }
    @FXML
    private TextArea textArea;

    CaesarCypher cypher = new CaesarCypher(9);

    @FXML
    void getText(MouseEvent event) throws FileNotFoundException {
        File file = fileChooser.showOpenDialog(new Stage());
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            textArea.appendText(scanner.nextLine() + "\n");

        }

    }
    @FXML
    void decrypt(MouseEvent event) throws FileNotFoundException {
        File file = fileChooser.showSaveDialog(new Stage());
        if (file != null){
            saveFile2(file, textArea.getText());
        }

    }



    @FXML
    void encrypt(MouseEvent event) throws FileNotFoundException {
        File file = fileChooser.showSaveDialog(new Stage());
        if (file != null){
           saveFile(file, textArea.getText());
        }

        }


    @FXML
    private Button myButtton;
    @FXML
    private TextField cypherKeyInput;
    @FXML
    private Label myLabel;
   private int key;


    public void submit (ActionEvent event) {

        try {
            key = Integer.parseInt(cypherKeyInput.getText());

        }
        catch (NumberFormatException e){
            myLabel.setText("Only numbers allowed for the key");
        }
        catch (Exception e){

        }

    }
     private String decrypt (String key) {
        return null;
     }
    public void page_two(ActionEvent event) throws IOException {


        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Mode1.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void Menu(ActionEvent event) throws IOException {


        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    FileChooser fileChooser = new FileChooser();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setInitialDirectory(new File("D:\\Java_zeugs\\CypherJavaFX\\src\\main\\java\\com\\example\\cypherjavafx"));
    }

    public void saveFile(File file, String content) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.write(cypher.decypher(content));
        printWriter.close();
    }

    public void saveFile2(File file, String content) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.write(cypher.cypher(content));
        printWriter.println();
        printWriter.close();
    }
}
package org.example.codeclassplusjava;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Scene scene = new Scene(root, 800, 600);

        Button button = new Button("Hello World!");
        TextField textField = new TextField("default text");
        Label melding = new Label();

        button.setOnAction(event -> {
            String textFieldContent = textField.getText();
            melding.setText("Hallo " + textFieldContent);
        });

        root.getChildren().add(textField);
        root.getChildren().add(button);
        root.getChildren().add(melding);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}

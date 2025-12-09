package org.example.codeclassplusjava;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Scene scene = new Scene(root, 900, 600);
        stage.setScene(scene);

        String title = "F1CC";
        stage.setTitle(title);

        Button button = new Button("Click me!");
        Label label = new Label("Hello World!");

        root.getChildren().add(button);
        root.getChildren().add(label);

        button.setOnAction(e -> label.setText("You clicked me!"));

        stage.setResizable(false);
        stage.show();
    }
}

package org.example.codeclassplusjava;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Scene scene = new Scene(root, 900, 600);
        stage.setScene(scene);

        String title = "F1CC";
        stage.setTitle(title);

        Button button = new Button("Click here!");
        Label label = new Label(title);

       root.getChildren().addAll(label, button);

        AtomicInteger counter = new AtomicInteger();

        button.setOnAction(e -> {
            counter.getAndIncrement();
            label.setText(counter.toString());
        });

        stage.setResizable(false);
        stage.show();
    }
}

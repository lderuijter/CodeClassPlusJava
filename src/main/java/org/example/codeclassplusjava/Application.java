package org.example.codeclassplusjava;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane root = new Pane();
        Scene scene = new Scene(root, 900, 600);
        stage.setScene(scene);

        String title = "F1CC";
        stage.setTitle(title);

        Button button = new Button("Click here!");
        button.setPrefSize(100, 25);
        button.setLayoutX(400);
        button.setLayoutY(300);

        Label label = new Label(title);
        label.setLayoutX(435);
        label.setLayoutY(350);

       root.getChildren().addAll(button, label);

        AtomicInteger counter = new AtomicInteger();

        button.setOnAction(e -> {
            counter.getAndIncrement();
            label.setText(counter.toString());
        });

        stage.setResizable(false);
        stage.show();
    }
}

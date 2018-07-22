package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {

    @Override
    public void init() throws Exception{

        System.out.println("Application inits");
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception{

        System.out.println("Application starts");

        Label selectedLb1 = new Label();

        RadioButton javaBtn = new RadioButton("Java");
        RadioButton jsBtn = new RadioButton("JavaScript");
        RadioButton csharpBtn = new RadioButton("C#");

        ToggleGroup group = new ToggleGroup();

        javaBtn.setToggleGroup(group);
        jsBtn.setToggleGroup(group);
        csharpBtn.setToggleGroup(group);

        javaBtn.setOnAction(event -> selectedLb1.setText("Java"));
        jsBtn.setOnAction(event -> selectedLb1.setText("JavaScript"));
        csharpBtn.setOnAction(event -> selectedLb1.setText("C#"));

        FlowPane root = new FlowPane(Orientation.VERTICAL,10,10);
        root.getChildren().addAll(javaBtn,jsBtn,csharpBtn,selectedLb1);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 250, 200);

        stage.setScene(scene);
        stage.setTitle("radioButtons in JavaFX");
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void stop() throws Exception{
        System.out.println("Application stops");
        super.stop();
    }


    public static void main(String[] args) {
        System.out.println("Launching Application");
        launch(args);
    }
}

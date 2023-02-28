//Author: Harsh Sharma

package songLib;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.collections.*;
import javafx.animation.*;
import javafx.application.*;
import javafx.beans.*; 
import javafx.concurrent.*;
import javafx.css.*;
import javafx.embed.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.geometry.*;
import javafx.print.*;
import javafx.stage.*;
import javafx.util.*;

public class songLib extends Application {

    Stage mainStage;

    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();   
        loader.setLocation(getClass().getResource("songLib.fxml"));
        SplitPane root = (SplitPane)loader.load();
        Controller listController = loader.getController();
        listController.initialize();
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setTitle("Song Library");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

//Author: Harsh Sharma

package songLib;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import java.io.*;
import java.awt.*;

public class Controller {

    @FXML 
    private ListView<String> listView;
    
    @FXML
    private Button addMusicBtn;

    @FXML
    private TextField nameTxt;

    @FXML
    private TextField artistTxt;

    @FXML
    private TextField yearTxt;

    @FXML
    private TextField albumTxt;

    private ObservableList<String> obsList;

    //This method is meant for adding a song to the song data sheet and ultimately the song list
    public void addSong(ActionEvent event)
    {
        if(nameTxt.getText() == null || nameTxt.getText().trim().isEmpty() || artistTxt.getText() == null || artistTxt.getText().trim().isEmpty())
        {
            Alert fail = new Alert(AlertType.INFORMATION);
            fail.setHeaderText("Missing Inputs");
            fail.setContentText("Fill in at least the song title AND artist.");
            fail.showAndWait();
        }

        String tempTitle = nameTxt.getText();
        String tempArtist = artistTxt.getText();
        String tempYear = yearTxt.getText();
        String tempAlbum = albumTxt.getText();

    }

    //The initialization method
    public void initialize() 
    {
        //The List should have nothing in it at the start, but check to see if a prior data file exists

        File tempFile = new File("data.txt");

        if(tempFile.exists())
        {
            //If the file exists, read it and then format it into an array list


        }
        else
        {
            obsList = FXCollections.observableArrayList();
            listView.setItems(obsList);
        }
    }
}

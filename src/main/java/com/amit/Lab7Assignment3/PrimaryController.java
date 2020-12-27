package com.amit.Lab7Assignment3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField textField;

    @FXML
    void sayHello(ActionEvent event) 
    {
    	textField.setText("Hello World");
    }

}

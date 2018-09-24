package controller;

import java.math.BigInteger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Karatsuba;

public class Controller {

    @FXML
    private Label result;

    @FXML
    private TextField Num;

    @FXML
    private TextField Den;

    @FXML
    private Button butResult;
    

  

    @FXML
    void butcalculator(ActionEvent event) {
   	  Karatsuba Karat = new Karatsuba();
   	  
   	  result.setText(Karat.karatsuba(new BigInteger(Num.getText()), new BigInteger(Den.getText())).toString());

    
}
}
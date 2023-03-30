package com.example.javacalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField operand1TextField;

    @FXML
    private TextField operand2TextField;

    @FXML
    private Label resultLabel;

    @FXML
    private void add(ActionEvent event) {
        double operand1 = Double.parseDouble(operand1TextField.getText());
        double operand2 = Double.parseDouble(operand2TextField.getText());
        double result = operand1 + operand2;
        resultLabel.setText(Double.toString(result));
    }

    @FXML
    private void subtract(ActionEvent event) {
        double operand1 = Double.parseDouble(operand1TextField.getText());
        double operand2 = Double.parseDouble(operand2TextField.getText());
        double result = operand1 - operand2;
        resultLabel.setText(Double.toString(result));
    }

    @FXML
    private void multiply(ActionEvent event) {
        double operand1 = Double.parseDouble(operand1TextField.getText());
        double operand2 = Double.parseDouble(operand2TextField.getText());
        double result = operand1 * operand2;
        resultLabel.setText(Double.toString(result));
    }
    @FXML
    private void divide(ActionEvent event) {
//        double operand1 = Double.parseDouble(operand1TextField.getText());
//        double operand2 = Double.parseDouble(operand2TextField.getText());
//        double result = operand1 * operand2;
//        resultLabel.setText(Double.toString(result));
    }
}
package com.example.javacalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    private String operator = "";
    private double operand1 = 0;
    private double operand2 = 0;


    @FXML
    private TextField operand1TextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button subtract;

    @FXML
    void add(ActionEvent event) {
        operator = "+";
        operand1 = Double.parseDouble(operand1TextField.getText());
        operand1TextField.setText("");
    }

    @FXML
    void clear(ActionEvent event) {
        operand1TextField.setText("");

        operand1 = 0;
        operand2 = 0;
        operator = "";
    }

    @FXML
    void divide(ActionEvent event) {
        operator = "/";
        operand1 = Double.parseDouble(operand1TextField.getText());
        operand1TextField.setText("");
    }

    @FXML
    void equals(ActionEvent event) {
        operand2 = Double.parseDouble(operand1TextField.getText());
        double result = 0;
        switch(operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
        }

        operand1TextField.setText(String.valueOf(result));
        operand1 = result;
        operand2 = 0;
    }

    @FXML
    void multiply(ActionEvent event) {
        operator = "*";
        operand1 = Double.parseDouble(operand1TextField.getText());
        operand1TextField.setText("");
    }

    @FXML
    void nmb0(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "0");
    }

    @FXML
    void nmb1(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "1");
    }

    @FXML
    void nmb2(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "2");
    }

    @FXML
    void nmb3(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "3");
    }

    @FXML
    void nmb4(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "4");
    }

    @FXML
    void nmb5(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "5");
    }

    @FXML
    void nmb6(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "6");
    }


    @FXML
    void nmb7(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "7");
    }

    @FXML
    void nmb8(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "8");
    }

    @FXML
    void nmb9(ActionEvent event) {
        operand1TextField.setText(operand1TextField.getText() + "9");
    }
    @FXML
    void subtract(ActionEvent event) {
        operator = "-";
        operand1 = Double.parseDouble(operand1TextField.getText());
        operand1TextField.setText("");
    }
}
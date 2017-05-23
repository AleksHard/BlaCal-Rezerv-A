//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.hive.javaxf.blablacarcalc.controllers;

//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private Label fuelSpentId;              //Потрачено топлива
    @FXML
    private Label oneKmPriceId;             //Стоимость одного км.
    @FXML
    private Label passPriceId;              //Цена с одного пассажира
    @FXML
    private Label priWayId;                 //Стоимость пути
    @FXML
    private TextField passNumberId;         //Кол-во пассажиров
    @FXML
    private TextField fuelConsumptionId;    //Средний расход топлива
    @FXML
    private TextField distanceId;           //Расстояние (дистанция)
    @FXML
    private TextField fuelPriceId;          //Цена топлива

    public MainController() {
    }
    private Double fuelConsumptionF;
    private Double distanceF;
    private Double fuelPriceF;
    private Double passNumberF;
    Double index = 1.18;
    private String contentText = "Проверьте поле ввода данных ";
    private String headerText = "Некорректный ввод";
    private void informationText (String contentText, String headerText){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Ошибочка");
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

    public void considerClick() {
        try{
            fuelConsumptionF = Double.valueOf(this.fuelConsumptionId.getText());     //Средний расход топлива
        }catch(NumberFormatException err){
            informationText(contentText + "\"Расход(л/100км)\".", headerText);
        }
        try{
            distanceF = Double.valueOf(this.distanceId.getText());                   //Расстояние (дистанция)
        }catch (NumberFormatException err){
            informationText(contentText + "\"Расстояние в (км.)\".", headerText);
        }
        try {
            fuelPriceF = Double.valueOf(this.fuelPriceId.getText());             //Цена топлива
        }catch (NumberFormatException err){
            informationText(contentText + "\"Цена топлива\".", headerText);
        }
        try{
            passNumberF = Double.valueOf(this.passNumberId.getText());               //Кол-во пассажиров
        }catch(NumberFormatException err){
            informationText(contentText + "\"Кол-во пассажиров\".", headerText);
        }

        //Стоимость одного км.
        Double oneKmPriceF = (fuelConsumptionF * fuelPriceF / 100.0)*index;
        String oneKmPriceS = String.format("%.2f", oneKmPriceF);
        this.oneKmPriceId.setText(oneKmPriceS);

        //Потрачено топлива
        Double fuelSpentF = (distanceF / 100.0 * fuelConsumptionF)*index;
        String fuelSpentS = String.format("%.2f", fuelSpentF);
        this.fuelSpentId.setText(fuelSpentS);

        //Стоимость пути
        Double priWayF = (fuelSpentF * fuelPriceF);
        String priWayS = String.format("%.2f", priWayF);
        this.priWayId.setText(priWayS);

        //Цена с одного пассажира
        Double passPriseF = (priWayF / passNumberF);
        String passPriceS = String.format("%.2f", passPriseF);
        this.passPriceId.setText(passPriceS);
    }
}

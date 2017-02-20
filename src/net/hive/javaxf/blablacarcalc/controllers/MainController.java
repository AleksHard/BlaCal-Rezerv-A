//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.hive.javaxf.blablacarcalc.controllers;

//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.Button;
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

    public void considerClick() {
        Float fuelConsumptionF = Float.valueOf(this.fuelConsumptionId.getText());   //Средний расход топлива
        Float distanceF = Float.valueOf(this.distanceId.getText());                 //Расстояние (дистанция)
        Float fuelPriceF = Float.valueOf(this.fuelPriceId.getText());               //Цена топлива
        Float passNumberF = Float.valueOf(this.passNumberId.getText());             //Кол-во пассажиров

        //Стоимость одного км.
        Float oneKmPriceF = fuelConsumptionF * fuelPriceF / 100.0F;
        String oneKmPriceS = Float.toString(oneKmPriceF.intValue());
        this.oneKmPriceId.setText(oneKmPriceS);

        //Потрачено топлива
        Float fuelSpentF = distanceF / 100.0F * fuelConsumptionF;
        String fuelSpentS = Float.toString(fuelSpentF.intValue());
        this.fuelSpentId.setText(fuelSpentS);

        //Стоимость пути
        Float priWayF = fuelSpentF * fuelPriceF;
        String priWayS = Float.toString(priWayF.intValue());
        this.priWayId.setText(priWayS);

        //Цена с одного пассажира
        Float passPriseF = priWayF / passNumberF;
        String passPriceS = Float.toString(passPriseF.intValue());
        this.passPriceId.setText(passPriceS);
    }
}

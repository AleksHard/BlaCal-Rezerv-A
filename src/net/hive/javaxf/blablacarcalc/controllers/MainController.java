//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.hive.javaxf.blablacarcalc.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private Label fuelSpentId;              //Потрачено топлива
    @FXML
    private Label oneKmPriceId;             //Стоимость одного км.
    @FXML
    private Button considerId;              //Кнопка рассчёта
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

    public void considerClick(ActionEvent actionEvent) {
        Float fuelConsumptionF = Float.valueOf(this.fuelConsumptionId.getText());   //Средний расход топлива
        Float distanceF = Float.valueOf(this.distanceId.getText());                 //Расстояние (дистанция)
        Float fuelPriceF = Float.valueOf(this.fuelPriceId.getText());               //Цена топлива
        Float passNumberF = Float.valueOf(this.passNumberId.getText());             //Кол-во пассажиров

        //Стоимость одного км.
        Float oneKmPriceF = Float.valueOf(fuelConsumptionF.floatValue() * fuelPriceF.floatValue() / 100.0F);
        String oneKmPriceS = Float.toString(oneKmPriceF.intValue());
        this.oneKmPriceId.setText(oneKmPriceS);

        //Потрачено топлива
        Float fuelSpentF = Float.valueOf(distanceF.floatValue() / 100.0F * fuelConsumptionF.floatValue());
        String fuelSpentS = Float.toString(fuelSpentF.intValue());
        this.fuelSpentId.setText(fuelSpentS);

        //Стоимость пути
        Float priWayF = Float.valueOf(fuelSpentF.floatValue() * fuelPriceF.floatValue());
        String priWayS = Float.toString(priWayF.intValue());
        this.priWayId.setText(priWayS);

        //Цена с одного пассажира
        Float passPriseF = Float.valueOf(priWayF.floatValue() / passNumberF.floatValue());
        String passPriceS = Float.toString(passPriseF.intValue());
        this.passPriceId.setText(passPriceS);
    }
}

package com.example.abrechnungshilfe;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;


public class MainViewController
{
    @FXML
    private Label label;
    @FXML
    private Button CoinCalcButton;
    @FXML
    private TextField TF_2Euro, TF_1Euro, TF_50Cent, TF_20CEnt, TF_10Cent, TF_5Cent, TF_2Cent, TF_1Cent;
    @FXML
    private TextField TF_20Kr, TF_10Kr, TF_5Kr, TF_2Kr, TF_1Kr, TF_50Öre;


    int EuroCoinTotal;
    int DanishCoinTotal;

    //Needs to calc all the coins together both Euro and Kr.
    //then later on it needs to calculate the best way to get to exactly 200Euro and 1000DKR in the register

    @FXML
    protected void calcCoin()
    {



    }
}
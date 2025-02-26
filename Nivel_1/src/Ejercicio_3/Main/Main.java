package Ejercicio_3.Main;

import Ejercicio_3.Classes.CountryCapitalMap;

import javax.swing.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        int attempts = 0;
        int points = 0;
        String answer;

        String user = JOptionPane.showInputDialog("Please, can you tell us your user name?");

        CountryCapitalMap actualUserMap = new CountryCapitalMap( "Nivel_1" + File.separator + "countries.txt");

        int accesGame = JOptionPane.showConfirmDialog(null, "Hello " + user + ","
                + " We are going to show you the name of a country, "
                + "you have to write the corresponding capital to earn one point. You have a total of 10 attempts ");

        String randomCountry;

        if (accesGame == JOptionPane.YES_OPTION) {

            while (attempts < 10) {

                randomCountry = actualUserMap.getRandomCountry();
                answer = JOptionPane.showInputDialog("The name of the country is: " + randomCountry);
                attempts++;

                if (answer != null && answer.equalsIgnoreCase(actualUserMap.getCapital(randomCountry))) {
                    points++;
                }

            }
            JOptionPane.showMessageDialog(null, "Game over! Your score is: " + points + " out of 10");
        }

        else {

            JOptionPane.showMessageDialog(null, "Thank you for participating in our game");
        }
    }
}

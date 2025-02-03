//package Ejercicio_3;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class CountryCapitalMap {
//
//    Map<String, String> countryCapitalMap = new HashMap<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader("countries.txt"))) {
//        String line;
//        while ((line = br.readLine()) != null) {
//            String[] parts = line.split(" ");
//            String country = parts[0];
//            String capital = parts[1];
//            countryCapitalMap.put(country, capital);
//        }
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
//        System.out.println(entry.getKey() + " - " + entry.getValue());
//    }
//}


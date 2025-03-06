package Ejercicio_3.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class CountryCapitalMap {

    private Map<String, String> countryCapitalMap;

    public CountryCapitalMap(String filePath) {
        countryCapitalMap = new HashMap<>();
        loadCountries(filePath);
    }

    private void loadCountries(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 2) {
                    String country = String.join(" ", java.util.Arrays.copyOf(parts, parts.length - 1));
                    String capital = parts[parts.length - 1];

                    countryCapitalMap.put(country, capital);
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void printCountryCapitalMap() {
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public Map<String, String> getCountryCapitalMap() {

        return countryCapitalMap;
    }

    public String getRandomCountry(){

        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());

        Random random = new Random();
        int randomIndex = random.nextInt(countries.size());
        return countries.get(randomIndex);
    }

    public String getCapital(String country) {

        return countryCapitalMap.get(country);
    }
}


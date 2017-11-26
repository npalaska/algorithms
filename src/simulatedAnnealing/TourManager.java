package simulatedAnnealing;

import java.util.ArrayList;
import java.util.List;

//Tour Manager class holds cities together
public class TourManager {

    private static List<city> cityList = new ArrayList<>();

    public static void addCity (city city) {
        cityList.add(city);
    }

    public static city getCity(int index) {
        return cityList.get(index);
    }

    public static List<city> getCityList() {
        return cityList;
    }

    public static int totalCities () {
        System.out.println(cityList.size());
        return cityList.size();
    }
}

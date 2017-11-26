package simulatedAnnealing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleTour {

    private List<city> tour = new ArrayList<>();
    private int distance = 0;

    public SingleTour () {
        for (int i=0; i<TourManager.totalCities(); i++) {
            tour.add(null);
        }
    }

    public SingleTour (List<city> cities) {
        this.tour = cities;
    }

    public List<city> getTour() {
        return tour;
    }

    public city getCity (int index) {
        return tour.get(index);
    }

    public void setCity(int index, city city) {
        tour.add(index, city);
        distance = 0;
    }

    public void generateIndividual(int size) {

        System.out.println(getSize());

        for (int i=0; i<size; i++) {
            setCity(i, TourManager.getCity(i));
            //System.out.println(i + "->" + TourManager.getCity(i));
        }

        Collections.shuffle(tour);
    }

    public int getDistance() {
        if (distance == 0) {
            int tourDistance = 0;
            //System.out.println(getSize());
            //System.out.println("I am inside get distance");
            for (int i = 0; i < getSize(); i++) {
                // System.out.println("I am inside get distance loop");
                city cityFrom = getCity(i);
                city cityTo;
                if ((i + 1) < getSize()) {
                    cityTo = getCity(i + 1);
                } else {
                    cityTo = getCity(0);
                }

                tourDistance += cityFrom.getDistance(cityTo);
                //System.out.println(tourDistance);
            }
            this.distance = tourDistance;
            //System.out.println(distance);
        }
        return distance;
    }

    public int getSize () {
        return this.tour.size();
    }

}

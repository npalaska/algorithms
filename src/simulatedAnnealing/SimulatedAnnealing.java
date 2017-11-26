package simulatedAnnealing;

import java.util.ArrayList;
import java.util.List;

public class SimulatedAnnealing {

    private double temperature;
    private double coolingFactor;
    private SingleTour bestTour;

    public SimulatedAnnealing (double temperature, double coolingFactor) {
        this.temperature = temperature;
        this.coolingFactor = coolingFactor;
    }

    public double aceptanceProbablity(int currentEnergy, int newEnergy) {
        if (newEnergy >currentEnergy) {
            return 1.0;
        }
        return Math.exp(currentEnergy-newEnergy/this.temperature);
    }

    public void simulate (List<city> cityList) {

        //System.out.println("inside simulate now 1");
        SingleTour currentTour = new SingleTour(cityList);
        //System.out.println("inside simulate now 2");

        int size = currentTour.getSize();
        currentTour.generateIndividual(size);
        //System.out.println("inside simulate now 3");

        int initialDistance = currentTour.getDistance();
        System.out.println("Initial distance = " + initialDistance);
        bestTour = currentTour;

        while (temperature > 1) {
            //System.out.println("I am inside temperature while loop");
            SingleTour newTour = new SingleTour(currentTour.getTour());

            int randomIndex1 = (int) (newTour.getSize()*Math.random());
            int randomIndex2 = (int) (newTour.getSize()*Math.random());

            city city1 = newTour.getCity(randomIndex1);
            city city2 = newTour.getCity(randomIndex2);

            newTour.setCity(randomIndex1, city2);
            newTour.setCity(randomIndex2, city1);

            int currentEnergey = currentTour.getDistance();
            int newEnergy = newTour.getDistance();

            if (aceptanceProbablity(currentEnergey, newEnergy) > Math.random()) {
                //System.out.println("hii");
                currentTour = new SingleTour(newTour.getTour());
            }

            if (currentTour.getDistance() < bestTour.getDistance()) {
                System.out.println("hello");
                bestTour = currentTour;
            }

            temperature *= 1-this.coolingFactor;
        }

        System.out.println("Final solution distance: " + bestTour.getDistance());
    }
}

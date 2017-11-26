package simulatedAnnealing;

public class App {

    public static void main(String[] args) {

        TourManager TM= new TourManager();

        for (int i = 0; i < 1000; i++) {
            city city = new city();
            TM.addCity(city);

        }

        SimulatedAnnealing algorithm = new SimulatedAnnealing(10000, 0.003);
        System.out.println(TM.getCityList());
        algorithm.simulate(TM.getCityList());
    }
}

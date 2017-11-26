package simulatedAnnealing;

public class city {

    private String name;
    private int x;
    private int y;

    public city () {
        this.x = (int) (Math.random() * 10);
        this.y = (int) (Math.random() * 10);
    }

    public city (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance (city otherCity) {
        int deltaX = Math.abs(this.x-otherCity.getX());
        int deltaY = Math.abs(this.y-otherCity.getY());

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
}

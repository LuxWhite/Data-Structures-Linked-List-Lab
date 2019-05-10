public class Main {
    public static void main (String [] args){
        WeatherSystem System1 = new WeatherSystem();


        System1.addToFront(72.2,92.6);
        System1.addToFront(48.6,31.4);
        System1.addToFront(35.5,43.8);
        System1.addToFront(24.5,63.6);
        System1.addToBack(64.8,11.0);
        System1.addToBack(54.5,88.7);
        System1.addToBack(50.2,63.3);
        System1.addToBack(64.4,65.1);
        System1.addToFront(3.2,98.2);


        System.out.println("Total # of Coordinates: "+System1.count());
        System.out.println();


        System1.checkIfEmpty();

        System1.displayCoordinates();
    }
}

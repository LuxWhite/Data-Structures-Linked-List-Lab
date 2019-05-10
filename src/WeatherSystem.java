public class WeatherSystem {
    private LikedList weatherObj;


    public WeatherSystem(){
        weatherObj = new LikedList();
    }


    public void addToFront(double longitude, double latitude){
        weatherObj.addAtFront(longitude,latitude);
    }


    public void addToBack(double longitude, double latitude){
        weatherObj.addAtBack(longitude,latitude);
    }


    public int count(){
        return weatherObj.getSize();
    }

    public boolean checkIfEmpty(){
        return weatherObj.check();
    }

    public void displayCoordinates(){
        weatherObj.displayWeatherInfo();
    }

}

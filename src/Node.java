public class Node {
    double x; // longitude.
    double y; // latitude.
    Node next;



    Node(double x, double y){
        this.x = x;
        this.y = y;
    }

    Node(){}


    public double getX() {
        return x;
    }


    public void setX(float x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }


    public void setY(float y) {
        this.y = y;
    }


    public void display (){
        System.out.println("Longitude: "+x +" |Latitude: "+ y);
    }

}

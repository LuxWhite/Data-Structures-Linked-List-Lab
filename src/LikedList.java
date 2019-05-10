import java.util.NoSuchElementException;

public class LikedList{
    Node head;
    int size;


    public boolean isEmpty(){
        return head == null;
    }


    public int getSize(){
        return  size;
    }


    public boolean check(){
        return isEmpty();
    }


    public void addAtFront(double longitude, double latitude) {
        Node newNode = new Node(longitude, latitude);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size ++;
    }



        public void addAtBack(double longitude, double latitude){
            Node newNode = new Node(longitude, latitude);
            if (isEmpty()){
                head = newNode;
            }
            else{
                Node n = head;
                while (n.next != null){
                    n = n.next;
                }
                n.next = newNode;
            }
            size++;
        }




        public void displayWeatherInfo(){
            if (isEmpty()){
                throw new NoSuchElementException();
            }
            Node n = head;
            while(n.next != null){
                n.display();
                n = n.next;
            }
            System.out.println();
        }



        public void removeFromFront() {
            Node current = head;
            if (!isEmpty()) {
                head = head.next;
            }
        }



        public void removeFromBack(){
            if (isEmpty()){
                return;
            }
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = null;
        }


}

abstract public class Shape {

    abstract public float calculateArea();

    void display(){
        System.out.println("The Area is: "+this.calculateArea());
    }
    
}

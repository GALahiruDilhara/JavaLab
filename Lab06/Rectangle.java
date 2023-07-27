public class Rectangle extends Shape{

    private float height;
    private float width;

    public Rectangle(float height,float width){
        this.height = height;
        this.width = width;
    }

    @Override
    public float calculateArea(){
        return (this.height * this.width);
    }
    
}

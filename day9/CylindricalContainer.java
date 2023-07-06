public class CylindricalContainer extends Container {

    private double Radius;
    private double Height;

    public CylindricalContainer(double radius,double height){
        this.Radius = radius;
        this.Height = height;
    }

    @Override
    public double volume() {
        return (Math.PI*this.Radius*this.Radius*this.Height);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

}

public class Circle extends Shape{
    double radius = 0;
    public void setRadius(double dubs){
	radius = dubs;
    }

    public double getRadius(){
	return radius;
    }

    public Circle(double dubs){
	setRadius(dubs);
    }

    public Circle(){
	this(1.0);
    }

    public String toString(){
	return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }

    public double getArea(){
	return Math.PI * (getRadius() ^ 2);
    }


}
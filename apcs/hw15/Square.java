public class Square extends Rectangle{

    public Square(){
	super();
    }

    public Square(double side){
	super.setLength(side);
	super.setWidth(side);
    }

    public void setLength(double length){
	super.setLength(length);
	super.setWidth(length);
    }

    public void setWidth(double width){
	super.setWidth(width);
	super.setLength(width);
    }
}

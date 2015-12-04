public abstract class Shape{
    private String color;
    private boolean filled;

    public Shape(){
	color = "black";
	filled = false;
    }
    
    public Shape(String str, boolean bool){
	color = str;
	filled = bool;
    }

    public String getColor(){
	return color;
    }
    
    public void SetColor(String str){
	color = str;
    }
    
    public boolean isFilled(){
	return filled;
    }

    public void setFilled(boolean bool){
	filled = bool;
    }

    public double getSemiPermimeter(){
	return getPerimeter() / 2;
    }

    public String toString(){
	String isItFilled = "not filled";
	if (isFilled()){
	    isItFilled = "Filled";
	}
	return "A Shape with color of "+ getColor() + " and is " + isItFilled;
	
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
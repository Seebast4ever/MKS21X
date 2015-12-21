public class TempConverter{

    public static double CtoF(double t){
	return (double)((((t * 9) / 5) + 32));
    }
    
    public static double FtoC(double t){
	return (double)((((t - 32) * 5) / 9));
    }
    
    public static void main(String[]args){
	double t = 20.0;
	System.out.println(FtoC(t));
	System.out.println(CtoF(t));
    }

}
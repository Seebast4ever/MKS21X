import java.lang.Math;
/*
//1
public class Driver{
    public static void main(String[]args){
	for(int i = 1; i < 21; i++){
	    System.out.println(i);
	}
    }
}
*/

/*
//2
public class Driver{
    public static Boolean isEven (Integer i) {
        return (i % 2) == 0;
    }
    public static void main(String[]args){
	for(int i = 1; i < 21; i++){
	    if (isEven(i)){
	    System.out.println(i);
		}
	}
    }
}
*/

/*
//3
public class Driver{
    public static Boolean isDivisibleBy3 (Integer i) {
        return (i % 3) == 0;
    }
    public static void main(String[]args){
	for(int i = 1; i < 21; i++){
	    if (isDivisibleBy3(i)){
	    System.out.println(i);
		}
	}
    }
}
*/

/*
//4
public class Driver{
    public static Boolean isEven (Integer i) {
        return (i % 2) == 0;
    }
    public static void main(String[]args){
	for(int i = 1; i < 21; i++){
	    if (!isEven(i)){
		int iSquared = 0;
		iSquared = i * i;
		System.out.println(iSquared);
	    }
	}
    }
}
*/

/*
//5
public class Driver{
    public static void main(String[]args){
	String iFull = "";
	for(int i = 1; i < 21; i++){
	    iFull += i;
	    if (i < 20){
		iFull += "+ ";
	    }
	    if (i > 19){
		System.out.println(iFull);
	    }
	}
    }
}
*/

/*
//6
public class Driver{
    public static Boolean isEven (Integer i) {
        return (i % 2) == 0;
    }
    public static void main(String[]args){
	int iOddSum = 0;
	for(int i = 1; i < 21; i++){
	    if (!isEven(i)){
		iOddSum += i;
		System.out.println(iOddSum);
	    }
	}
    }
}
*/

//7
public class Driver{
    public static Boolean isEven (Integer i) {
        return (i % 2) == 0;
    }
    public static void main(String[]args){
	int iOddSum = 0;
	for(int i = 1; i < 21; i++){
	    if (!isEven(i)){
		iOddSum += i;
		System.out.println(iOddSum);
	    }
	}
    }
}




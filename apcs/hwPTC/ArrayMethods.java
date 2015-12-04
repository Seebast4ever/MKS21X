public class ArrayMethods{
    public static int max(int[][] AR) {
	int phdr = 0;
	return phdr;
    }
    //returns the maximum value in the 2d parameter array AR.

    public static int rowSum(int[][] AR, int x){
	int phdr = 0;
	return phdr;

    }
    //returns the sum of the elements in Row x of AR. 

    public static int columnSum(int[][] AR, int x){
	int phdr = 0;
	return phdr;

    }
    //returns the sum of the elements in Column x of AR (careful with rows of different lengths!).

    public static int[] allRowSums(int[][] AR){
	
	return AR[0] ;
    }
    //calculates the row sum for every row and returns each of the values in an array. 
    //Index i of the return array contains the sum of elements in row i.

    public static boolean isRowMagic(int[][] AR){
	boolean bool = true;
	return bool;

    }
    //checks if the array is row-magic (this means that every row has the same row sum).

    public static boolean isColumnMagic(int[][] AR){
	boolean bool = true;
	return bool;

    }
    //checks if the array is column-magic (this means that every column has the same column sum).

    public static boolean isSquare(int[][] AR){
	boolean bool = true;
	return bool;

    }
    //checks if the array is square (i.e. every row has the same length as AR itself).

}
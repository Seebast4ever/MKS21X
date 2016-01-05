public class Sorts{
    /*
    public static void printArray(int[]data){
	String ans = "[";
	for(int x: data){
	    ans += ", " +  x;
	}
	System.out.println(ans + "]");
    }
    public static void insertionSort(int[]data){
	for(int x = 0; x < data.length - 1; x++){
	    int smallestValIndex = x;
	    for(int n = x; n < data.length; n++){
		if(data[n] < data[smallestValIndex]){
		    smallestValIndex = n;
		}
	    }
	    int temp = data[smallestValIndex];
	    data[smallestValIndex] = data[x];
	    data[x] = temp;
	}
    }
*/
    public static void printArray(int[]data){
	String ans = "[";
	for(int x: data){
	    ans += ", " +  x;
	}
	System.out.println(ans + "]");
    } 
    public static void selectionSort(int []data){
	for(int x = 0; x < data.length - 1; x++){
	    int small = x;
	    for(int n = x + 1; n < data.length; n++){
		if(data[n] < data[small]){
		    small = n;
		}
	    }
	    int temp = data[small];
	    data[small] = data[x];
	    data[x] = temp;
	    Sorts.printArray(data);
	}
    }
    
}

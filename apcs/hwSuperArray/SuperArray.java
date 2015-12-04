public class SuperArray{
    private int[] data;
    private int size;
  
    //constructor make an empty superArray

    public int size(){
	return size;
    }
    //1
    public void add(int n){
	//add the value n to the next available slot in the superArray.
	//this will change the size. This function should always work
	//And will resize the SuperArray if needed.
    }

    //2
    private void grow(){
	//make new array, copy over elements, use this as your data.
    }

    //3
    public String toString(){
	//format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
	//commas between... square bracket start/end and no comma at end.
    }

    //If you have time this is useful:
    public String toStringDebug(){
	//format the super array like this :   [ 1, 8, 23, 99, -4, 5, X, X, X, X]   
	//(capacity is 10, but only 6 are used)
	//commas between... square bracket start/end and no comma at end.
	//unused slots should be printed as X's.
    }
}//end SuperArray

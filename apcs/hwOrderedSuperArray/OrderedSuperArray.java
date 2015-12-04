public class OrderedSuperArray extends SuperArray{
    
    public OrderedSuperArray(){
	super();
    }

    public OrderedSuperArray(int capacity){
	super(capacity);
    }

    public OrderedSuperArray(int [] ary){
	super(ary);
    }

    public int indexOf(int value){
	for(int i = 0; i < data.length; i++){
	    if(value == data[i]){
		return i;
	    }
	}
	return -1;
    }
    public boolean add(int element){
	if(data.length == size){
	    grow();
	}
	int index = 0;
	while(data[index] < element && index < size){
	    index++;

	}
	
    }


    public static void main(String[]args){

    }


}

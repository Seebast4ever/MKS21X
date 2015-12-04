public class Driver{
    public static void main(String[]args){
	int[] arrayName = { 8, 6, 7, 5, 3, 0, 9};
	Sorts.printArray(arrayName);
	Sorts.insertionSort(arrayName);
	Sorts.printArray(arrayName);
	int[] arrayName2 = { 5, 3, 7, 1, 8, 22, 7};
	Sorts.printArray(arrayName2);
	Sorts.insertionSort(arrayName2);
	Sorts.printArray(arrayName2);
	int[] arrayName3 = { 2345, 23, 876, 2222222, 66, 2, 6, 22, 402, 2101, 394848};
	Sorts.printArray(arrayName3);
	Sorts.insertionSort(arrayName3);
	Sorts.printArray(arrayName3);

    }

}
public class Driver{
    public static void main(String[]args){
        int[] arrayName = { 8, 6, 7, 5, 3, 0, 9};
	System.out.println("Array 1\n");
        Sorts.printArray(arrayName);
	System.out.println("START\n");
        Sorts.selectionSort(arrayName);
	System.out.println("END\n");
        Sorts.printArray(arrayName);
        int[] arrayName2 = { 5, 3, 7, 1, 8, 22, 7};
	System.out.println("Array 1\n");
        Sorts.printArray(arrayName2);
	System.out.println("START\n");
        Sorts.selectionSort(arrayName2);
	System.out.println("END\n");
        Sorts.printArray(arrayName2);
        int[] arrayName3 = { 2345, 23, 876, 2222222, 66, 2, 6, 22, 402, 2101, 394848};
	System.out.println("Array 1\n");
        Sorts.printArray(arrayName3);
	System.out.println("START\n");
        Sorts.selectionSort(arrayName3);
	System.out.println("END\n");
        Sorts.printArray(arrayName3);
	/*
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
*/
    }

}


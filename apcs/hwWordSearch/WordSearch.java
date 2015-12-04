import java.util.*;
import java.io.File;
public class WordSearch{
    File words = new File("./words.txt");
    Scanner scan = new Scanner(words);
    private char[][]data;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordSearch
     *@param col is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
	data = new char[rows][cols];
	for(int x = 0; x<data.length; x++){
	    for(int y = 0; y<data[0].length; y++){
		data[x][y] = ' ';
	    }
	}
    }

    /**Set all values in the WordSearch to spaces ' '*/
    private void clear(){
	for(int x = 0; x<data.length; x++){
	    for(int y = 0; y<data[0].length; y++){
		data[x][y] = ' ';
	    }
	}	
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String ans = "";
	for(int y = 0; y<data.length; y++){
	    for(int x = 0; x<data[0].length; x++){
		ans += data[y][x] + ' ';
	    }
	    ans += "\n";
	}
	return ans;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordHorizontal(String word,int row, int col){
	int index = 0;
	if(word.length() <= (data[0].length - col)){
	    for(int x = col; x<col + word.length(); x++){
		data[row][x] = word.charAt(index);
		index++;
	    }
	    return true;
	}
	else{
	    System.out.println("The word does not fit! try using different parameters!!");
	    return false;
	}

    }

    public boolean addWordVertically(String word, int row, int col){
	int index = 0;
	if(word.length() <= (data.length - row)){
	    for(int x = row; x< row + word.length(); x++){
		data[x][col] = word.charAt(index);
		index++;
	    }
	    return true;
	}
	else{
	    System.out.println("The word does not fit! try using different parameters!!");
	    return false;
	}

	
    }

    public boolean addWordDiagonally(String word, int row, int col){
	int y = col;
	int index = 0;
	if(word.length() <= row && word.length() <= (data[0].length - col)){
	    for(int x = row; x<row + word.length(); x--){
		data[x][y] = word.charAt(index);
		index++;
		y++;
	    }
	    return true;
	}
	else{
	    System.out.println("The word does not fit! try using different parameters!!");
	    return false;
	}

	
    }

    /**
     *@param word The word you want to add
     *@param row the row where you start the word
     *@param col the column where you start the word
     *@param dr the change in row between letters. Should be -1,0, or 1.
     *@param dc the change in column between letters. Should be -1,0, or 1.
     *@return true when added successfully, false if not.
     */

    public boolean addWord(String word, int row, int col, int dr, int dc){
	


    }
    /*
    public class rerandom{
        public static void main(String[]args){
            int seed = (int)(Math.random()*100000);
            //seed = 17127;                                                                                             
            //change this to any seed you want.                                                                         
            System.out.println("If there is an error use this seed: "+seed);
            Random randgen = new Random(seed);

            for(int i=0;i<10;i++){
                System.out.println(randgen.nextInt());
            }
        }
    }
    */


    //vertical + diagonal should be implemented as well.

}

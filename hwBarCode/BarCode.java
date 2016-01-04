public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	if(zip.length() != 5){
	    throw new RuntimeException("idiot use 5 numbers");
	}else{
	    _zip = zip;
	    _checkDigit = (getSum() % 10);
	}
    }
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip = x.getZip();
	_checkDigit = x.getCheckDigit();
	
    }

    public String getZip(){
	return _zip;
    }
    public int getCheckDigit(){
	return _checkDigit;
    }

    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sumOf = Integer.parseInt(_zip.charAt(0));
	for(int x = 1; x < _zip.length; x++){
	    sumOf += Integer.parseInt(_zip.charAt(x));
	}
	return sumOf;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
    /*1  :::||   
2  ::|:|
3  ::||:
4  :|::|
5  :|:|:
6  :||::
7  |:::|
8  |::|:
9  |:|::
0  ||:::   
    */      
    public String toString(){
	String answer = _zip + _checkDigit;
	String newBarCode = "";
	for(int x = 0; x < answer.length(); x++){
	    if(answer.charAt(x) == '0'){
		newBarCode += "||:::";
	    }if(answer.charAt(x) == '1'){
		newBarCode += ":::||";
	    }if(answer.charAt(x) == '2'){
		newBarCode += "::|:|";
	    }if(answer.charAt(x) == '3'){
		newBarCode += "::||:";
	    }
	    
	}
	return answer + '|' + newBarCode + '|';
    }


    public boolean equals(Object other){
	
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){
	
}
    // postcondition: compares the zip + checkdigit 

}

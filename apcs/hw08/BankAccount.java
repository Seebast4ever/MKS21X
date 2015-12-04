public class BankAccount{
    private double balance;
    private int pin,accountID;
    private String username,password;
    
    /**
     *Create a new BankAccount, with all parameters provided
     */
    public BankAccount(
		       String username,
		       String password,
		       int accountID,
		       int pin,
		       double balance){
	this.pin = pin;
	this.accountID = accountID;
	this.balance = balance;
	this.username = username;
	this.password = password;
    }


    /**
     *Print the bank account for testing purposes
     *private method should not show up in javadoc
     */
    private void print(){
	System.out.println(username+":"+password);
	System.out.println(accountID+"\t"+pin);
	System.out.println("$"+balance);
    }
    /**
     *Return a String consisting of non-password/non-pin information 
     *to be used to display the account.
     */
    public String toString(){
	return username+",\t"+accountID+",\t$"+balance;
    }

    /**
     *Return the value of balance
     */
    public double getBalance(){
	return balance;
    }

    /**
     *Return the value of accountID
     */
    public int getID(){
	return accountID;
    }

    /**
     *Return the value of username
     */
    public String getUsername(){
	return username;
    }

    /**
     *Change the value of password to the specified value
     *@param newPass The value to replace the old password with
     */
    public void setPassword(String newPass){
	password = newPass;
    }

    /**
     *Change the value of pin to the specified value
     *@param newPin The value to replace the old pin with.
     */
    public void setPin(int newPin){
	pin = newPin;
    }
    /**
     *When amount is positive: Increase balance by amount and return 
     *true. When amount is not positive: Return false.
     *@param amount The amount is how much to change the balance by.
     */
    public boolean deposit(double amount){
	if(amount >= 0.0){
	    balance += amount;
	    return true;
	}
	return false;
    }
    /**
     *When amount is positive and the amount is at least as much as the balance: 
     *decrease balance by amount and return true. Otherwise: Return false.
     *@param amount The amount is how much to change the balance by.
     */
    public boolean withdraw(double amount){
	if(balance >= amount && amount >= 0){
	    balance -= amount;
	    return true;
	}
	return false;
    }





    public static void main(String[]args){
	BankAccount b1 = new BankAccount("Billy", "abc123",1000001,12345,1000.0);
	BankAccount b2 = new BankAccount("Xiao",  "abc123",1030002,61352,1000.0);
	
	System.out.println(b1);
	System.out.println(b2);

        

	double cashAmount = 1300.0;
	if(b1.withdraw(cashAmount) ){
	    if(b2.deposit(cashAmount)){
		System.out.println("Success");
	    }else{
		//This should never happen. 
		//Error message provided to make sure that is the case
		System.out.println(cashAmount + " withdrawn from" +
				   b1 + "Failed to add to "+b2);
	    }
	}else{
	    System.out.println("Failed to withdraw "+cashAmount+" from "+b1);
	}
	System.out.println(b1);
	System.out.println(b2);

    }
}
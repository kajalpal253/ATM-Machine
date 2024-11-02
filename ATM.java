import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM {
   private String CustomerName;
   private int CustomerNumber;
   private double Balance;
   private int PIN;
   

   public void getdepositFund(){
    Scanner input =  new Scanner(System.in);
    System.out.println("Enter your amount ");
    double depositeAmount =input.nextDouble();
    Balance+= depositeAmount;
    System.out.println("Money successfully desposite in your account");
    System.out.println("New Balance is Rs"+Balance);
   }
    public void getwithdrawFund(){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter your amount ");
        double withdrawAmount = input.nextDouble();
        if(Balance-withdrawAmount<0){
            System.out.println("Insufficient Fund! You only have Rs"+Balance+" in your account");
        }else{
            Balance-= withdrawAmount;
            System.out.println("Processed, Remaining balance =Rs"+Balance);
            System.out.println("Successfully withdraw Please Collect your money");
        }
    }
    public void checkBalance(){
        System.out.println("Total balance Rs"+Balance+ " in your account");
    }

    
    public int getCustomerNumber(){
        return CustomerNumber;
    }
    public void setAccountNumber(int CustomerNumber ){
        this.CustomerNumber=CustomerNumber;
    } 
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double Balance){
      this.Balance= Balance;
    }
    public String getCustomerName(){
        return CustomerName;
    } 
    public void setCustomerName(String CustomerName){
        this.CustomerName=CustomerName;
    }
    public int getPIN(){
        return PIN;
    }
    public void setPIN(int PIN){
        this.PIN=PIN;
    }
   
}

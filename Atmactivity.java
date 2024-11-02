import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Atmactivity extends ATM {
    Scanner input = new Scanner(System.in);
   DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
   HashMap<Integer,Integer>data =new HashMap<>();
   public void getLogin() throws IOException{
     int x=1;
     do{
        try{
            data.put(245252,7770);
            data.put(323256, 1269);
            System.out.println("Welcome to the Atm Machine");
            System.out.println("Enter your customer Number");
            setAccountNumber(input.nextInt());
            System.out.println("Enter your PIN number");
            setPIN(input.nextInt());

        }catch(Exception e){
            System.out.println("\n"+"Invalid Character(s).Only Number"+"\n");
            x=2;
        }
        int cn =getCustomerNumber();
        int pn= getPIN();
        if(data.containsKey(cn)&& data.get(cn)==pn){
            getAccountType();
        }else
        System.out.println("\n"+"Wrong Customer Number or PIN Number"+"\n");
     }while(x==1);
   } 
   public void getAccountType(){
    System.out.println("Select the Account you Want to Access");
    System.out.println("Type 1- Checking Account");
    System.out.println("Type 2- Saving Account");
    System.out.println("Type 3- Exit");
    int selection =input.nextInt();
    switch (selection) {
        case 1:
        getChecking();
         break;
        case 2:
        getSaving();
        break;
        case 3:
        System.out.println("Thank You for using this Atm, Have good day. \n");
        break;
        default:
        System.out.println("\n"+"Invalid Choice,"+"\n");
            break;
    }
   }
   public void getChecking(){
    System.out.println("Checking Account:");
    System.out.println("Type 1- view Balance");
    System.out.println("Type 2- Withdraw Funds");
    System.out.println("Type 3- Deposite Funds");
    System.out.println("Type 4- Exit");
    System.out.println("Choice");
    int selection =input.nextInt();
    switch (selection) {
        case 1:
        System.out.println("Checking Account Balance: "+moneyFormat.format(getBalance()));

        getAccountType();
        break;
        case 2:
        getwithdrawFund();
        getAccountType();
        break;
        case 3:
        getdepositFund();
        getAccountType();
        break;
        case 4:
        System.out.println("Thank You for using ATM, Have Good Day. \n");
        break;
        default:
        System.out.println("\n"+"Invalid Choice"+"\n");
            break;
    }
   }
   public void getSaving(){
    System.out.println("Saving Account:");
    System.out.println("Type 1- view Balance");
    System.out.println("Type 2- Withdraw Funds");
    System.out.println("Type 3- Deposite Funds");
    System.out.println("Type 4- Exit");
    System.out.println("Choice");
    int selection =input.nextInt();
    switch (selection) {
        case 1:
        System.out.println("Saving Account Balance: "+moneyFormat.format(getBalance()));
        getAccountType();
        break;
        case 2:
        getwithdrawFund();
        getAccountType();
        break;
        case 3:
        getdepositFund();
        getAccountType();
        break;
        case 4:
        System.out.println("Thank You for using ATM, Have Good Day. \n");
        break;
        default:
        System.out.println("\n"+"Invalid Choice"+"\n");
            break;
    }
   }
}

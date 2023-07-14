package oops_concept;
import java.util.Scanner;
public class Interface_ATM {
    String name;
    String userName;
    String password;
    String accountNo;
    double balance=200000;
    int transactions=0;
    String transactionHistory="";


public void register(){
    Scanner sc=new Scanner(System.in);
    System.out.println("");
    name=sc.nextLine();
    System.out.println("Enter your username:");
    userName=sc.nextLine();
    System.out.println("Enter your password");
    password=sc.nextLine();
    System.out.println("Enter your account number");
accountNo=sc.nextLine();

}
public boolean login(){
    boolean islogin=false;
    Scanner sc=new Scanner(System.in);
    while(!islogin){
        System.out.println("Enter your username");
       String username=sc.nextLine();
        if(username.equals(userName)){
            //while
            System.out.println("Enter your password");
            String Password=sc.nextLine();
        if(Password.equals(password)){
            System.out.println("Login Successful!!");
            islogin=true;

        }
        else{
            System.out.println("Incorrect password");
        }
        }
        else{
            System.out.println("Username not foud");
        }
    }
    return islogin;

}
public void withdraw(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter amount to withdraw from your account");
    float amount=sc.nextFloat();
    try{
        if(balance>=amount){
            transactions++;
balance=balance-amount;//dekjh le ,ahybe chages ho sakta hai
            System.out.println("Withdrawn Successfully");
            String str=amount +"Ruppees withdrawed";
            transactionHistory=transactionHistory.concat(str);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    catch(Exception e){

    }}
    public void deposit(){
    System.out.println("Enter amount to deposit");
    Scanner sc=new Scanner(System.in);
    float amount=sc.nextFloat();
    try{
        if(amount<=10000f){
            transactions++;
            balance=balance+amount;
            System.out.println("Deposited Successfully");
            String str=amount+"Rs Deposited";
            transactionHistory=transactionHistory.concat(str);
        }
        else{
            System.out.println("Limit Exceeded");
        }
    }
    catch(Exception e){

    }
}
public void transfer(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter receipent name-");
    String receipent=sc.nextLine();
    System.out.println("Enter ammount to transfer:");
    float amount=sc.nextFloat();
    try{
        if(amount<=balance){
transactions++;
balance=balance-amount;
System.out.println("Transfered successfully to"+receipent);
String str=amount+"Rs Transferred to"+receipent;//"\n";
transactionHistory=transactionHistory.concat(str);

        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    catch(Exception e){

    }
}
public void checkBalance(){
    System.out.println(balance+"Ruppees only.");
}
public void transHistory(){
    if(transactions==0){
        System.out.println("Empty");
    }
    else{
        System.out.println(transactionHistory);
    }
}
public static int takeIntegerinput(int limit){
    int input=0;
    boolean flag=false;
    while(!flag){
        try{
            Scanner sc=new Scanner(System.in);
            input=sc.nextInt();
            flag=true;
            if(flag && input>limit || input<1){
                System.out.println("Choose the number between 1 to "+limit);
                flag=false;
            }
        }
        catch(Exception e){
            System.out.println("Enter only integer value");
            flag=false;
        }
    }
    return input;

}
public static void main(String[] args) {
    System.out.println("\n***********WELCOME TO ATM SYSTEM**************");
    System.out.println("1.Register\n2.Exit");
    System.out.println("Enter your choice:");
    int choice=takeIntegerinput(2);
    if(choice==1){
        Interface_ATM  i=new Interface_ATM();
        i.register();
        while(true){
            System.out.println("1.Login\n2.Exit");
            System.out.println("Enter your choice:");
            int ch=takeIntegerinput(2);
            if(ch==1){
                if(i.login()){
                    System.out.println("\n\n**********WELCOME BACK"+i.name+"**************\n");
                    boolean isFinished=false;
                    while(!isFinished){
                        System.out.println("\n1.Withdraw\n2.Deposit\n3.Transfer\n4.Check Balance\n5.transaction History\n");
                        int c=takeIntegerinput(6);
                        switch(c){
                            case 1:
                            i.withdraw();
                            break;
                            case 2:
                            i.deposit();
                            break;
                            case 3:
                            i.transfer();
                            break;
                            case 4:
                            i.checkBalance();
                            break;
                            case 5:
                            i.transHistory();
                            break;
                            case 6:
                            isFinished=true;
                            break;


                        }
                    }
                }
            }
            else{
                System.exit(0);
            }
        }
    }
    else{
        System.exit(0);
    }
}
}

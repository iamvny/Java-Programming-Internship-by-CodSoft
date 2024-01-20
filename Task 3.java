//import required classes and packages
import java.util.Scanner;
//create ATMExample class to implement the ATM functionality  
public class ATMExample
{
//main method starts   
public static void main(String args[])
{
//declare and initialize balance, withdraw, and deposit  
int balance = 100000,withdraw,deposit;

//create scanner class object to get choice of user  
Scanner sc=new Scanner(System.in);
System.out.println("Enter your 4 digit ATM card pin: ");
int p = sc.nextInt();
if (p == 9766) {
    
while(true)
{
System.out.println("Welcome to ENB Bank\nAutomated Teller Machine");
System.out.println("Press 1 for Withdraw");
System.out.println("Press 2 for Deposit");
System.out.println("Press 3 for CheckBalance");
System.out.println("Press 4 for EXIT");
System.out.print("Choose the operation you want to perform:");
//get choice from user  
int choice = sc.nextInt();
switch(choice)
{
case 1:
System.out.print("Enter money  to be withdrawn:");

//get the withdrawl money from user  
withdraw=sc.nextInt();
//check whether the balance is greater than or equal to the withdrawal amount  
if(balance>=withdraw)
{
//remove the withdrawl amount from the total balance  
balance=balance-withdraw;
System.out.println("Your Transcation is Completed!\nPlease collect your money!");
}
else
{
//show custom error message   
System.out.println("You have Insufficient Funds!");
}
System.out.println("");
break;
case 2:
System.out.print("Enter money to be deposited:");
//get deposite amount from te user  
deposit=sc.nextInt();
//add the deposit amount to the total balanace  
balance=balance+deposit;
System.out.println("Your Money has been successfully deposited");
System.out.println("");
break;
case 3:
//displaying the total balance of the user  
System.out.println("Balance:"+balance);
System.out.println("");
break;
case 4:
//exit from the menu  
System.exit(0);
}
}
}
}
}
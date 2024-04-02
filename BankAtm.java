import java.util.Scanner;
public class BankAtm 
{
public static void main (String[]args) 
{
int balance=50000;
int Withdraw=0;
int deposite=0;
Scanner in =new Scanner(System.in);
while(true)
{
System.out.println( "welcome to Bank......") ;
System.out.println( "choice 1: Withdraw") ;
System.out.println( "choice 2: deposite") ;
System.out.println( "choice 3: cheack balance") ;
System.out.println( "choice 4: exit" ) ;
System.out.println( "chose any options.....") ;
int choice =in.nextInt();
switch(choice) 
{
case 1 :
System.out.println("enter the Withdraw ammount:_") ;
Withdraw = in.nextInt();
if(balance < Withdraw)
{
System.out.println("sorry not a sufficent balance") ;
}
else {
balance = balance-Withdraw ;
System.out.println("Withdraw is successful") ;
}
break;
case 2 :
System.out.println( "enter the deposit amount:_" ) ;
balance = balance+deposite ;
System.out.println( "succesfully deposite amount" ) ;
break;
case 3 :
System.out.println( "your account blance is "+balance) ;
break;
case 4 :
System.exit(0) ;
break;
default :
System.out.println( "invalid choice plzz cheack" ) ;
}
}
}
}

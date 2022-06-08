//Aliyah Alshathri 442202972

public class testClass {

public static void main(String[] args) {

Account firstAccount = new Account(500) ;
System.out.println("Account 1 : \n " + firstAccount .toString() );

Account secondAccount = new Account() ;
System.out.println("Account 2 : \n " + secondAccount .toString() );

secondAccount .add(100);
 System.out.println("ACcount2 after update : " + secondAccount.toString());


if( firstAccount.redeem(50 ) )
{
 System.out.println("Success withdraw 50 SR from firstAccount ");
 System.out.println("balane after withdraw : " +firstAccount.getPoints() );
}
else
 System.out.println("can't withdraw 50 SR from firstAccount");

if( donate( firstAccount , secondAccount , 100) == true ) 
{
System.out.println("donate 100 from the first account to the second account ");
 System.out.println("Balance of firstAccount : " + firstAccount.getPoints());
 System.out.println("Balance of secondAccount : " + secondAccount.getPoints() );
}
else
 System.out.println("can't donate 100 from the first account to the second account ");

System.out.println("the total number of accounts : " + Account.getTotalNumberOfAccounts() );
}
public static boolean donate( Account account1 , Account account2 , int amount)
{
if( account1.redeem( amount) == true )
{
account2.add( amount );
return true;
}
else
return false;
}
}

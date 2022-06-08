//Aliyah Alshathri 442202972

public class Account
 {
private static int count=0;
private final int id;
private int points ;

public Account()
{
points=0;
count++;
id = count ;
}

public Account(int points)
{
this.points=points;
count++;
id=count;
}

public int getID()
{return id;}

public int getPoints()
{return points;}

public void add(int points)
{
 this.points += points;
}

public boolean redeem(int amount)
{if(points >= amount)
 {
 points -= amount ;
 return true;
 }
 else
 return false;
}

public static int getTotalNumberOfAccounts()
{return count;}
public String toString()
{String str = "Account id= "+id+" : "+ points ;
return str ; 
}
}
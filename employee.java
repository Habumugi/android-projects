import java.util.*;

class employee
{
static int number;
static String name ;
static String address;
static int salary;
static int hours;
static void getdata()
{
    
Scanner K =new Scanner (System.in);
int op;
System.out.println("select option:[1]monthly,[2]weekly,[3]hourly");
op=K.nextInt();
if(op==1)
{
System.out.println("enter number");
number=	K.nextInt();
System.out.println("enter name");
name=K.next();
System.out.println("enter address");
address= K.next();
System.out.println("enter salary");
salary=K.nextInt();
int result;
result=salary-(((salary*2)/100)+((salary*5)/100));
System.out.println("your salary ="+result);
}
else if(op==2)
{
System.out.println("enter number");
number=	K.nextInt();
System.out.println("enter name");
name=K.next();
System.out.println("enter address");
address=K.next();
System.out.println("enter salary");
salary=K.nextInt();
int result;
result = salary;
System.out.println("your salary ="+result);	
}	
else if(op==3)
{
System.out.println("enter number");
number=	K.nextInt();
System.out.println("enter name");
name=K.next();
System.out.println("enter address");
address=K.next();
System.out.println("enter hourly rate");
salary=K.nextInt();
System.out.println("enter hours");
hours=K.nextInt();

int result;
result=(salary*hours)-((((salary*hours)*30)/100)+(((salary*hours)*3)/100));
System.out.println("your salary ="+result);	
}
else
{
System.out.println("you enering imvalid option");
}
}

		
public static void main(String args[])
{
getdata();
}
}
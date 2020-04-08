public class Test{
int number=200;
int reversed=0;
public void test(){
while(number>0)
{
int digit=number%10;
reversed=reversed*10+digit;
number=number/10;
}
System.out.println(reversed);
}

public static void main(String args[])
{
Test ts=new Test();
ts.test();
}
}


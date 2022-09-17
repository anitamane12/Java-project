package basic;

public class Calculator1 
{
	  public int simpleinterest(int p, int r, int t)
	{
	  int i=p*r*t/100;
	  return i;
	}
      public void areaoftriangle(int i,int j)
    {
      System.out.println("Area of triangle is = " +(0.5)*i*j);	
    }
      public static void main(String args[])
    {
      Calculator1 c1 = new Calculator1();
      System.out.print("Simple interest is = ");
      System.out.println(c1.simpleinterest(10000,8, 3));
      
      c1.areaoftriangle(9, 10);
    }
}
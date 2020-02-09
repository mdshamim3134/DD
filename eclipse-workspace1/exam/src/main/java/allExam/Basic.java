package allExam;

import org.junit.Test;

public class Basic {
	
	public void fact() {
		
		int fact=1;
		int x=5;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
		System.out.println(x);
	}
	
	public void prime() {
		int prime=2;
		for(int n=2;n<=100;n++)
		{
			for(int j=2;j<=100;j++)
			{
				if(j==n)
				{
					System.out.println(n);
				}
				else if(n%j==0)
					break;
					
			}}}
	@Test
public void fibonichi() {
	int fibo1=1;
	int fibo2=1;
	int fiboniccina=1;
	for(int s=1;s<=6;s++)
	{
		fiboniccina=fibo1+fibo2;
		fibo1=fibo2;
		fibo2=fiboniccina;
	
	System.out.println(fiboniccina);}
}
}

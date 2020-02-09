package allExam;

import org.junit.Test;

public class Frame {
	
	public void factorial() {
		int fact=1;
		int a=5;
		for(int i=1;i<=5;i++)
			
		fact=fact*i;
		{	System.out.println(fact);
		}
	}
	@Test
	public void prime() {
		//int p=2;
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if( j==i) {
				System.out.println("i");
			}
				else if(i%j==0)
				{break;	}
				
		}
	}

}
}
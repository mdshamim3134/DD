package allExam;

import org.junit.Test;

public class Prime {
@Test
	public void prime(){
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(j==i)
				{
					System.out.println(i);
					
					
				}
				if(i%j==0)
				{
					break;
				}
				
			}
		}
	}
}

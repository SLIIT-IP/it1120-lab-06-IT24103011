import java.util.Scanner;
public class IT24103011Lab6Q3 {
	public static void main(String[] args) {
		
		
		int num,count=0;
		double sum=0,rms,squareofnumber;
		
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Enter a positive number (Terminate input with -99): ");
		
		
		while(true)
		{
			System.out.print("Enter a number :");
			num=input.nextInt();
			
			
			if (num==-99)
			{
				break;
			}
		
		if(num<0)
		{
			System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
			continue;
		}
				
				
				sum +=num*num;
				count++;
			}
			
				
				System.out.println("");
				
				
				if (count>0)
				{
					rms=Math.sqrt(sum/count);
					System.out.println("The root mean Square is :" +rms);
					
				}
		
	}
}
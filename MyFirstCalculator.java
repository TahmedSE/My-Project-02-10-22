
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int T1 , T2,choose, cal;
		System.out.println("Enter two numbers");
		Scanner r =new Scanner (System.in);
		T1=r.nextInt();
		T2=r.nextInt();
		System.out.println("Select operation");
		choose=r.nextInt();
		
		if(choose==1)
		{
			cal=T1+T2;
			System.out.println("Addition"+cal );
		}
		else if (choose==2)
		{
			cal=T1-T2;
			System.out.println("Subtraction"+cal);
		}
		else if(choose==3)
		{
			cal=T1*T2;
			System.out.println("Muliplication"+cal);
		}
		else if(choose==4)
		{
			cal=T1/T2;
			System.out.println("Divison"+cal);
			
			
		}
		else
		{
		cal=T1%T2;
		System.out.println("Remainder"+cal);
		}
		
		
		
		
	}

}

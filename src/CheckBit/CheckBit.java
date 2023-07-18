package CheckBit;
import java.util.*;

public class CheckBit {
	
	public static void checkBit(int number,int index)
	{
		if((number & (1 << index)) == 0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int index = scan.nextInt();
		checkBit(number,index);
		
	}

}

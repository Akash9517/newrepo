
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

void m1(){

	System.out.println("hbjxchjbxchj v");
}


	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);

		String arrstr[];
		arrstr=new   String[5] ;


		int arr[];
		arr=new int[5];

//		arr=new int[]{2,3,4,5,6};

//		or
//		arr[0]=20;
//		arr[1]=10;s
//		arr[2]=10;
//		arr[3]=10;
//		arr[4]=10;


//or
		// to take input from user we can use loop
//		for (int i = 0; i < arrstr.length; i++) {
//			System.out.println("enter the name : "+(i+1));
//			arrstr[i]=s.nextLine();
//
//		}
//
//
//		for (int i = 0; i < arrstr.length; i++) {
//			System.out.println((i+1)+"  Name is : " +arrstr[i]);
//
//		}


        try
		{
			for (int i = 0; i < arr.length; i++)
			{
				System.out.println("enter the number");
				arr[i] = s.nextInt();

			}
			for (int i = 0; i < arr.length; i++)
			{
				System.out.println("enter number is : "+arr[i]);


			}
		}

		catch(NumberFormatException a){

		}

		catch(InputMismatchException b){

			System.out.println("Enter only Integer values");
		}




	}
}

import java.util.Scanner;


public class ArrayDemo {

    int a[];

    ArrayDemo(int a[]){

this.a=a;

    }

    public void sort()
    {

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]) {
                    int temp;

                    temp = a[i];
                    a[i] =a[j];
                    a[j]=temp;
                }

            }
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ,\t");
        }

    }

    public  void search(){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number");
        int number=s1.nextInt();

        boolean c=false;

        for (int i = 0; i < a.length; i++) {

             c=number==a[i];
              
            if (c==true) {
                System.out.println("the number is found");
                
            }    
        }
        

        if(c==false)
        {
            System.out.println("number not found");
        }

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        int num=s.nextInt();

        int arr[];
        arr=new int[num];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("enter the number");
            arr[i]=s.nextInt();

        }

        ArrayDemo obj=new ArrayDemo(arr);
        obj.sort();
        obj.search();


    }
}

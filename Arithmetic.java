import java.util.Scanner;
public class Arithmetic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int p=a*b;
        double div=a/b;
        double di=b/a;
        int mod=a%b;
        int mod2=b%a;
        System.out.println("Their sum is: "+c);
        System.out.println("Their difference is: "+d);
        System.out.println("Their product is: "+p);
        System.out.println("Their division(First/Second) is: "+div);
        System.out.println("Their division(Second/First) is: "+di);
        System.out.println("Their modular division(First/Second) is: "+mod);
        System.out.println("Their modular division(Second/First) is: "+mod2);
    }
}

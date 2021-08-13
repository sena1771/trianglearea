import java.util.Scanner;
public class hey2 {
    public static void main(String[] args) {
        int a,b,c,u;
double alan;
        Scanner input= new Scanner(System.in);
        System.out.println("üçgen kenar uzunluğu 1: ");
        a= input.nextInt();
        System.out.println(a);
        System.out.println("üçgen kenar uzunluğu 2: ");
        b= input.nextInt();
        System.out.println(b);
        System.out.println("üçgen kenar uzunluğu 3: ");
        c= input.nextInt();
        System.out.println(c);
        u=(a+b+c)/2;
        System.out.println("u: ");
        System.out.println(u);
        alan=Math.sqrt((u)*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: ");
        System.out.println(alan);

    }
}

import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {

        // Kenar uzunluklarını kullanıcıdan aldığınız üçgenin alanını hesaplama :


        Scanner scan = new Scanner(System.in);

        int a,b,c;
        double alan , u ;

        System.out.println("Üçgenin 1. kenar uzunluğunu giriniz: ");
        a = scan.nextInt();

        System.out.println(" Üçgenin 2. kenar uzunluğunu giriniz:");
        b = scan.nextInt();

        System.out.println(" Üçgenin 3. kenar uzunluğunu giriniz");
        c = scan.nextInt();

        u = (a + b + c)/2;

        alan = Math.sqrt( u * (u-a)*(u-b)*(u-c));

        System.out.println("Kenarlarını girdiğiniz üçgenin alanı :" + alan);


    }

}

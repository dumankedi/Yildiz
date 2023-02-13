import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz: ");
        sayi=input.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=(sayi-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
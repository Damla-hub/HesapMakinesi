import java.util.Scanner;
public class Hesap {
    public static void main(String[] args) {
        int n1, n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        n2=input.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("\nLütfen bir işlem seçiniz:");
        select=input.nextInt();
        switch(select){
            case 1 :
                System.out.print("Toplam: "+(n1+n2));
                break;
            case 2 :
                System.out.print("Fark: "+(n1-n2));
                break;
            case 3 :
                System.out.print("Çarpım: "+(n1*n2));
                break;
            case 4 :
                switch(n2) {
                    case 0:
                        System.out.print("Hiçbir sayı 0'a bölünemez!");
                        break;
                    default :
                        System.out.print("Bölüm: "+(n1/n2));
                        break;
                }

                break;
            default:
                System.out.print("Yanlış seçim yaptınız.Lütfen tekrar deneyiniz.");
        }

    }
}

package patika;

import java.util.Scanner;

public class Sınıf_Gecme {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;
        Scanner sc = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz:");
        mat = sc.nextInt();
                if(mat>=100||mat<0){
                    System.out.println("hatalı not aralığı tekrar giriniz");
                    mat=sc.nextInt();
                }
        System.out.print("Fizik notunu giriniz:");
        fizik = sc.nextInt();
        System.out.print("Kimya notunu giriniz:");
        kimya = sc.nextInt();
        System.out.print("Türkçe notunu giriniz:");
        turkce = sc.nextInt();
        System.out.print("Müzik notunu giriniz:");
        muzik = sc.nextInt();
        double avarage = (mat + kimya + fizik + muzik + turkce) / 5;

            if (avarage > 55) {
                System.out.println("Tebrikler sınıfı geçtiniz");
            } else {
                System.out.println("Sınıfta kaldınız");
            }
        System.out.println("Ortalamanız:" + avarage);
    }
}

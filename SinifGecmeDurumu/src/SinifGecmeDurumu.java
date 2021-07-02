import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        System.out.print("Matematik notunuz:");
        mat = input.nextInt();
        while ((mat<0)||(mat>100)){
            System.out.print("Yanlış bir not gidiniz, Lütfen tekrar giriniz!\nMematik notunuz:");
            mat = input.nextInt();
        }
        System.out.print("Fizik notunuz:");
        fizik = input.nextInt();
        while ((fizik<0)||(fizik>100)){
            System.out.print("Yanlış bir not gidiniz, Lütfen tekrar giriniz!\nFizik notunuz:");
            fizik = input.nextInt();
        }
        System.out.print("Türkçe notunuz:");
        turkce = input.nextInt();
        while ((turkce<0)||(turkce>100)){
            System.out.print("Yanlış bir not gidiniz, Lütfen tekrar giriniz!\nTürkçe notunuz:");
            turkce = input.nextInt();
        }
        System.out.print("Kimya notunuz:");
        kimya = input.nextInt();
        while ((kimya<0)||(kimya>100)){
            System.out.print("Yanlış bir not gidiniz, Lütfen tekrar giriniz!\nKimya notunuz:");
            kimya = input.nextInt();
        }
        System.out.print("Müzik notunuz:");
        muzik = input.nextInt();
        while ((muzik<0)||(muzik>100)){
            System.out.print("Yanlış bir not gidiniz, Lütfen tekrar giriniz!\nMüzik notunuz:");
            muzik = input.nextInt();
        }
        double average =(mat+fizik+turkce+kimya+muzik)/5;
        if( average <= 55){
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");
        }else
            System.out.println("Tebrikler,Sınıf geçtiniz!");
        System.out.println("Ortalamanız: "+ average);

    }

}

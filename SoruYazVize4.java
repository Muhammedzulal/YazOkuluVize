import java.util.Scanner;

public class SoruYazVize4 {
    public static void main(String[] args) {
        try (Scanner k = new Scanner(System.in)) {
            int maks = 0;
            int min = 0;
            int sum = 0;
            int count = 0;
            for (int i = 1; i <= 30; i++) {
                System.out.print("Sayı: ");
                int sayi = k.nextInt();
                sum += sayi;
                // kaç sayı girildiğini saysın kesin 30 ise saymaya gerek yok direkt 30 da
                // bölünebilir
                count++;
                if (i == 1) {// ilk sayıyı min ve maks yapma
                    maks = sayi;
                    min = sayi;
                }
                if (sayi > maks) {// gelen sayi maks ten büyükse güncelle
                    maks = sayi;
                }
                if (sayi < min) {// gelen sayi min den küçükse güncelle
                    min = sayi;
                }
            }
            System.out.println("Maks: " + maks);
            System.out.println("Min: " + min);
            System.out.println("Otalama: " + sum / count);
        }
    }
}

import java.util.Scanner;

public class SoruYazVize2 {
    public static void main(String[] args) {
        try (Scanner k = new Scanner(System.in)) {
            int sum = 0;
            while (true) {
                System.out.print("Sayı: ");
                int sayi = k.nextInt();
                if (sayi == 0) // 0 girilirse döngüyü bitir.
                    break;
                sum += sayi;
            }
            System.out.println("Toplam: " + sum);
        }
    }
}

import java.util.Scanner;

public class SoruYazVize3 {
    public static void main(String[] args) {
        try (Scanner k = new Scanner(System.in)) {
            while (true) {
                System.out.print("String: ");
                String str = k.nextLine();
                if (str.toUpperCase().charAt(0) == 'A') // ilk harfi büyük yapıp kontrol et
                    System.out.println(str);
                if (str.charAt(0) == 'q')// ilk harfi küçük q ise çık
                    System.exit(0);
            }
        }
    }
}

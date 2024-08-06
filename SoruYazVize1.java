public class SoruYazVize1 {
    public static void main(String[] args) {
        int n = 10; // İlk 10 terimi yazdırmak istiyoruz
        int[] fibonacci = new int[n];

        // İlk iki terim 1
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Fibonacci dizisini oluşturma
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Fibonacci dizisini formatlı olarak yazdırma
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i]);
            if (i < n - 1) {
                System.out.print(" – ");
            }
        }
    }
}

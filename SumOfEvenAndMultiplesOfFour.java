import java.util.Scanner;

public class SumOfEvenAndMultiplesOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Toplamı saklamak için değişken
        int number;

        do {
            System.out.print("Bir sayı girin (Çıkış için 0): ");
            number = scanner.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number; // Çift ve 4'ün katı olan sayıyı toplama ekle
            }
        } while (number != 0);

        System.out.println("Toplam: " + sum);
        scanner.close();
    }
}
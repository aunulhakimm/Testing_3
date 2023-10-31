import java.util.Scanner;
/**
 * Program untuk menghitung keliling trapesium berdasarkan panjang sisi-sisi tertentu sesuai kemauan user ;).
 */
public class Main {

    private static double a;
    private static double b;
    private static double c;
    private static double d;

    /**
     * Metode utama yang akan dijalankan saat program dimulai.
     * Metode ini menerima input panjang sisi-sisi trapesium, menghitung kelilingnya,
     * dan mencetak hasil keliling trapesium ke layar.
     * @author Aunul Hakim
     * @see Main
     * @param args Argumen baris perintah nih cuy.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Keliling Trapesium");
        System.out.print("Masukkan panjang sisi sejajar pertama (a): ");
        a = getA(scanner.nextDouble());

        System.out.print("Masukkan panjang sisi sejajar kedua (b): ");
        b = getB(scanner.nextDouble());

        System.out.print("Masukkan panjang sisi miring pertama (c): ");
        c = getC(scanner.nextDouble());

        System.out.print("Masukkan panjang sisi miring kedua (d): ");
        d = getD(scanner.nextDouble());

        // Hitung keliling trapesium
        double rumus_trape = getA() + getB() + getC() + getD();

        System.out.println("Keliling Trapesium: " + rumus_trape);

        scanner.close();
    }

    private static double getD(double d) {
        return d;
    }

    private static double getC(double c) {
        return c;
    }

    private static double getB(double b) {
        return b;
    }

    private static double getA(double a) {
        return a;
    }

    public static double getD() {
        return d;
    }

    public static double getC() {
        return c;
    }

    public static double getB() {
        return b;
    }

    public static double getA() {
        return a;
    }
}
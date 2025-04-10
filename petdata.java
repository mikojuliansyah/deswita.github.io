import java.util.Scanner;

public class PetData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input nama hewan peliharaan
        System.out.print("Masukkan nama hewan peliharaan: ");
        String petName = scanner.nextLine();

        // Menerima input umur hewan peliharaan
        System.out.print("Masukkan umur hewan peliharaan (dalam tahun): ");
        String ageInput = scanner.nextLine();
        int petAge = Integer.parseInt(ageInput); // Konversi String ke int

        // Menerima input berat hewan peliharaan
        System.out.print("Masukkan berat hewan peliharaan (dalam kg): ");
        String weightInput = scanner.nextLine();
        double petWeight = Double.parseDouble(weightInput); // Konversi String ke double

        // Menampilkan data hewan peliharaan
        System.out.println("\nData Hewan Peliharaan:");
        System.out.println("Nama: " + petName);
        System.out.println("Umur: " + petAge + " tahun");
        System.out.println("Berat: " + petWeight + " kg");

        // Menutup scanner
        scanner.close();
    }
}

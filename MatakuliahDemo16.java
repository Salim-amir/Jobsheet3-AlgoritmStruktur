import java.util.Scanner;

public class MatakuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine();

        Matakuliah16[] arrayOfMatakuliah16 = new Matakuliah16[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMatakuliah16[i] = new Matakuliah16(); 
            arrayOfMatakuliah16[i].tambahData(sc); 
        }

        System.out.println("\n=== Data Mata Kuliah ===");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            arrayOfMatakuliah16[i].cetakInfo();
        }

        sc.close();
    }
}

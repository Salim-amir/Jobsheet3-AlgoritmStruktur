import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen16[] arrayOfDosen = new Dosen16[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode         : ");
            String kode = sc.nextLine();
            System.out.print("Nama         : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l'); // True jika L/l (Pria)
            System.out.print("Usia         : ");
            int usia = sc.nextInt();
            sc.nextLine(); // Buang newline

            arrayOfDosen[i] = new Dosen16(kode, nama, jenisKelamin, usia);
        }
        System.out.println("==========================");
        DataDosen16.dataSemuaDosen(arrayOfDosen);
        System.out.println("--------------------------");
        DataDosen16.jumlahDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("--------------------------");
        DataDosen16.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("--------------------------");
        DataDosen16.infoDosenPalingTua(arrayOfDosen);
        System.out.println("--------------------------");
        DataDosen16.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}

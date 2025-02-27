import java.util.Scanner;

public class Matakuliah16 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah16() {
        this.kode = "Belum Ada";
        this.nama = "Belum Ada";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public Matakuliah16(String kode,String nama,int sks,int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
      public void tambahData(Scanner sc) {
        System.out.print("KODE          : ");
        this.kode = sc.nextLine();
        System.out.print("NAMA          : ");
        this.nama = sc.nextLine();
        System.out.print("SKS           : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("JUMLAH JAM    : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("----------------------------------");
    }
    public void cetakInfo() {
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("SKS: " + this.sks);
        System.out.println("Jumlah Jam: " + this.jumlahJam);
        System.out.println("----------------------------------");
    }
}

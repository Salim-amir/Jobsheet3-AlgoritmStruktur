import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa16[] arrayOfMahasiswa16 = new Mahasiswa16[3];
        String dummy;

        for (int i=0 ; i <3 ; i++) {
            arrayOfMahasiswa16[i] = new Mahasiswa16();
            System.out.println("Masukkan Data Mahasiswa ke--" + (i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa16[i].nim = sc.nextLine();
            System.out.print("NAMA    : ");
            arrayOfMahasiswa16[i].nama = sc.nextLine();
            System.out.print("KELAS   : ");
            arrayOfMahasiswa16[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy  = sc.nextLine();
            arrayOfMahasiswa16[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------");
        }

        for (int i=0 ; i <3 ; i++) {
            System.out.println("Data Mahasiswa ke--" + (i+1));
            arrayOfMahasiswa16[i].cetakInfo();
       
         }
    }
}

public class DataDosen16 {

    public static void dataSemuaDosen(Dosen16[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen16 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJumlah Dosen:");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        System.out.println("\nRata-rata Usia Dosen:");
        System.out.println("Pria   : " + (jumlahPria > 0 ? (totalUsiaPria / jumlahPria) : 0));
        System.out.println("Wanita : " + (jumlahWanita > 0 ? (totalUsiaWanita / jumlahWanita) : 0));
    }
    public static void infoDosenPalingTua(Dosen16[] arrayOfDosen) {
        Dosen16 tertua = arrayOfDosen[0];
        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("\nDosen Paling Tua:");
        tertua.cetakInfo();
    }
    public static void infoDosenPalingMuda(Dosen16[] arrayOfDosen) {
        Dosen16 termuda = arrayOfDosen[0];
        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("\nDosen Paling Muda:");
        termuda.cetakInfo();
    }
}

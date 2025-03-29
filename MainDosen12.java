import java.util.Scanner;

public class MainDosen12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        DataDosen12 dataDosen = new DataDosen12();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Dosen");
            System.out.println("2. Lihat Data Dosen");
            System.out.println("3. Cari Dosen (Nama)");
            System.out.println("4. Cari Dosen (Usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc12.nextInt();
            sc12.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc12.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc12.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    boolean jk = sc12.nextLine().equalsIgnoreCase("L");
                    System.out.print("Usia: ");
                    int usia = sc12.nextInt();
                    sc12.nextLine();
                    dataDosen.tambah(new Dosen12(kode, nama, jk, usia));
                    break;
                case 2:
                    dataDosen.tampil();
                    break;
                case 3:
                    System.out.print("Masukkan Nama: ");
                    dataDosen.pencarianDataSequential12(sc12.nextLine());
                    break;
                case 4:
                    System.out.print("Masukkan Usia: ");
                    dataDosen.pencarianDataBinary12(sc12.nextInt());
                    sc12.nextLine();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

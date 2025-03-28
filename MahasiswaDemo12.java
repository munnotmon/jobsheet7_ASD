import java.util.Scanner;
public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc12.nextInt();
        sc12.nextLine(); 

        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM       : ");
            String nim = sc12.nextLine();
            System.out.print("Nama      : ");
            String nama = sc12.nextLine();
            System.out.print("Kelas     : ");
            String kelas = sc12.nextLine();
            System.out.print("IPK       : ");
            double ipk = sc12.nextDouble();
            sc12.nextLine(); 
            System.out.println("----------------------------");

            list.tambah(new Mahasiswa12(nim, nama, kelas, ipk));
        }   
    
        list.tampil();

        System.out.println("-------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc12.nextDouble();

        System.out.println("Menggunakan Sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) (posisi);
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("Menggunakan Binary Search");
        boolean descending = list.listMhs[0].ipk > list.listMhs[list.idx - 1].ipk;
        int posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1, descending);
        int pss2 = (int) (posisi2);
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
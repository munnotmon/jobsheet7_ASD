public class Mahasiswa12 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    public Mahasiswa12() {
    }
    
    public Mahasiswa12(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    
    public void tampilInformasi() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("IPK     : " + ipk);
        System.out.println("Kelas   : " + kelas);
    }
}
public class DataDosen12 {
    Dosen12[] dataDosen = new Dosen12[10];
    int idx = 0;

    void tambah(Dosen12 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx++] = dsn;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void pencarianDataSequential12(String nama) {
        boolean ditemukan = false;
        int count = 0;

        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                ditemukan = true;
                count++;
            }
        }

        if (!ditemukan) {
            System.out.println("Dosen tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ada lebih dari satu dosen dengan nama \"" + nama + "\".");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen12 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    
    void pencarianDataBinary12(int usia) {
        if (idx == 0) {
            System.out.println("Belum ada data untuk dicari.");
            return;
        }

        bubbleSort();

        int kiri = 0, kanan = idx - 1;
        boolean ditemukan = false;
        int count = 0;

        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;

            if (dataDosen[tengah].usia == usia) {
                for (int i = tengah; i >= 0 && dataDosen[i].usia == usia; i--) {
                    dataDosen[i].tampil();
                    ditemukan = true;
                    count++;
                }

                for (int i = tengah + 1; i < idx && dataDosen[i].usia == usia; i++) {
                    dataDosen[i].tampil();
                    count++;
                }
                break;
            } else if (dataDosen[tengah].usia < usia) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Dosen dengan usia tersebut tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ada lebih dari satu dosen dengan usia " + usia + ".");
        }
    }
}

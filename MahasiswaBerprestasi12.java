class MahasiswaBerprestasi12 {
    Mahasiswa12[] listMhs = new Mahasiswa12[5];
    int idx = 0;

    public void tambah(Mahasiswa12 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("----------------------------");
        }
    }

    public int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int findBinarySearch(double cari, int left, int right, boolean descending) {
        if (right >= left) {
            int mid = (left + right) / 2;
    
            if (listMhs[mid].ipk == cari) {
                return mid;
            }
    
            if (descending) { // Jika data descending
                if (listMhs[mid].ipk < cari) {
                    return findBinarySearch(cari, left, mid - 1, descending); 
                } else {
                    return findBinarySearch(cari, mid + 1, right, descending);
                }
            } else { // Jika data ascending
                if (listMhs[mid].ipk > cari) {
                    return findBinarySearch(cari, left, mid - 1, descending); 
                } else {
                    return findBinarySearch(cari, mid + 1, right, descending); 
                }
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {     
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM   : " + listMhs[pos].nim);
            System.out.println("Nama  : " + listMhs[pos].nama);
            System.out.println("Kelas : " + listMhs[pos].kelas);
            System.out.println("IPK   : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
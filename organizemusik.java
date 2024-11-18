package Tugas5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class OrganizerMusik {
    private ArrayList<Musik> daftarMusik;

    public OrganizerMusik() {
        daftarMusik = new ArrayList<>();
    }

    public void tambahMusik(Musik musik) {
        daftarMusik.add(musik);
    }

    public void hapusMusik(String judul) {
        daftarMusik.removeIf(m -> m.getJudul().equalsIgnoreCase(judul));
    }

    public Musik cariMusik(String judul) {
        for (Musik musik : daftarMusik) {
            if (musik.getJudul().equalsIgnoreCase(judul)) {
                return musik;
            }
        }
        return null;
    }

    public void updateMusik(String judulLama, Musik musikBaru) {
        for (int i = 0; i < daftarMusik.size(); i++) {
            if (daftarMusik.get(i).getJudul().equalsIgnoreCase(judulLama)) {
                daftarMusik.set(i, musikBaru);
                return;
            }
        }
    }

    public void urutkanMusik() {
        Collections.sort(daftarMusik, Comparator.comparing(Musik::getJudul));
    }

    public void tampilkanMusik() {
        for (Musik musik : daftarMusik) {
            System.out.println(musik);
        }
    }

    public int jumlahMusik() {
        return daftarMusik.size();
    }
}


package Tugas5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrganizerMusik organizer = new OrganizerMusik();
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Musik");
            System.out.println("2. Hapus Musik");
            System.out.println("3. Cari Musik");
            System.out.println("4. Update Musik");
            System.out.println("5. Urutkan Musik");
            System.out.println("6. Tampilkan Semua Musik");
            System.out.println("7. Jumlah Total Musik");
            System.out.println("8. Keluar");

            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan judul musik: ");
                    String judulTambah = scanner.nextLine();
                    System.out.print("Masukkan artis musik: ");
                    String artisTambah = scanner.nextLine();
                    organizer.tambahMusik(new Musik(judulTambah, artisTambah));
                    break;

                case 2:
                    System.out.print("Masukkan judul musik yang ingin dihapus: ");
                    String judulHapus = scanner.nextLine();
                    organizer.hapusMusik(judulHapus);
                    break;

                case 3:
                    System.out.print("Masukkan judul musik yang ingin dicari: ");
                    String judulCari = scanner.nextLine();
                    Musik musikDitemukan = organizer.cariMusik(judulCari);
                    if (musikDitemukan != null) {
                        System.out.println("Musik ditemukan: " + musikDitemukan);
                    } else {
                        System.out.println("Musik tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan judul musik yang ingin diupdate: ");
                    String judulLama = scanner.nextLine();
                    System.out.print("Masukkan judul musik baru: ");
                    String judulBaru = scanner.nextLine();
                    System.out.print("Masukkan artis musik baru: ");
                    String artisBaru = scanner.nextLine();
                    organizer.updateMusik(judulLama, new Musik(judulBaru, artisBaru));
                    break;

                case 5:
                    organizer.urutkanMusik();
                    System.out.println("Musik telah diurutkan.");
                    break;

                case 6:
                    organizer.tampilkanMusik();
                    break;

                case 7:
                    System.out.println("Jumlah total musik: " + organizer.jumlahMusik());
                    break;

                case 8:
                    running = false;
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
        System.out.println("Program selesai.");
    }
}


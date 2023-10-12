package posttest2.project;
import ghufta.project.ghufta;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public  final class posttest2 {  
    public final static void main(String[] args) {
        ArrayList<ghufta> daftarLaptop = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Selamat Datang di Ghufta!!!");
            System.out.println("Menu : ");
            System.out.println("1. Tambah Laptop");
            System.out.println("2. Daftar Laptop");
            System.out.println("3. Cari Laptop");
            System.out.println("4. Update Laptop");
            System.out.println("5. Hapus Laptop");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");
            String pilihan = scanner.nextLine();
            switch (pilihan) {
                case "1":
                    System.out.print("Input nama laptop : ");
                    String nama = scanner.nextLine();
                    System.out.print("Input merk laptop : ");
                    String merk = scanner.nextLine();
                    System.out.print("Input harga laptop : ");
                    double harga = Double.parseDouble(scanner.nextLine());
                    ghufta laptop = new ghufta(nama, merk, harga);
                    daftarLaptop.add(laptop);
                    System.out.println("Laptop berhasil ditambahkan");
                    break;
                case "2":
                    if (daftarLaptop.isEmpty()) {
                        System.out.println("Laptop tersebut tidak ada");
                    } else {
                        System.out.println("Daftar laptop : ");
                        for (ghufta p : daftarLaptop) {
                            System.out.println(p);
                        }
                    }
                    break;
                case "3":
                    System.out.print("Input nama laptop yang dicari : ");
                    String namaCari = scanner.nextLine();
                    boolean ditemukan = false;
                    for (ghufta p : daftarLaptop) {
                        if (p.getNama().equalsIgnoreCase(namaCari)) {
                            System.out.println("Laptop ditemukan : ");
                            System.out.println(p);
                            ditemukan = true;
                            break;
                        }
                    }
                        if (!ditemukan) {
                        System.out.println("Laptop tidak ditemukan");
                    }
                    break;                    
                case "4":
                    System.out.print("Input laptop yang ingin diupdate : ");
                    String namaUpdate = scanner.nextLine();
                    boolean ditemukanUpdate = false;
                    for (int i = 0; i < daftarLaptop.size(); i++) {
                        ghufta s = daftarLaptop.get(i);
                        if (s.getNama().equalsIgnoreCase(namaUpdate)) {
                            System.out.print("Input nama baru : ");
                            String Namabaru = scanner.nextLine();
                            System.out.print("Input merk baru: ");
                            String Merkbaru = scanner.nextLine();
                            System.out.print("Input harga baru: ");
                            double Hargabaru = scanner.nextDouble();                            
                            ghufta Laptopbaru = new ghufta(Namabaru, Merkbaru, Hargabaru);                            
                            daftarLaptop.set(i, Laptopbaru);
                            System.out.println("Laptop berhasil diupdate");
                            ditemukanUpdate = true;
                            break;
                        }
                    }
                    if (!ditemukanUpdate) {
                        System.out.println("Laptop tidak ditemukan");
                    }
                    break;                    
                case "5":
                    System.out.print("Input laptop yang ingin dihapus : ");
                    String Hapuslaptop = scanner.nextLine();
                    Iterator<ghufta> iterator = daftarLaptop.iterator();
                    while (iterator.hasNext()) {
                        ghufta Objeklaptop = iterator.next();
                        if (Objeklaptop.getNama().equalsIgnoreCase(Hapuslaptop)) {
                            iterator.remove(); 
                        }
                    }
                    break;
                case "6":
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan anda tidak valid. Silakan pilih lagi");
            }
        }
    }
}
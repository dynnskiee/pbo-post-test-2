## Nama : Muslim Nur Wahid
## NIM : 2209116070
## Praktikum : Post Test 2 PBO

![image](https://github.com/saecx/pbo-post-test-2/assets/127154003/92a2caaf-c9c9-48a8-930a-dbeed87b9382)
# 1. package ghufta.project;
Ini adalah deklarasi paket (package) di mana kelas "ghufta" berada. Kode ini menempatkan kelas "ghufta" dalam paket yang disebut "ghufta.project."
# 2. import java.text.DecimalFormat;
Kode ini mengimpor kelas DecimalFormat dari pustaka (library) Java. DecimalFormat digunakan untuk memformat angka menjadi tampilan yang sesuai.
# 3. public final class ghufta {
Ini adalah deklarasi kelas "ghufta." Kode ini juga menandai kelas sebagai "final," yang berarti kelas ini tidak dapat diwariskan (di-extend).
# 4. private final  String nama;
#    private final String merk;
#    private double harga;
Kode ini memiliki tiga atribut untuk menyimpan informasi tentang produk "ghufta":
nama (bertipe String) untuk menyimpan nama produk.
merk (bertipe String) untuk menyimpan merk produk.
harga (bertipe double) untuk menyimpan harga produk.
# 5. public ghufta(String nama, String merk, double harga) {
#    this.nama = nama;
#    this.merk = merk;
#    this.harga = harga;
# }
Ini adalah konstruktor kelas "ghufta." Ketika objek "ghufta" dibuat, atribut-atributnya diinisialisasi dengan nilai yang diberikan saat pembuatan objek.
# 6. public String getNama() {
#    return nama;
# }
#    public String getMerk() {
#    return merk;
# }
#    public double getHarga() {
#    return harga;
# }
Ini adalah metode getter yang digunakan untuk mengambil nilai dari atribut "nama," "merk," dan "harga."
# 7. public String toString() {
#    DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
#    String formattedHarga = decimalFormat.format(harga);
#    return "Nama: " + nama + ", Merk: " + merk + ", Harga: Rp " + formattedHarga;
# }
Metode toString() meng-override metode toString() dari kelas Object. Metode ini digunakan untuk menghasilkan representasi teks objek "ghufta." Harga diformat menggunakan DecimalFormat untuk menampilkan harga dalam format yang sesuai.
# 8. public final void setHarga(double harga) {
#    this.harga = harga;
# }
Metode ini memungkinkan pengaturan ulang harga objek "ghufta" dengan harga baru.

![image](https://github.com/saecx/pbo-post-test-2/assets/127154003/6f2f5043-8c35-4655-a578-eadb6959a9dd)
![image](https://github.com/saecx/pbo-post-test-2/assets/127154003/6f7debab-be28-4942-a17b-964a4f8a8c8a)
![image](https://github.com/saecx/pbo-post-test-2/assets/127154003/ff17d7e5-9116-411a-b17c-fddb61e188de)
# 1. package posttest2.project;
Ini adalah deklarasi paket (package) di mana kelas "posttest2" berada. Kode ini menempatkan kelas "posttest2" dalam paket yang disebut "posttest2.project."
# 2. import ghufta.project.ghufta;
Kode ini mengimpor kelas "ghufta" dari paket "ghufta.project." Ini mengindikasikan bahwa program ini bergantung pada kelas "ghufta" untuk merepresentasikan data laptop.
# 3. public final class posttest2 {
Ini adalah deklarasi kelas "posttest2." Kode ini juga menandai kelas sebagai "final," yang berarti kelas ini tidak dapat diwariskan.
# 4. ArrayList<ghufta> daftarLaptop = new ArrayList<>();
# Scanner scanner = new Scanner(System.in);
Ini adalah deklarasi dan inisialisasi ArrayList yang digunakan untuk menyimpan objek-objek "ghufta" (laptop) yang diinput oleh pengguna, dan juga objek Scanner yang digunakan untuk menerima input pengguna.
# 5. while (true) {
#            System.out.println("Selamat Datang di Ghufta!!!");
#            System.out.println("Menu : ");
#            System.out.println("1. Tambah Laptop");
#            System.out.println("2. Daftar Laptop");
#            System.out.println("3. Cari Laptop");
#            System.out.println("4. Update Laptop");
#            System.out.println("5. Hapus Laptop");
#            System.out.println("6. Keluar");
#            System.out.print("Pilihan : ");
#            String pilihan = scanner.nextLine();
Program memulai dengan menampilkan pesan selamat datang dan menu interaktif yang mencakup 6 opsi.
Pengguna diminta untuk memilih opsi dengan memasukkan nomor opsi yang sesuai.
Switch Statement:

Program menggunakan pernyataan switch untuk memproses pilihan pengguna. Bergantung pada pilihan yang dimasukkan, program akan melakukan aksi yang sesuai.
Opsi 1 - Tambah Laptop:

Pengguna dapat memasukkan informasi tentang laptop, termasuk nama, merk, dan harga.
Objek "ghufta" yang baru dibuat dan ditambahkan ke dalam ArrayList "daftarLaptop."
Opsi 2 - Daftar Laptop:

Jika ArrayList kosong, program akan memberi tahu pengguna bahwa daftar laptop kosong.
Jika tidak, program akan menampilkan daftar laptop yang telah ditambahkan.
Opsi 3 - Cari Laptop:

Pengguna dapat mencari laptop berdasarkan nama.
Program akan mencari dalam ArrayList apakah ada laptop dengan nama yang sesuai.
Opsi 4 - Update Laptop:

Pengguna dapat memperbarui informasi laptop berdasarkan nama laptop yang sudah ada.
Program akan mencari laptop dengan nama yang sesuai dan meminta input pengguna untuk mengganti informasi laptop tersebut.
Opsi 5 - Hapus Laptop:

Pengguna dapat menghapus laptop berdasarkan nama laptop yang sudah ada.
Program akan mencari laptop dengan nama yang sesuai dan menghapusnya dari ArrayList.
Opsi 6 - Keluar:

Jika pengguna memilih opsi ini, program akan menampilkan pesan terima kasih, menutup objek Scanner, dan keluar dari program.
Default Case:

Jika pengguna memasukkan pilihan yang tidak valid, program akan memberikan pesan kesalahan dan meminta pengguna untuk memilih lagi.

![image](https://github.com/saecx/pbo-post-test-2/assets/127154003/0049c81d-3681-4013-9780-316c67fcd625)
![image](https://github.com/saecx/pbo-post-test-2/assets/127154003/eeb8fb8f-374f-4a76-9af5-fd75d84eed1a)
![image](https://github.com/saecx/pbo-post-test-2/assets/127154003/9012b635-a95f-423b-b749-d00bf6d4c8e3)
![image](https://github.com/saecx/pbo-post-test-2/assets/127154003/a4b6aa93-ac45-42fe-aff6-aa16ba16c002)
![image](https://github.com/saecx/pbo-post-test-2/assets/127154003/1904bc07-caf9-4232-8af7-45ab4e8806c1)

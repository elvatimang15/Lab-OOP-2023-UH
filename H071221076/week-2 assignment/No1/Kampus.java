class Kampus {
    // Atribut  (status sebuah objek)
    String nama;
    String alamat;
    int jumlahfakultas;

    // Behavior (tingkah laku dari objek)
    void infoKampus() {
        System.out.println("Nama kampus: " + nama);
        System.out.println("Alamat kampus: " + alamat);
        System.out.println("Jumlah fakultas: " + jumlahfakultas);
        
    }

//public class main {
    public static void main(String[] args) {
        Kampus kampus = new Kampus();

        // Mengisi nilai atribut
        kampus.nama = "Universitas Hasanuddin";
        kampus.alamat = "Jl. Perintis Kemerdekaan KM.10 Kota Makassar";
        kampus.jumlahfakultas = 17;

        // Memanggil behavior
        kampus.infoKampus();
    }
}
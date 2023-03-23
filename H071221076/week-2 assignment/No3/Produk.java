public class Produk {
    private int id;
    private String nama;
    private int stok;
    private double harga;

    public Produk(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return stok > 0;
    }
    
//     public static void main(String[] args) {
//         Produk produk1 = new Produk(111, "Kipas angin meja", 38, 215000);
//         Produk produk2 = new Produk(222, "Kipas angin dinding", 0, 395000);

//         // TODO : Ubah menjadi function

//         System.out.println("ID produk 1: " + produk1.getId());
//         System.out.println("Nama produk 1: " + produk1.getNama());
//         System.out.println("Stok produk 1: " + produk1.getStok());
//         System.out.println("Harga produk 1: " + produk1.getHarga());
//         System.out.println("Apakah produk 1 tersedia di stok? " + produk1.isTersedia());

//         System.out.println("ID produk 2: " + produk2.getId());
//         System.out.println("Nama produk 2: " + produk2.getNama());
//         System.out.println("Stok produk 2: " + produk2.getStok());
//         System.out.println("Harga produk 2: " + produk2.getHarga());
//         System.out.println("Apakah produk 2 tersedia di stok? " + produk2.isTersedia());
//     }
// }

public static void main(String[] args) {
    Produk produk1 = new Produk(111, "Kipas angin meja", 38, 215000);
    Produk produk2 = new Produk(222, "Kipas angin dinding", 0, 395000);

    printProdukInfo(produk1);
    printProdukInfo(produk2);
}

public static void printProdukInfo(Produk produk) {
    System.out.println("ID produk: " + produk.getId());
    System.out.println("Nama produk: " + produk.getNama());
    System.out.println("Stok produk: " + produk.getStok());
    System.out.println("Harga produk: " + produk.getHarga());
    System.out.println("Apakah produk tersedia di stok? " + produk.isTersedia());
}
}
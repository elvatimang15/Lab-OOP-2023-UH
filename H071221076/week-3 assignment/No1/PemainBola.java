public class PemainBola {
    // Attribute
    private String nama;
    private int jumlahgol;
    private int level; //1= Internasional, 2 = Nasional

    // Constructor 1
    public PemainBola(String nama, int jumlahgol) {
        this.nama = nama;
        this.jumlahgol = jumlahgol;
    }

    // Constructor 2
    public PemainBola(String nama, int jumlahgol, int level) {
        this.nama = nama;
        this.jumlahgol = jumlahgol;
        this.level = level;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahgol() {
        return jumlahgol;
    }

    public void setJumlahgol(int jumlahgol) {
        this.jumlahgol = jumlahgol;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Behavior 1 : Mengembalikan keterbalikan gol berdasarkan jumlah gol
    public int keterlibatanGol() {
        if (jumlahgol >= 500) {
            return jumlahgol ;
        } else if (jumlahgol <= 499) {
            return jumlahgol;
        } else {
            return 3;
    }
}

    // Behavior 2 : Menambah nilai pada objek
    public void assist(int assist) {
        jumlahgol += assist;
    }

    // Menampilkan informasi PemainBola
    public void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah gol : " + jumlahgol);
        System.out.println("Keterlibatan gol : " + keterlibatanGol());
        System.out.println("Level : " + level + "\n");
    }
}

    class Main {
        public static void main(String[] args) {
            PemainBola pemainBola1 = new PemainBola("Cristiano Ronaldo", 824, 1);
            PemainBola pemainBola2 = new PemainBola("Witan Sulaeman", 6, 2);
        
            pemainBola1.tampilInfo();
            pemainBola2.tampilInfo();
            //pemainBola1.assist(234);
            pemainBola2.assist(6);
            System.out.println("Setelah ditambah keterlibatan gol pada Pemain Bola 1 & 2 : " + "\n");
            pemainBola1.tampilInfo();
            pemainBola2.tampilInfo();
        }
    }
import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private int balance;

    public User(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void reduceBalance(int balance) {
        this.balance = this.balance - balance;
    }
    public void userCard(){
        System.out.println("-----CARD-----");
        System.out.println(this.getName());
        System.out.println(this.getBalance());
        System.out.println("--------------");
    } 
}

class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public Product(String name, String price, int stock) {
        this.name = name;
        this.stock = stock;
        
        if (price.contains("$")) {
            price = price.replace("$", "");
            this.price = Integer.parseInt(price) * 1000;
        } else {
            this.price = Integer.parseInt(price);
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() { 
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void sell() {
        stock--;
    }
}
class Store {
    public String name;
    public ArrayList<Product> products;

    public Store(String name, ArrayList<Product> product){
        this.name = name;
        this.products = product;
    }

    //behavior
    public void addProduct(Product product) {
        products.add(product);
    }
    //thiss
    public void listProducts() {
        System.out.printf("Selamat Datang di %s%n", this.name);
        System.out.println("Daftar Produk :");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - $" + product.getPrice() + " | stok " + product.getStock());
        }
    }
    public void buyProduct(User user, int productIndex) {
        Product product = products.get(productIndex);
        if (user.getBalance() >= product.getPrice()) {
            user.reduceBalance(product.getPrice());
            product.sell();

            if (product.getStock() == 0) {
                products.remove(productIndex);
            }
            System.out.println(user.getName() + " berhasil membeli " + product.getName());
        } else {
            System.out.println("Maaf, saldo tidak cukup untuk membeli produk ini.");
        }
    }
}
public class No3 {
    public static void main(String[] args) {
        // Inisialisasi data user
        User user = new User("Elva", 3000);
        // Inisialisasi data store
        ArrayList<Product> product = new ArrayList<>();
        product.add(new Product("HP Pavilion Gaming 15", "2000", 15));
        product.add(new Product("ASUS VivoBook 15 A516MAO N4020", "4000", 4));
        product.add(new Product("Lenovo IdeaPad", 1500, 2));

        Store toko = new Store("Sisfo Computer", product);

        // Objek Scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Looping untuk melakukan transaksi pembelian produk
        while (true) {
            user.userCard();
            toko.listProducts();
            System.out.println("0. Keluar");
            System.out.print("> ");
            int pilihan = input.nextInt();
            
            // Kode untuk membeli produk
            if (pilihan >= 1 && pilihan <= toko.products.size()) {
                while (true) {
                    // Konfirmasi pembelian
                    System.out.println("Apakah anda yakin ingin membeli?");
                    System.out.println("1. Konfirmasi");
                    System.out.println("2. Batal");
                    System.out.print("> ");
                    int konfirmasi = input.nextInt();
                    if (konfirmasi == 1 ){
                            toko.buyProduct(user, pilihan-1);
                            break;
                    } else {
                        break;
                    }
                }
            } else {break;}
        }
            input.close();
    }
}
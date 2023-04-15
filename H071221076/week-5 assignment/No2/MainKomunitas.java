public class MainKomunitas {
    public static void main(String[] args) {
        KetuaUmum ketuaUmum = new KetuaUmum("Angin", 19, "Laki-Laki");
        Sekretaris sekretaris = new Sekretaris("Air", 19, "Perempuan");
        Bendahara bendahara = new Bendahara("Terik", 19, "Perempuan");
        ketuaUmum.showKetuaUmum();
        System.out.println();
        sekretaris.showSekretaris();
        System.out.println();
        bendahara.showBendahara();
        System.out.println();

        MinatBakat minatBakat1 = new MinatBakat("Guntur", 19, "Laki-Laki", true);
        MinatBakat minatBakat2 = new MinatBakat("Petir", 18, "Laki-Laki", false);
        System.out.println("Koordinator " + minatBakat1.bidang );
        System.out.println("Nama : " + minatBakat1.getName());
        System.out.println("Umur : " + minatBakat1.getAge());
        System.out.println("Gender : " + minatBakat1.getGender());
        System.out.println();
        System.out.println("Anggota " + minatBakat2.bidang);
        System.out.println("Nama : " + minatBakat2.getName());
        System.out.println("Umur : " + minatBakat2.getAge());
        System.out.println("Gender : " + minatBakat2.getGender());
        System.out.println();

        SaranaPrasarana saranaPrasarana1 = new SaranaPrasarana("Halilintar", 19, "Laki-Laki", true);
        SaranaPrasarana saranaPrasarana2 = new SaranaPrasarana("Badai", 18, "Laki-Laki", false);
        System.out.println("Koordinator " + saranaPrasarana1.bidang );
        System.out.println("Nama : " + saranaPrasarana1.getName());
        System.out.println("Umur : " + saranaPrasarana1.getAge());
        System.out.println("Gender : " + saranaPrasarana1.getGender());
        System.out.println();
        System.out.println("Anggota " + saranaPrasarana2.bidang);
        System.out.println("Nama : " + saranaPrasarana2.getName());
        System.out.println("Umur : " + saranaPrasarana2.getAge());
        System.out.println("Gender : " + saranaPrasarana2.getGender());
        System.out.println();

        HubunganMasyarakat hMasyarakat1 = new HubunganMasyarakat("Hujan", 19, "Laki-Laki", true);
        HubunganMasyarakat hMasyarakat2 = new HubunganMasyarakat("Panass", 18, "Perempuan", false);
        System.out.println("Koordinator " + hMasyarakat1.bidang );
        System.out.println("Nama : " + hMasyarakat1.getName());
        System.out.println("Umur : " + hMasyarakat1.getAge());
        System.out.println("Gender : " + hMasyarakat1.getGender());
        System.out.println();
        System.out.println("Anggota " + hMasyarakat2.bidang);
        System.out.println("Nama : " + hMasyarakat2.getName());
        System.out.println("Umur : " + hMasyarakat2.getAge());
        System.out.println("Gender : " + hMasyarakat2.getGender());
        System.out.println();

    }
}
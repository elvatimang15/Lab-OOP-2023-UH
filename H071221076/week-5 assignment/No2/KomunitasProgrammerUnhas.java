public class KomunitasProgrammerUnhas {
    String nama;
    int umur;
    String gender;

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return umur;
    }

    public void setAge(int umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class PengurusInti extends KomunitasProgrammerUnhas{
    String jabatan;

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

class KetuaUmum extends PengurusInti{
    public KetuaUmum(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Ketua Umum Komunitas";
    }

    public void showKetuaUmum() {
        System.out.println(this.jabatan);
        System.out.println("Nama : " + this.getName());
        System.out.println("Umur  : " + this.getAge());
        System.out.println("Gender : " + this.getGender());
    }
}

class Sekretaris extends PengurusInti{
    public Sekretaris(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Sekertaris Komunitas";
    }

    public void showSekretaris() {
        System.out.println(this.jabatan);
        System.out.println("Nama : " + this.getName());
        System.out.println("Umur  : " + this.getAge());
        System.out.println("Gender : " + this.getGender());
    }
}

class Bendahara extends PengurusInti{
    public Bendahara(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Bendahara Komunitas";
    }

    public void showBendahara() {
        System.out.println(this.jabatan);
        System.out.println("Nama : " + this.getName());
        System.out.println("Umur  : " + this.getAge());
        System.out.println("Gender : " + this.getGender());
    }
}

class KordinatorBidangStaff extends KomunitasProgrammerUnhas{
    String bidang;
    boolean isKoor;
    String jabatan;

    public String getJabatan() {
        if (isKoor) {
            return "Koordinator";
        } else {
            return "Anggota";
        }
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
}

class MinatBakat extends KordinatorBidangStaff {
    public MinatBakat(String nama, int umur, String gender, boolean isKoor) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.bidang = "Minat Bakat";
        this.jabatan = this.getJabatan();
    }
}

class SaranaPrasarana extends KordinatorBidangStaff {
    public SaranaPrasarana(String nama, int umur, String gender, boolean isKoor) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.bidang = "Sarana Prasarana";
        this.jabatan = this.getJabatan();
    }
}

class HubunganMasyarakat extends KordinatorBidangStaff {
    public HubunganMasyarakat(String nama, int umur, String gender, boolean isKoor) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.bidang = "Hubungan Masyarakat";
        this.jabatan = this.getJabatan();
    }
}
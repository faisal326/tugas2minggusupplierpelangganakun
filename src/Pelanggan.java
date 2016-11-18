
public class Pelanggan {
private String kode;
private String nama;
private String alamat;
private String notelp;

    public Pelanggan(String kode, String nama, String alamat, String notelp) {
        this.kode= kode;
        this.nama= nama;
        this.alamat= alamat;
        this.notelp= notelp;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public Pelanggan() {
    }

}

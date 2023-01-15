public class Promosyon { //product
    public String urunAdi;
    public int promosyonNumarasi;
    public String calisanProfili;

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getPromosyonNumarasi() {
        return promosyonNumarasi;
    }

    public void setPromosyonNumarasi(int promosyonNumarasi) {
        this.promosyonNumarasi = promosyonNumarasi;
    }

    public String getCalisanProfili() {
        return calisanProfili;
    }

    public void setCalisanProfili(String calisanProfili) {
        this.calisanProfili = calisanProfili;
    }

    @Override
    public String toString() {
        return getPromosyonNumarasi() + " numarali " + getUrunAdi() + " promosyonu " + getCalisanProfili() + " calisanlarina verilmiştir";
    }
}

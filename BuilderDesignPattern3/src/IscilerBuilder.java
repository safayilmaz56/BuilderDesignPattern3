public class IscilerBuilder extends PromosyonBuilder{

    public IscilerBuilder() {
        promosyon = new Promosyon();
    }

    @Override
    public void setUrunAdi() {
        promosyon.urunAdi = "Ceket";
    }

    @Override
    public void setPromosyonNumarasi() {
        promosyon.promosyonNumarasi = 270;
    }

    @Override
    public void setCalisanProfili() {
        promosyon.calisanProfili = "İsçiler";
    }
}

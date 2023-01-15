public class AmirlerConcreteBuilder extends PromosyonBuilder{

    public AmirlerConcreteBuilder() {
        promosyon = new Promosyon();
    }

    @Override
    public void setUrunAdi() {
        promosyon.urunAdi = "Job";
    }

    @Override
    public void setPromosyonNumarasi() {
        promosyon.promosyonNumarasi = 100;
    }

    @Override
    public void setCalisanProfili() {
        promosyon.calisanProfili = "Amirler";
    }
}

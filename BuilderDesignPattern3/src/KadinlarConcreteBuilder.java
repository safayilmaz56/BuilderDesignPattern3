public class KadinlarConcreteBuilder extends PromosyonBuilder{

    public KadinlarConcreteBuilder() {
        promosyon = new Promosyon();
    }

    @Override
    public void setUrunAdi() {
        promosyon.urunAdi = "Tesbih";
    }

    @Override
    public void setPromosyonNumarasi() {
        promosyon.promosyonNumarasi = 125;
    }

    @Override
    public void setCalisanProfili() {
        promosyon.calisanProfili = "Kadinlar";
    }
}

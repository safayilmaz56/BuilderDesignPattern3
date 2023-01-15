public abstract class PromosyonBuilder { //abstract builder
    protected  Promosyon promosyon;
    public Promosyon getPromosyon(){
        return  promosyon;
    }

    public abstract void setUrunAdi();
    public abstract void setPromosyonNumarasi();
    public abstract void setCalisanProfili();
}

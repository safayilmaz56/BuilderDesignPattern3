public class Main {
    public static void main(String[] args) {
        PromosyonBuilder Promosyon = new AmirlerConcreteBuilder();
        PromosyonGonder gonder = new PromosyonGonder();
        gonder.Gonder(Promosyon);
        System.out.println(Promosyon.promosyon.toString());

        System.out.println("****************");

        Promosyon = new KadinlarConcreteBuilder();
        gonder.Gonder(Promosyon);
        System.out.println(Promosyon.promosyon.toString());
    }
}
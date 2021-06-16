public class main {
    public static void main(String[] args) {
            Director director = new Director();
            Buider buider;
            buider=(Buider)XMLUtil.getBean();
            director.setBuider(buider);
            Product product;
            product=director.construct();
            System.out.println(product.getPartA());
            System.out.println(product.getPartB());
            System.out.println(product.getPartC());

    }
}

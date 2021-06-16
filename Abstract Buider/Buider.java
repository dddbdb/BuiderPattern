public abstract class Buider {
    protected  Product product=new Product();
    public abstract void buidPartA();
    public abstract void buidPartB();
    public abstract void buidPartC();

    public Product getResult() {
        return product;
    }
}

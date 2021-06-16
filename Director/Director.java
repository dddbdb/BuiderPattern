public class Director {
    private Buider buider;

    public void setBuider(Buider buider) {
        this.buider = buider;
    }

    public Product construct(){
        buider.buidPartA();
        buider.buidPartB();
        buider.buidPartC();
        return buider.getResult();
    }
}

package ch09.sec01;


public class GenericExample2 {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("Smart TV");

        String model = product1.getModel();
        System.out.println("model = " + model);

        //----------------------------------

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("Sports Car");

        String model2 = product2.getModel();
        System.out.println("model2 = " + model2);
    }
}

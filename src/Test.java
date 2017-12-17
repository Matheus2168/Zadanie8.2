public class Test {

    public static void main(String[] args) {

        CarCollection collection = new CarCollection(3);

        Car c1 = CarCreator.createCar();
        collection.addToCollection(c1);

        Car c2 = CarCreator.createCar();
        collection.addToCollection(c2);

        Car c3 = CarCreator.createCar();
        collection.addToCollection(c3);

        System.out.println(collection.toString());









    }

}

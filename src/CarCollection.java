import java.util.Arrays;

public class CarCollection {

    private Car[] carCollection;


    public CarCollection(int size) {
        this.carCollection = new Car[size];
    }


    public void addToCollection(Car car){
        if (!isDuplicated(car)) {
            carCollection[findEmptyIndex()] = car;
        }
        else {
            System.out.println("Wpis juz istnieje! ! ! PODAJ NOWE DANE : ");
            car = CarCreator.createCar();
            addToCollection(car);
        }
    }


    private int findEmptyIndex(){
        int result = -1;
        for (int i = 0 ; i < carCollection.length ; i++){
            if (carCollection[i] == null){
                result = i;
            }
        }
        return result;
    }

    private boolean isDuplicated(Car newCar){
        boolean result = false;
        for (Car car : carCollection) {
            if (car != null && car.equals(newCar)){
                result = true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "Twoja kolekcja samochodów: ";
        for (Car car : carCollection) {
            if (car != null){
                result+= car.getName()+", ";
            }

        }
        return result;
    }
}

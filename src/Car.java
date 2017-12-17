public class Car {

    private String name;
    private int productionYear;
    private double power;


    public Car(String name, int productionYear, double power) {
        this.name = name;
        this.productionYear = productionYear;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public double getPower() {
        return power;
    }

    @Override
    public boolean equals(Object obj) {
        if(this== obj)
            return true;
        if(obj== null)
            return false;
        if(!(obj instanceof Car))
            return false;
        Car other= (Car) obj;
        if(name== null) {
            if(other.name!= null)
                return false;
        }
        else if(!name.equals(other.name))
            return false;
        if(productionYear!= other.productionYear)
            return false;
        if (power!= other.power)
            return false;
        return true;
    }
}

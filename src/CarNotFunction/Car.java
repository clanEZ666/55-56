package CarNotFunction;

public class Car {
    private String model;
    private String color;


    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", color=" + color + '}';
    }
}
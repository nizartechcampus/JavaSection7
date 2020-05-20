public class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;



    public Car(String name, int cylinder) {
        this.name = name;
        this.engine = true;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }
    public int getCylinder() {
        return cylinder;
    }
    public String startEngine(){
        return "Car ---> startEngine() ";
    }
    public String accelerate(){
        return "Car ---> accelerate() ";
    }
    public String brake(){
        return "Car ---> brake() ";
    }
}


class mitsubishi extends Car{
    public mitsubishi(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ "is accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ "is brake";
    }
}

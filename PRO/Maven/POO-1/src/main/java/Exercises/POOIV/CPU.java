package Exercises.POOIV;

public class CPU {
    private String model;
    private double speed;

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}

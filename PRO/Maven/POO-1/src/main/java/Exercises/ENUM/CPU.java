package Exercises.ENUM;

public class CPU {
    private CPUEnum model;
    private double speed;

    public CPU() {
    }

    public CPU (CPUEnum model){
        this.model = model;
    }

    public CPUEnum getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "speed=" + getModel().getSpeed() +
                ", model=" + model +
                '}';
    }
}
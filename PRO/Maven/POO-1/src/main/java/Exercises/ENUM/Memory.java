package Exercises.ENUM;

public class Memory {
    private double capacity;

    public Memory() {
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                '}';
    }
}

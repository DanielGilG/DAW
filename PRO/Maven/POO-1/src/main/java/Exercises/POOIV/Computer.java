package Exercises.POOIV;

public class Computer extends Product{
    private HD hardDrive;
    private CPU processor;
    private Memory ramMemory;

    public Computer(int id, float price) {
        super(id, price);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hardDrive=" + hardDrive +
                ", processor=" + processor +
                ", ramMemory=" + ramMemory +
                '}';
    }
}
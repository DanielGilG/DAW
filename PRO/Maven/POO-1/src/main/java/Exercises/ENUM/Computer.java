package Exercises.ENUM;

import Exercises.POOIV.Product;

public class Computer {
    private HD hardDrive;
    private CPU processor;
    private Memory ramMemory;

    public Computer(HD hardDrive, CPU processor, Memory ramMemory) {
        this.hardDrive = hardDrive;
        this.processor = processor;
        this.ramMemory = ramMemory;
    }

    public Computer(HD hardDrive) {
        this.hardDrive = hardDrive;
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
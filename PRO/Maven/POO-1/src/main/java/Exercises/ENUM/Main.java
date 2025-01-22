package Exercises.ENUM;

public class Main {
    public static void main(String[] args) {

        HD hd1 = new HD(HDEnum.HDD_NAND);
        CPU cpu1 = new CPU(CPUEnum.CORE_I5_12400F);
        Memory mem1 = new Memory();

        Computer computer1 = new Computer(hd1, cpu1, mem1);
        System.out.println(computer1);
    }
}

package Exercises.POOIV;

public class HD{
    private String type;
    private long capacity;

    public String getType() {
        return type;
    }

    public long getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "HD{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

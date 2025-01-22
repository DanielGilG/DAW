package Exercises.ENUM;

public class HD{
    private String type;
    private long capacity;
    private HDEnum model;

    public HD(HDEnum model) {
        this.capacity = 0;
        this.type = "Hard Drive";
        this.model = model;
    }

    public HDEnum getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public long getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "HD{" +
                "model=" + model +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}

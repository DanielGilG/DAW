package back.domain;

public class Customer {
    private int id;
    private String name;
    private String nif;

    public Customer(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNif() {
        return nif;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nif=" + nif +
                '}';
    }
}

package aula1103;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medicine {

    private int id;
    private int quantity;
    private int code;
    private String name;
    private String lab;
    private double price;

    public Medicine() {
    }

    public Medicine(int id, int quantity, int code, String name, String lab, double price) {
        this.id = id;
        this.quantity = quantity;
        this.code = code;
        this.name = name;
        this.lab = lab;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", lab='" + lab + '\'' +
                ", price=" + price +
                '}';
    }
}

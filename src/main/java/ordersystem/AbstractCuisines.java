package ordersystem;

/**
 * Created by insomnia on 10.09.17.
 */
public abstract class AbstractCuisines {

    private String name;
    private int price;
    private String nameOfEat;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameOfEat() {
        return nameOfEat;
    }

    public void setNameOfEat(String nameOfEat) {
        this.nameOfEat = nameOfEat;
    }

    @Override
    public String toString() {
        return "AbstractCuisines{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", nameOfEat='" + nameOfEat + '\'' +
                '}';
    }
}

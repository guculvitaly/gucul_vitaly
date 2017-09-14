package ordersystem;

/**
 * Created by insomnia on 09.09.17.
 */
public class PolishCuisines<T, X> {

    private T name;
    private X price;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public X getPrice() {
        return price;
    }

    public void setPrice(X price) {
        this.price = price;
    }

    public PolishCuisines(T name, X price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PolishCuisines{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}

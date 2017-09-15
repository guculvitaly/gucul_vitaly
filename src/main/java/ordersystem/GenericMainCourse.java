package ordersystem;

/**
 * Created by insomnia on 15.09.17.
 */
public class GenericMainCourse<T, X> {

    private T name;
    private X price;


    public GenericMainCourse(T name, X price) {
        this.name = name;
        this.price = price;
    }

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

    @Override
    public String toString() {
        return "GenericMainCourse{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}

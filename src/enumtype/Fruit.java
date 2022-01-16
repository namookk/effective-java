package enumtype;

/*

public static final int APPLE = 0;
public static final int ORANGE = 1;
public static final int BANANA = 2;
public static final int GRAPE = 3;

public static final int FRUIT_APPLE = 10;
public static final int FOOD_APPLE = 100;
 */

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@AllArgConstructor
//@Getter
public enum Fruit {
    APPLE(1000, 20, "RED"),
    PEACH(2000, 9, "YELLO");

    private final int price;
    private final int box;
    private final String color;

    Fruit(int price, int box, String color) {
        this.price = price;
        this.box = box;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public int getBox() {
        return box;
    }

    public String getColor() {
        return color;
    }

    public int boxPrice() {
        return price * box;
    }

    private static final Map<String, Fruit> stringToEnum = Stream.of(values())
            .collect(Collectors.toMap(Objects::toString, e -> e));

    public static Optional<Fruit> fromString(String symbol){
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}

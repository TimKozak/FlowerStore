import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private FlowerType flowerType;
    private Color color;
    private double price;
    private double sepalLength;
}

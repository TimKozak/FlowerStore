import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerBucket {
    private FlowerPack[] flowerPacks;
    private double price = 0;

    public FlowerBucket(FlowerPack[] flowerPacks) {
        FlowerBucket flower = new FlowerBucket(flowerPacks);
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        this.setPrice(price);
    }
}

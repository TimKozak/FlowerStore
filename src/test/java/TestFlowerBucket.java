import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFlowerBucket {
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        FlowerPack flowerPack = new FlowerPack();
        Flower flower = new Flower();
        flower.setPrice(10);
        flowerPack.setFlower(flower);
        flowerPack.setAmount(10);

        FlowerPack flowerPack1 = new FlowerPack();
        Flower flower1 = new Flower();
        flower.setPrice(5);
        flowerPack1.setFlower(flower1);
        flowerPack1.setAmount(5);

        FlowerPack[] flowerPacks = {flowerPack, flowerPack1};

        FlowerBucket flowerBucket = new FlowerBucket(flowerPacks);
    }

    @Test
    void getPrice() {
        assertEquals(125, flowerBucket.getPrice());
    }

}
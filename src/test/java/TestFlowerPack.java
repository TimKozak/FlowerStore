import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFlowerPack {
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        flowerPack = new FlowerPack();
        Flower flower = new Flower();
        flower.setPrice(10);
        flowerPack.setFlower(flower);
        flowerPack.setAmount(10);
    }

    @Test
    void getPrice() {
        assertEquals(100.00, flowerPack.getPrice());
    }

}

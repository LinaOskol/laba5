import java.awt.Color;
import java.util.Random;

public class ColorChanger {
    public static Color getRandomColor() {
        Random random = new Random();// Создаем объект Random
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}
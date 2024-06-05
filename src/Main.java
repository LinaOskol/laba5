import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//создаем окно
        MovingCircle movingCircle = new MovingCircle();
        frame.add(movingCircle); // Добавляем movingCircle в окно
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Устанавливаем действие по умолчанию при закрытии окна - завершение программы
        frame.setVisible(true);    // Делаем окно видимым
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovingCircle extends JPanel implements KeyListener {
    private int x = 150;//координата x
    private int y = 150;//координата y
    private int diameter = 50;//диаметр кружочка
    private Color color = ColorChanger.getRandomColor();//вызов статического метода, возвращает рандомный цвет

    public MovingCircle() {
        setFocusable(true);//компонент получает фокус, то есть компонент готов к взаимодействию с пользователем через клавиатуру
        addKeyListener(this);//метод для обработки событий с клавиатуры
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);// Вызываем метод родительского класса для очистки панели
        g.setColor(color);// Устанавливаем цвет кисти
        g.fillOval(x, y, diameter, diameter); // Рисуем круг по заданным координатам и диаметру
    }

    @Override
    public void keyPressed(KeyEvent e) {//e событие клавиатуры
        int key = e.getKeyCode();// Получаем код нажатой клавиши
        if (key == KeyEvent.VK_LEFT) {
            x -= 10;
            color = ColorChanger.getRandomColor();
        }
        if (key == KeyEvent.VK_RIGHT) {
            x += 10;
            color = ColorChanger.getRandomColor();
        }
        if (key == KeyEvent.VK_UP) {
            y -= 10;
            color = ColorChanger.getRandomColor();
        }
        if (key == KeyEvent.VK_DOWN) {
            y += 10;
            color = ColorChanger.getRandomColor();
        }
        repaint();// Перерисовываем JPanel для отображения изменений
    }

    @Override
    public void keyReleased(KeyEvent e) {//переопределяются так как являются частью интерфайса KeyListener
    }//Этот метод вызывается при отпускании клавиши клавиатуры.

    @Override
    public void keyTyped(KeyEvent e) {
    }//Этот метод вызывается при наборе символа с клавиатуры (например, при вводе букв).
}

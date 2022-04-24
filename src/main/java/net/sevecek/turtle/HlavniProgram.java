package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setPenColor(Color.black);

        nakresliPrasatko(zofka);


    }

    private void nakresliPrasatko(Turtle zofka) {
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(300);
        zofka.penDown();
        zofka.turnLeft(30);
        zofka.move(150);
        zofka.turnLeft(120);
        zofka.move(150);
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(150);
        zofka.penDown();
        zofka.turnLeft(50);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(80);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(80);
        zofka.penUp();
        zofka.turnLeft(130);
        zofka.move(300);
        zofka.penDown();
        zofka.turnLeft(50);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(80);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(80);
        zofka.turnRight(130);
    }

    private void nakresliDomecek(Turtle zofka) {
        zofka.setPenColor(Color.black);
        for (int i = 0; i < 4; i++) {
            zofka.move(150);
            zofka.turnRight(90);
        }

        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

        zofka.turnRight(30);
        zofka.move(150);
        zofka.turnRight(120);
        zofka.move(150);

        zofka.turnRight(30);
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.penDown();

}
}

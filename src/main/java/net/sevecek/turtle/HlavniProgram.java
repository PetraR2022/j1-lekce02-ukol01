package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setPenColor(Color.black);

        nakresliPrasatko(zofka);

        zofka.turnLeft(70);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(90);


        nakresliDomecek(zofka);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(280);
        zofka.penDown();
        zofka.turnLeft(90);

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.move(100);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.penDown();

            nakresliKolecko(zofka);


    }

    private void nakresliKolecko(Turtle zofka) {
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
        zofka.move(5);
        zofka.turnRight(20);
    }

    private void nakresliPrasatko(Turtle zofka) {
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(80);
        zofka.penDown();
        zofka.turnLeft(30);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.penDown();
        zofka.turnLeft(50);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(20);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(20);
        zofka.penUp();
        zofka.turnLeft(130);
        zofka.move(80);
        zofka.penDown();
        zofka.turnLeft(50);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(20);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnRight(30);
    }

    private void nakresliDomecek(Turtle zofka) {
        zofka.setPenColor(Color.black);
        for (int i = 0; i < 4; i++) {
            zofka.move(40);
            zofka.turnRight(90);
        }

        zofka.penUp();
        zofka.move(40);
        zofka.penDown();

        zofka.turnRight(30);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.move(40);

        zofka.turnRight(30);
        zofka.penUp();
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.penDown();

}
}

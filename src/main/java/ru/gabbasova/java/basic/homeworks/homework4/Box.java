package ru.gabbasova.java.basic.homeworks.homework4;

public class Box {
    private float length = 0;
    private float height = 0;
    private float width = 0;
    private String color;

    private byte flagOpen = 0; // 0-close, 1-open
    private byte flagPut = 0; //0-out, 1-in

    public Box(float length, float height, float width, String color) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public float setLength() {
        return length;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void info() {
        System.out.println ( "Длина: " + length + "\n" + "Высота: " + height + "\n"
            + "Ширина: " + width + "\n" + "Цвет: " + color );
    }

    public void setSize( float length, float height, float width ) {
        if (length <= 0 || height <= 0 || width <= 0) {
            this.length = length;
            this.height = height;
            this.width = width;
        } else {
            System.out.println("Нельзя изменить размер коробки! Коробка уже создана.");
        }
    }

    public void setColor( String color) {
        if (this.color == color) {
            System.out.println("Коробка уже покрашена! Цвет: " + this.color);
        } else {
            this.color = color;
            System.out.println("Коробка перекрашена! Цвет: " + this.color);
        }
    }

    public byte openBox() {
        if (flagOpen == 1) {
            System.out.println("Коробка уже открыта.");
        } else {
            flagOpen = 1;
            System.out.println("Коробка открыта.");
        }
        return flagOpen;
    }

    public byte closeBox() {
        if (flagOpen == 1) {
            flagOpen = 0;
            System.out.println("Коробка закрыта.");
        } else {
            System.out.println("Коробка уже закрыта.");
        }
        return flagOpen;
    }

    public byte putInBox() {
        if (flagOpen == 0) {
            System.out.println("Коробка закрыта. Чтобы положить предмет, откройте коробку.");
        } else {
            if (flagPut == 0) {
                flagPut = 1;
                System.out.println("Предмет в коробке.");
            } else {
                System.out.println("В коробке нет места. Выложите предмет.");
            }
        }
        return flagPut;
    }

    public byte putOutBox() {
        if (flagOpen == 0) {
            System.out.println("Коробка закрыта. Чтобы выложить предмет, откройте коробку.");
        } else {
            if (flagPut == 0) {
                //flagPut = 1;
                System.out.println("Предмета в коробке нет.");
            } else {
                System.out.println("Предмет выкинули из коробки. Коробка пустая.");
            }
        }
        return flagPut;
    }
}

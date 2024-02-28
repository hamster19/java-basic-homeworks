package ru.gabbasova.java.basic.homeworks.homework4;

public class Box {
    private float length; // for default = 0
    private float height;
    private float width;
    private String color;

    private boolean flagOpen; // 0-close, 1-open; for default = false
    private boolean flagPut; //0-out, 1-in

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
        if (this.color.equals(color) ) { // String type compares by using method equals()
            System.out.println("Коробка уже покрашена! Цвет: " + this.color);
        } else {
            this.color = color;
            System.out.println("Коробка перекрашена! Цвет: " + this.color);
        }
    }

    public void openBox() {
        if (flagOpen) {
            System.out.println("Коробка уже открыта.");
        } else {
            flagOpen = true;
            System.out.println("Коробка открыта.");
        }
    }

    public void closeBox() {
        if (flagOpen) { //flagOpen == true
            flagOpen = false;
            System.out.println("Коробка закрыта.");
        } else {
            System.out.println("Коробка уже закрыта.");
        }
    }

    public void putInBox() {
        if (!flagOpen) { //flagOpen == false
            System.out.println("Коробка закрыта. Чтобы положить предмет, откройте коробку.");
        } else {
            if (!flagPut) {
                flagPut = true;
                System.out.println("Предмет в коробке.");
            } else {
                System.out.println("В коробке нет места. Выложите предмет.");
            }
        }
    }

    public void putOutBox() {
        if (!flagOpen) {
            System.out.println("Коробка закрыта. Чтобы выложить предмет, откройте коробку.");
        } else {
            if (!flagPut) {
                System.out.println("Предмета в коробке нет.");
            } else {
                flagPut = false;
                System.out.println("Предмет выкинули из коробки. Коробка пустая.");
            }
        }
    }
}

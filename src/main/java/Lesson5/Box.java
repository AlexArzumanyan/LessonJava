package Lesson5;

public class Box {
    public int x,y,z;
    public int height, width, length;
    public String material;
    public boolean opened;
    public boolean empty;
    public float weigth;
    public String owner;
    public String color;

    public int getVolume() {
        return height*width*length;
    }
    public  void open() {
        opened = true;

    }
    public void close() {
        opened = false;
    }

    public void repaint(String newColor) {
        color = newColor;
    }

    public void clear() {
        weigth = 0.0f;
        empty = true;

    }
    public void addIten(float itenWeight) {
        weigth += itenWeight;

    }


}

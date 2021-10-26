package main.java.aula1025.flyweight;

import java.util.Objects;

public class Tree {

    private int height;
    private int width;
    private String color;

    public Tree(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return height == tree.height && width == tree.width && Objects.equals(color, tree.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, color);
    }
}

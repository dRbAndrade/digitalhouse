package main.java.aula1026;

import java.util.Objects;

public class Clothes {

    private ClothesSize size;
    private ClothesType type;
    private boolean isNew;
    private boolean imported;

    public Clothes(ClothesSize size, ClothesType type, boolean isNew, boolean imported) {
        this.size = size;
        this.type = type;
        this.isNew = isNew;
        this.imported = imported;
    }

    public ClothesSize getSize() {
        return size;
    }

    public void setSize(ClothesSize size) {
        this.size = size;
    }

    public ClothesType getType() {
        return type;
    }

    public void setType(ClothesType type) {
        this.type = type;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return isNew == clothes.isNew && imported == clothes.imported && size == clothes.size && type == clothes.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, type, isNew, imported);
    }
}

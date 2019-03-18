package com.app.ch05.equalshashcode;


/*

eqгals - Отношение еквивалентности:
a equals b:

1) рефлексивность
2) симметричность
3) трансиентность

1) a~a
2) a~b --> b~a
3) a~b b~c --> a~c

Связь equals, hashCode:
1) a.eqauls(b) --> a.hashCode==b.hashCode
2) a.hashCode==b.hashCode --> не следует equals
int [-2^32/2;2^32/2-1]



 */


public class Pen {
    private String color;
    private int height;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int hashCode() {
        int hash = 0;
        if (color != null) {
            hash += color.hashCode();
            // hash+=color.length();
        }
        hash += height;
        return hash;
        //return 5;
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (other.getClass() == Pen.class) {
            Pen pen = (Pen) other;
            if (pen.height == height) {
                if (color != null) {
                    return color.equals(pen.color);
                } else if (pen.color != null) {
                    return pen.color.equals(color);
                } else {
                    return true;
                }
            }
        }
        return false;
    }


}


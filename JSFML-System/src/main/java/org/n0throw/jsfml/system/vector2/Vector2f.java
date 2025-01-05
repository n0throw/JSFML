package org.n0throw.jsfml.system.vector2;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public class Vector2f implements Comparable<Vector2f> {
    private final float _x;
    private final float _y;


    public Vector2f(
            float x,
            float y
    ) {
        _x = x;
        _y = y;
    }

    public float getX() {
        return _x;
    }

    public float getY() {
        return _y;
    }




    @Override
    public String toString() {
        return String.format(
                "[Vector2f] X(%s) Y(%s)",
                _x,
                _y
        );
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) return false;
        return this.equals((Vector2f)o);
    }

    public boolean equals(Vector2f vector) {
        if (this == vector) return true;
        if (vector == null) return false;
        return this.compareTo(vector) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(_x, _y);
    }

    @Override
    public int compareTo(@NotNull Vector2f o) {
        return Comparator
                .comparing(Vector2f::getX)
                .thenComparing(Vector2f::getY)
                .compare(this, o);
    }
}

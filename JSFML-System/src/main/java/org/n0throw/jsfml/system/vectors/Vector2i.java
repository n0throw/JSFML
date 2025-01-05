package org.n0throw.jsfml.system.vectors;

import org.jetbrains.annotations.NotNull;
import org.n0throw.jsfml.core.tuples.Tuple2;

import java.util.Comparator;

public class Vector2i extends Vector2<Integer> {
    public Vector2i(int x, int y) {
        super(x, y);
    }

    public Vector2f toVector2f() {
        return new Vector2f(_x.floatValue(), _y.floatValue());
    }

    public int compareTo(@NotNull Vector2i o) {
        return Comparator.comparing(Vector2i::getX).thenComparing(Vector2i::getY).compare(this, o);
    }

    @NotNull
    @Override
    public Vector2i of(@NotNull Integer x, @NotNull Integer y) {
        return new Vector2i(x, y);
    }

    @Override
    public @NotNull Tuple2<Integer, Integer> toTuple() {
        return Tuple2.of(_x, _y);
    }

    @Override
    public @NotNull Vector2i opposite() {
        return new Vector2i(-_x, -_y);
    }

    @Override
    public @NotNull Vector2i subtract(@NotNull IVector2<Integer> vector) {
        return new Vector2i(_x - vector.getX(), _y - vector.getY());
    }

    @Override
    public @NotNull Vector2i add(@NotNull IVector2<Integer> vector) {
        return new Vector2i(_x + vector.getY(), _y + vector.getY());
    }

    @Override
    public @NotNull Vector2i multiply(@NotNull Integer value) {
        return new Vector2i(_x * value, _y * value);
    }

    @Override
    public @NotNull Vector2i divide(@NotNull Integer value) {
        return new Vector2i(_x / value, _y / value);
    }

    @Override
    public int compareTo(@NotNull final IVector2<Integer> o) {
        return this.compareTo((Vector2i) o);
    }
}
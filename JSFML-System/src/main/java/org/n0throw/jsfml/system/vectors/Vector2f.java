package org.n0throw.jsfml.system.vectors;

import org.jetbrains.annotations.NotNull;
import org.n0throw.jsfml.core.tuples.Tuple2;

import java.util.Comparator;

public class Vector2f extends Vector2<Float> {
    public Vector2f(float x, float y) {
        super(x, y);
    }

    public Vector2i toVector2i() {
        return new Vector2i(_x.intValue(), _y.intValue());
    }

    public int compareTo(@NotNull Vector2f o) {
        return Comparator
                .comparing(Vector2f::getX)
                .thenComparing(Vector2f::getY)
                .compare(this, o);
    }

    @NotNull
    @Override
    public Vector2f of(@NotNull Float x, @NotNull Float y) {
        return new Vector2f(x, y);
    }

    @Override
    public @NotNull Tuple2<Float, Float> toTuple() {
        return Tuple2.of(_x, _y);
    }

    @Override
    public @NotNull Vector2f opposite() {
        return new Vector2f(-_x, -_y);
    }

    @Override
    public @NotNull Vector2f subtract(@NotNull IVector2<Float> vector) {
        return new Vector2f(
                _x - vector.getX(),
                _y - vector.getY()
        );
    }

    @Override
    public @NotNull Vector2f add(@NotNull IVector2<Float> vector) {
        return new Vector2f(
                _x + vector.getY(),
                _y + vector.getY()
        );
    }

    @Override
    public @NotNull Vector2f multiply(@NotNull Float value) {
        return new Vector2f(
                _x * value,
                _y * value
        );
    }

    @Override
    public @NotNull Vector2f divide(@NotNull Float value) {
        return new Vector2f(
                _x / value,
                _y / value
        );
    }

    @Override
    public int compareTo(@NotNull final IVector2<Float> o) {
        return this.compareTo((Vector2f) o);
    }
}

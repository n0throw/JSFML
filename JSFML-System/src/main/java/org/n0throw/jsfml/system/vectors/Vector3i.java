package org.n0throw.jsfml.system.vectors;

import org.jetbrains.annotations.NotNull;
import org.n0throw.jsfml.core.tuples.Tuple3;

import java.util.Comparator;

public class Vector3i extends Vector3<Integer> {
    public Vector3i(int x, int y, int z) {
        super(x, y, z);
    }

    public Vector3f toVector3f() {
        return new Vector3f(_x.floatValue(), _y.floatValue(), _z.floatValue());
    }

    public int compareTo(@NotNull Vector3i o) {
        return Comparator
                .comparing(Vector3i::getX)
                .thenComparing(Vector3i::getY)
                .thenComparing(Vector3i::getZ)
                .compare(this, o);
    }

    @NotNull
    @Override
    public Vector3i of(@NotNull Integer x, @NotNull Integer y, @NotNull Integer z) {
        return new Vector3i(x, y, z);
    }

    @Override
    public @NotNull Tuple3<Integer, Integer, Integer> toTuple() {
        return Tuple3.of(_x, _y, _z);
    }

    @Override
    public @NotNull Vector3i opposite() {
        return new Vector3i(-_x, -_y, -_z);
    }

    @Override
    public @NotNull Vector3i subtract(@NotNull IVector3<Integer> vector) {
        return new Vector3i(
                _x - vector.getX(),
                _y - vector.getY(),
                _z - vector.getZ()
        );
    }

    @Override
    public @NotNull Vector3i add(@NotNull IVector3<Integer> vector) {
        return new Vector3i(
                _x + vector.getY(),
                _y + vector.getY(),
                _z + vector.getZ()
        );
    }

    @Override
    public @NotNull Vector3i multiply(@NotNull Integer value) {
        return new Vector3i(
                _x * value,
                _y * value,
                _z * value
        );
    }

    @Override
    public @NotNull Vector3i divide(@NotNull Integer value) {
        return new Vector3i(
                _x / value,
                _y / value,
                _z / value
        );
    }

    @Override
    public int compareTo(@NotNull final IVector3<Integer> o) {
        return this.compareTo((Vector3i) o);
    }
}
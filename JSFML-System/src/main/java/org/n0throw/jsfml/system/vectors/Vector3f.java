package org.n0throw.jsfml.system.vectors;

import org.jetbrains.annotations.NotNull;
import org.n0throw.jsfml.core.tuples.Tuple3;

import java.util.Comparator;

public class Vector3f extends Vector3<Float> {
    public Vector3f(float x, float y, float z) {
        super(x, y, z);
    }

    public Vector3i toVector3i() {
        return new Vector3i(_x.intValue(), _y.intValue(), _z.intValue());
    }

    public int compareTo(@NotNull Vector3f o) {
        return Comparator
                .comparing(Vector3f::getX)
                .thenComparing(Vector3f::getY)
                .thenComparing(Vector3f::getZ)
                .compare(this, o);
    }

    @NotNull
    @Override
    public Vector3f of(@NotNull Float x, @NotNull Float y, @NotNull Float z) {
        return new Vector3f(x, y, z);
    }

    @Override
    public @NotNull Tuple3<Float, Float, Float> toTuple() {
        return Tuple3.of(_x, _y, _z);
    }

    @Override
    public @NotNull Vector3f opposite() {
        return new Vector3f(-_x, -_y, -_z);
    }

    @Override
    public @NotNull Vector3f subtract(@NotNull IVector3<Float> vector) {
        return new Vector3f(
                _x - vector.getX(),
                _y - vector.getY(),
                _z - vector.getZ()
        );
    }

    @Override
    public @NotNull Vector3f add(@NotNull IVector3<Float> vector) {
        return new Vector3f(
                _x + vector.getY(),
                _y + vector.getY(),
                _z + vector.getZ()
        );
    }

    @Override
    public @NotNull Vector3f multiply(@NotNull Float value) {
        return new Vector3f(
                _x * value,
                _y * value,
                _z * value
        );
    }

    @Override
    public @NotNull Vector3f divide(@NotNull Float value) {
        return new Vector3f(
                _x / value,
                _y / value,
                _z / value
        );
    }

    @Override
    public int compareTo(@NotNull final IVector3<Float> o) {
        return this.compareTo((Vector3f) o);
    }
}
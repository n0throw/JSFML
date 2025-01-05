package org.n0throw.jsfml.system.vectors;

import java.io.Serializable;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;

public abstract class Vector3<T extends Number> implements IVector3<T>, Serializable {
    @NotNull
    protected final T _x;
    @NotNull
    protected final T _y;
    @NotNull
    protected final T _z;

    public Vector3(
            @NotNull final T x,
            @NotNull final T y,
            @NotNull final T z
    ) {
        _x = x;
        _y = y;
        _z = z;
    }

    public @NotNull T getX() {
        return _x;
    }

    public @NotNull T getY() {
        return _y;
    }

    public @NotNull T getZ() {
        return _z;
    }

    @NotNull
    public abstract IVector3<T> of(@NotNull T x, @NotNull T y, @NotNull T z);

    @Override
    public String toString() {
        return String.format(
                "[%s] X(%s) Y(%s) Z(%s)",
                getClass().getSimpleName(),
                _x,
                _y,
                _z
        );
    }

    @Override
    public boolean equals(final Object o) {
        if (this.getClass() != o.getClass()) return false;
        return this.equals(o);
    }

    public boolean equals(final Vector3<T> vector) {
        if (this == vector) return true;
        if (vector == null) return false;
        return this.compareTo(vector) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(_x, _y, _z);
    }

    public abstract int compareTo(@NotNull IVector3<T> o);
}

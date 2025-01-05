package org.n0throw.jsfml.system.vectors;

import java.io.Serializable;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;

public abstract class Vector2<T extends Number> implements IVector2<T>, Serializable {
    @NotNull
    protected final T _x;
    @NotNull
    protected final T _y;

    public Vector2(
            @NotNull final T x,
            @NotNull final T y
    ) {
        _x = x;
        _y = y;
    }

    public @NotNull T getX() {
        return _x;
    }

    public @NotNull T getY() {
        return _y;
    }

    @NotNull
    public abstract IVector2<T> of(@NotNull T x, @NotNull T y);

    @Override
    public String toString() {
        return String.format(
                "[%s] X(%s) Y(%s)",
                getClass().getSimpleName(),
                _x,
                _y
        );
    }

    @Override
    public boolean equals(final Object o) {
        if (this.getClass() != o.getClass()) return false;
        return this.equals(o);
    }

    public boolean equals(final Vector2<T> vector) {
        if (this == vector) return true;
        if (vector == null) return false;
        return this.compareTo(vector) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(_x, _y);
    }

    public abstract int compareTo(@NotNull IVector2<T> o);
}

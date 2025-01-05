package org.n0throw.jsfml.system.vectors;

import org.jetbrains.annotations.NotNull;

import org.n0throw.jsfml.core.tuples.Tuple2;

public interface IVector2<T extends Number> extends Comparable<IVector2<T>> {

    @NotNull
    T getX();

    @NotNull
    T getY();

    @NotNull
    IVector2<T> of(@NotNull T x, @NotNull T y);

    @NotNull
    Tuple2<T, T> toTuple();

    @NotNull
    IVector2<T> opposite();

    @NotNull
    IVector2<T> subtract(
            @NotNull final IVector2<T> vector
    );

    @NotNull
    IVector2<T> add(
            @NotNull final IVector2<T> vector
    );

    @NotNull
    IVector2<T> multiply(
            @NotNull final T value
    );

    @NotNull
    IVector2<T> divide(
            @NotNull final T value
    );
}

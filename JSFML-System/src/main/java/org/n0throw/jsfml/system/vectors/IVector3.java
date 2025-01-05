package org.n0throw.jsfml.system.vectors;

import org.jetbrains.annotations.NotNull;

import org.n0throw.jsfml.core.tuples.Tuple3;

public interface IVector3<T extends Number> extends Comparable<IVector3<T>> {

    @NotNull
    T getX();

    @NotNull
    T getY();

    @NotNull
    T getZ();

    @NotNull
    IVector3<T> of(@NotNull T x, @NotNull T y, @NotNull T z);

    @NotNull
    Tuple3<T, T, T> toTuple();

    @NotNull
    IVector3<T> opposite();

    @NotNull
    IVector3<T> subtract(
            @NotNull final IVector3<T> vector
    );

    @NotNull
    IVector3<T> add(
            @NotNull final IVector3<T> vector
    );

    @NotNull
    IVector3<T> multiply(
            @NotNull final T value
    );

    @NotNull
    IVector3<T> divide(
            @NotNull final T value
    );
}

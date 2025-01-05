package org.n0throw.jsfml.core.tuples.abs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import org.n0throw.jsfml.core.tuples.Tuple;

/**
 * Абстрактная имплементация кортежа из трёх значений.
 *
 * @param <T1> тип первого значения.
 * @param <T2> тип второго значения.
 * @param <T3> тип третьего значения.
 */
public abstract class TupleAbs3<T1, T2, T3> implements Tuple {

    /**
     * Первое значение.
     */
    protected final @Nullable T1 _value1;

    /**
     * Второе значение.
     */
    protected final @Nullable T2 _value2;

    /**
     * Третье значение.
     */
    protected final @Nullable T3 _value3;

    /**
     * Кортеж из трёх значений.
     *
     * @param value1 первое значение.
     * @param value2 второе значение.
     * @param value3 третье значение.
     */
    protected TupleAbs3(
            final @Nullable T1 value1,
            final @Nullable T2 value2,
            final @Nullable T3 value3
    ) {
        this._value1 = value1;
        this._value2 = value2;
        this._value3 = value3;
    }

    /**
     * {@inheritDoc}
     *
     * @return 3
     */
    @Override
    public int size() {
        return 3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable Object element(final int index) throws IndexOutOfBoundsException {
        if (index == 0) {
            return _value1;
        } else if (index == 1) {
            return _value2;
        } else if (index == 2) {
            return _value3;
        } else return Tuple.super.element(index);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object @NotNull [] toArray() {
        return new Object[]{_value1, _value2, _value3};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull List<Object> toList() {
        return Arrays.asList(_value1, _value2, _value3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return Stream.of(_value1, _value2, _value3)
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TupleAbs3<?, ?, ?> tuple = (TupleAbs3<?, ?, ?>) o;

        return Objects.equals(_value1, tuple._value1)
                && Objects.equals(_value2, tuple._value2)
                && Objects.equals(_value3, tuple._value3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(_value1, _value2, _value3);
    }
}

package org.n0throw.jsfml.core.tuples.abs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import org.n0throw.jsfml.core.tuples.Tuple;

/**
 * Абстрактная имплементация кортежа из двух значений.
 *
 * @param <T1> тип первого значения.
 * @param <T2> тип второго значения.
 */
public abstract class TupleAbs2<T1, T2> implements Tuple {

    /**
     * Первое значение.
     */
    protected final @Nullable T1 _value1;

    /**
     * Второе значение.
     */
    protected final @Nullable T2 _value2;

    /**
     * Кортеж из двух значений.
     *
     * @param value1 первое значение.
     * @param value2 второе значение.
     */
    protected TupleAbs2(
            final @Nullable T1 value1,
            final @Nullable T2 value2
    ) {
        this._value1 = value1;
        this._value2 = value2;
    }

    /**
     * Меняет местами значения этого кортежа.
     *
     * @return Новый кортеж, где первое значение является вторым значение кортежа,
     * а второе значение — первым значением кортежа.
     */
    public abstract TupleAbs2<T2, T1> swap();

    /**
     * {@inheritDoc}
     *
     * @return 2
     */
    @Override
    public int size() {
        return 2;
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
        } else return Tuple.super.element(index);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object @NotNull [] toArray() {
        return new Object[]{_value1, _value2};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull List<Object> toList() {
        return Arrays.asList(_value1, _value2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return Stream.of(_value1, _value2)
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
        TupleAbs2<?, ?> tuple = (TupleAbs2<?, ?>) o;

        return Objects.equals(_value1, tuple._value1)
                && Objects.equals(_value2, tuple._value2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(_value1, _value2);
    }
}

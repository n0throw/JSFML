package org.n0throw.jsfml.core.tuples.abs;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import org.n0throw.jsfml.core.tuples.Tuple;

/**
 * Абстрактная имплементация кортежа из одного значения.
 *
 * @param <T1> тип значения.
 */
public abstract class TupleAbs1<T1> implements Tuple {

    /**
     * Первое значение.
     */
    protected final @Nullable T1 _value1;

    /**
     * Кортеж из одного значения.
     *
     * @param value1 первое значение.
     */
    protected TupleAbs1(final @Nullable T1 value1) {
        this._value1 = value1;
    }

    /**
     * @return Возможное значение кортежа.
     */
    public @NotNull Optional<T1> toOptional() {
        return Optional.ofNullable(_value1);
    }

    /**
     * {@inheritDoc}
     *
     * @return 1
     */
    @Override
    public int size() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable Object element(final int index) throws IndexOutOfBoundsException {
        if (index == 0) {
            return _value1;
        } else return Tuple.super.element(index);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull Object[] toArray() {
        return new Object[]{_value1};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull List<Object> toList() {
        return Collections.singletonList(_value1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        if (_value1 == null) {
            return super.toString();
        } else return _value1.toString();
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
        TupleAbs1<?> tuple = (TupleAbs1<?>) o;

        return Objects.equals(_value1, tuple._value1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(_value1);
    }
}

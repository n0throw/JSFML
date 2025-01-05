package org.n0throw.jsfml.core.tuples;

import java.io.Serial;
import java.io.Serializable;

import org.jetbrains.annotations.Nullable;

import org.n0throw.jsfml.core.tuples.abs.TupleAbs1;
import org.n0throw.jsfml.core.tuples.values.IValue1;

/**
 * Кортеж из одного значения.
 *
 * @param <T1> тип значения.
 */
public class Tuple1<T1> extends TupleAbs1<T1> implements IValue1<T1>, Serializable {
    @Serial
    private static final long serialVersionUID = -70159529614705583L;

    /**
     * Кортеж из одного значения.
     *
     * @param _1 Первое значение.
     */
    protected Tuple1(final @Nullable T1 _1) {
        super(_1);
    }

    /**
     * Кортеж из одного значения.
     *
     * @param _1   Первое значение.
     * @param <T1> Тип первого значения.
     * @return Кортеж из одного значения.
     */
    public static <T1> Tuple1<T1> of(final @Nullable T1 _1) {
        return new Tuple1<>(_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable T1 _1() {
        return super._value1;
    }
}

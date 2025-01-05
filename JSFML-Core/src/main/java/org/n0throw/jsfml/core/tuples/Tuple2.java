package org.n0throw.jsfml.core.tuples;

import java.io.Serial;
import java.io.Serializable;

import org.jetbrains.annotations.Nullable;

import org.n0throw.jsfml.core.tuples.abs.TupleAbs2;
import org.n0throw.jsfml.core.tuples.values.IValue2;

/**
 * Кортеж из двух элементов.
 *
 * @param <T1> Тип первого элемента
 * @param <T2> Тип второго элемента
 */
public class Tuple2<T1, T2> extends TupleAbs2<T1, T2> implements IValue2<T1, T2>, Serializable {
    @Serial
    private static final long serialVersionUID = 3920820440714655335L;

    /**
     * Кортеж из двух элементов.
     *
     * @param _1 Первый элемент.
     * @param _2 Второй элемент.
     */
    protected Tuple2(final @Nullable T1 _1, final @Nullable T2 _2) {
        super(_1, _2);
    }

    /**
     * Кортеж от двух значений.
     *
     * @param _1   Первое значение.
     * @param _2   Второе значение.
     * @param <T1> Тип первого элемента.
     * @param <T2> Тип второго элемента.
     * @return Кортеж из двух элементов.
     */
    public static <T1, T2> Tuple2<T1, T2> of(final @Nullable T1 _1, final @Nullable T2 _2) {
        return new Tuple2<>(_1, _2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tuple2<T2, T1> swap() {
        return Tuple2.of(super._value2, super._value1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable T1 _1() {
        return super._value1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable T2 _2() {
        return super._value2;
    }
}

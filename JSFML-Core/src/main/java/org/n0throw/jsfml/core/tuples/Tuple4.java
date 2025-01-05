package org.n0throw.jsfml.core.tuples;

import java.io.Serial;
import java.io.Serializable;

import org.jetbrains.annotations.Nullable;

import org.n0throw.jsfml.core.tuples.abs.TupleAbs4;
import org.n0throw.jsfml.core.tuples.values.IValue4;

/**
 * Кортеж из четырёх элементов.
 *
 * @param <T1> тип первого элемента.
 * @param <T2> тип второго элемента.
 * @param <T3> тип третьего элемента.
 * @param <T4> тип Четвёртого элемента.
 */
public class Tuple4<T1, T2, T3, T4> extends TupleAbs4<T1, T2, T3, T4> implements IValue4<T1, T2, T3, T4>, Serializable {
    @Serial
    private static final long serialVersionUID = 67778937041525541L;

    /**
     * Кортеж из трёх элементов.
     *
     * @param _1 Первый элемент.
     * @param _2 Второй элемент.
     * @param _3 Третий элемент.
     * @param _4 Четвёртый элемент.
     */
    protected Tuple4(
            final @Nullable T1 _1,
            final @Nullable T2 _2,
            final @Nullable T3 _3,
            final @Nullable T4 _4
    ) {
        super(_1, _2, _3, _4);
    }

    /**
     * Кортеж от трёх значений.
     *
     * @param _1   Первое значение.
     * @param _2   Второе значение.
     * @param _3   Третье значение.
     * @param _4   Четвёртый значение.
     * @param <T1> Тип первого элемента.
     * @param <T2> Тип второго элемента.
     * @param <T3> Тип третьего элемента.
     * @param <T4> Тип четвёртого элемента.
     * @return Кортеж из трёх элементов.
     */
    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> of(
            final @Nullable T1 _1,
            final @Nullable T2 _2,
            final @Nullable T3 _3,
            final @Nullable T4 _4
    ) {
        return new Tuple4<>(_1, _2, _3, _4);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable T3 _3() {
        return super._value3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @Nullable T4 _4() {
        return super._value4;
    }
}



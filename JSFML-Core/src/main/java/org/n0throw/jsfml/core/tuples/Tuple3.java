package org.n0throw.jsfml.core.tuples;

import java.io.Serial;
import java.io.Serializable;

import org.jetbrains.annotations.Nullable;

import org.n0throw.jsfml.core.tuples.abs.TupleAbs3;
import org.n0throw.jsfml.core.tuples.values.IValue3;

/**
 * Кортеж из трёх элементов.
 *
 * @param <T1> Тип первого элемента.
 * @param <T2> Тип второго элемента.
 * @param <T3> Тип третьего элемента.
 */
public class Tuple3<T1, T2, T3> extends TupleAbs3<T1, T2, T3> implements IValue3<T1, T2, T3>, Serializable {
    @Serial
    private static final long serialVersionUID = 67778937041525541L;

    /**
     * Кортеж из трёх элементов.
     *
     * @param _1 Первый элемент.
     * @param _2 Второй элемент.
     * @param _3 Третий элемент.
     */
    protected Tuple3(final @Nullable T1 _1, final @Nullable T2 _2, final @Nullable T3 _3) {
        super(_1, _2, _3);
    }

    /**
     * Кортеж от трёх значений.
     *
     * @param _1   Первое значение.
     * @param _2   Второе значение.
     * @param _3   Третье значение.
     * @param <T1> Тип первого элемента.
     * @param <T2> Тип второго элемента.
     * @param <T3> Тип третьего элемента.
     * @return Кортеж из трёх элементов.
     */
    public static <T1, T2, T3> Tuple3<T1, T2, T3> of(final @Nullable T1 _1, final @Nullable T2 _2, final @Nullable T3 _3) {
        return new Tuple3<>(_1, _2, _3);
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
}


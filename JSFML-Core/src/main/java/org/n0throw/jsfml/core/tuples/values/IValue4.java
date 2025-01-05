package org.n0throw.jsfml.core.tuples.values;

import org.jetbrains.annotations.Nullable;

/**
 * Интерфейс для возвращения двух значений.
 *
 * @param <T1> тип первого значения.
 * @param <T2> тип второго значения.
 * @param <T3> тип третьего значения.
 * @param <T4> тип четвёртого значения.
 */
public interface IValue4<T1, T2, T3, T4> {
    /**
     * @return Возвращает первое значение.
     */
    @Nullable
    T1 _1();

    /**
     * @return Возвращает второе значение.
     */
    @Nullable
    T2 _2();

    /**
     * @return Возвращает третье значение.
     */
    @Nullable
    T3 _3();

    /**
     * @return Возвращает четвёртое значение.
     */
    @Nullable
    T4 _4();
}

package org.n0throw.jsfml.core.tuples.values;

import org.jetbrains.annotations.Nullable;

/**
 * Интерфейс для возвращения двух значений.
 *
 * @param <T1> тип первого значения.
 * @param <T2> тип второго значения.
 */
public interface IValue2<T1, T2> {
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
}

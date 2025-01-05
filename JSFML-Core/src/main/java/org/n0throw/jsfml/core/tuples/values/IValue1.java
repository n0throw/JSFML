package org.n0throw.jsfml.core.tuples.values;

import org.jetbrains.annotations.Nullable;

/**
 * Интерфейс для возвращения одного значения.
 *
 * @param <T1> Тип первого значения.
 */
public interface IValue1<T1> {
    /**
     * @return Возвращает первое значение.
     */
    @Nullable
    T1 _1();
}

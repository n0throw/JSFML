package org.n0throw.jsfml.core.tuples;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.*;

/**
 * Кортеж значений.
 */
public interface Tuple extends Serializable, Iterable<Object>, Comparable<Tuple> {
    /**
     * Размер кортежа.
     *
     * @return Число значений в кортеже.
     */
    int size();

    /**
     * Возвращает значение по его индексу.
     *
     * @param index Индекс элемента.
     * @return Элемент.
     * @throws IndexOutOfBoundsException Индекс выходит за пределы размеров кортежа.
     */
    default @Nullable Object element(final int index) throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException(
                String.format(
                        "%d выходит за пределы (мин 0, макс %d)",
                        index,
                        size() - 1
                )
        );
    }

    /**
     * Итератор по всем элементам кортежа.
     *
     * @return Стандартная реализация итератора по элементам кортежа.
     */
    @Override
    default @NotNull Iterator<Object> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size();
            }

            @Override
            public Object next() {
                Object el = element(currentIndex);
                currentIndex++;
                return el;
            }
        };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    default int compareTo(@NotNull Tuple o) {
        final Iterator<Object> thisIter = iterator();
        final Iterator<Object> otherIter = o.iterator();
        while (thisIter.hasNext() && otherIter.hasNext()) {
            Comparable thisEl = (Comparable) thisIter.next();
            Comparable otherEl = (Comparable) otherIter.next();

            final int comparison = thisEl.compareTo(otherEl);
            if (comparison != 0) {
                return comparison;
            }
        }
        if (thisIter.hasNext()) return 1;
        if (otherIter.hasNext()) return -1;
        return 0;
    }

    /**
     * Проверка, существует ли элемент в кортеже.
     *
     * @param el элемент.
     * @return Флаг существования элемента.
     */
    default boolean contains(final Object el) {
        return toList().contains(el);
    }

    /**
     * Проверяет, существуют ли все элементы списка в кортеже или нет.
     *
     * @param c Список значений.
     * @return Флаг существования элементов.
     */
    default boolean containsAll(final Collection<?> c) {
        return new HashSet<>(toList()).containsAll(c);
    }

    /**
     * Проверяет, существуют ли все элементы массива в кортеже или нет.
     *
     * @param els Массив значений.
     * @return Флаг существования элементов.
     */
    default boolean containsAll(final Object... els) {
        return containsAll(Arrays.stream(els).toList());
    }

    /**
     * Индекс первого вхождения элемента в кортеж.
     *
     * @param el элемент.
     * @return Индекс элемента. -1 - если элемента нет.
     */
    default int indexOf(final Object el) {
        return toList().indexOf(el);
    }

    /**
     * Индекс последнего вхождения элемента в кортеж.
     *
     * @param el элемент.
     * @return Индекс элемента. -1 - если элемента нет.
     */
    default int lastIndexOf(final Object el) {
        return toList().lastIndexOf(el);
    }

    /**
     * Преобразует все элементы кортежа в массив.
     *
     * @return Массив элементов кортежа.
     */
    @NotNull Object[] toArray();

    /**
     * Преобразует все элементы кортежа в коллекцию.
     *
     * @return Коллекция элементов кортежа.
     */
    @NotNull
    List<Object> toList();
}

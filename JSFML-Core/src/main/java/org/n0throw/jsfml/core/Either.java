package org.n0throw.jsfml.core;

import java.io.Serial;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

import org.jetbrains.annotations.NotNull;

import org.n0throw.jsfml.core.tuples.Tuple1;
import org.n0throw.jsfml.core.tuples.abs.TupleAbs1;


/**
 * Представление значения в виде одного из двух возможных типов: Left и Right.
 * <p>
 * Используется для работы с возможно отсутствующим значением:
 * <p>
 * Left - информация об отсутствующем значении.
 * <p>
 * Right - Значение.
 * <p>
 * Соглашение гласит, что Left используется для неудачи, а Right — для успеха.
 *
 * @param <L> Тип неудачного значения.
 * @param <R> Тип успешного значения.
 */
public abstract class Either<L, R> implements Serializable {
    @Serial
    private static final long serialVersionUID = -926235183805431565L;

    /**
     * Конструктор по умолчанию.
     */
    protected Either() {

    }

    /**
     * Успешное значение.
     *
     * @param right Значение
     * @param <L>   Тип неуспешного значения.
     * @param <R>   Тип успешного значения.
     * @return Представление успешного значения.
     */
    public static <L, R> @NotNull Either<L, R> right(@NotNull R right) {
        return new Right<>(right);
    }

    /**
     * Неуспешное значение.
     *
     * @param left Значение
     * @param <L>  Тип неуспешного значения.
     * @param <R>  Тип успешного значения.
     * @return Представление неуспешного значения.
     */
    public static <L, R> @NotNull Either<L, R> left(@NotNull L left) {
        return new Left<>(left);
    }

    /**
     * @return Успешное значение
     * @throws NoSuchElementException Невозможно получить успешное значение у неуспешного представления.
     */
    public abstract @NotNull R getRight() throws NoSuchElementException;

    /**
     * @return Возвращает контейнер, который может содержать значение.
     */
    public abstract @NotNull Optional<R> getRightOpt();

    /**
     * @return Флаг, является ли представление успешным.
     */
    public abstract boolean isRight();

    /**
     * @return Неуспешное значение.
     * @throws NoSuchElementException Невозможно получить неуспешное значение у успешного представления.
     */
    public abstract @NotNull L getLeft() throws NoSuchElementException;

    /**
     * @return Возвращает контейнер, который может содержать значение.
     */
    public abstract @NotNull Optional<L> getLeftOpt();

    /**
     * @return Флаг, является ли представление неуспешным.
     */
    public abstract boolean isLeft();

    /**
     * @return Возможное успешное значение.
     */
    public @NotNull Optional<R> toOptional() {
        return getRightOpt();
    }

    /**
     * @return Преобразование в кортеж с возможным одним значением.
     */
    public @NotNull TupleAbs1<R> toTuple1() {
        return Tuple1.of(getRightOpt().orElse(null));
    }

    /**
     * Представление неуспешного значения.
     *
     * @param <L> Тип неуспешного значения.
     * @param <R> Тип успешного значения
     */
    public static final class Left<L, R> extends Either<L, R> implements Serializable {
        @Serial
        private static final long serialVersionUID = 2866257065812906142L;
        /**
         * Неуспешное значение.
         */
        private final @NotNull L value;

        private Left(final @NotNull L value) {
            this.value = value;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull R getRight() throws NoSuchElementException {
            throw new NoSuchElementException("Невозможно получить успешное представление у неуспешного представления.");
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull Optional<R> getRightOpt() {
            return Optional.empty();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull L getLeft() {
            return value;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull Optional<L> getLeftOpt() {
            return Optional.of(value);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean isRight() {
            return false;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean isLeft() {
            return true;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object obj) {
            return (obj == this) || (obj instanceof Left && Objects.equals(value, ((Left<?, ?>) obj).value));
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {
            return Objects.hash(this.getClass(), value);
        }
    }

    /**
     * Представление успешного значения.
     *
     * @param <L> Тип неуспешного значения.
     * @param <R> Тип успешного значения
     */
    public static final class Right<L, R> extends Either<L, R> implements Serializable {
        @Serial
        private static final long serialVersionUID = 4787929499138267199L;

        /**
         * Успешное значение.
         */
        private final @NotNull R value;

        private Right(final @NotNull R value) {
            this.value = value;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull R getRight() {
            return value;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull Optional<R> getRightOpt() {
            return Optional.of(value);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull L getLeft() {
            throw new NoSuchElementException("Невозможно получить неуспешное значение у успешного представления.");
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public @NotNull Optional<L> getLeftOpt() {
            return Optional.empty();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean isRight() {
            return true;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean isLeft() {
            return false;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object obj) {
            return (obj == this) || (obj instanceof Right && Objects.equals(value, ((Right<?, ?>) obj).value));
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {
            return Objects.hash(this.getClass(), value);
        }
    }
}

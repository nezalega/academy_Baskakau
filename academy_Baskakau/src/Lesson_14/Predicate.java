package Lesson_14;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
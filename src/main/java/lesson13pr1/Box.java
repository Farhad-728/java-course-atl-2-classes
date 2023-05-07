package lesson13pr1;

import java.util.Objects;

public final class Box<T> {
    private boolean isEven;
    private T data;

    public Box(boolean isEven, T data) {
        this.isEven = isEven;
        this.data = data;
    }

    public boolean isEven() {
        return isEven;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return isEven == box.isEven && Objects.equals(data, box.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEven, data);
    }

    @Override
    public String toString() {
        return String.format("Box{isEven=%s, data=%s}", isEven, data);
    }

    public T getData() {
        return data;

    }
}

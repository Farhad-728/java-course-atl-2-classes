package lesson13pr1;

import java.util.Objects;

public final class Result<T> {
    private String className;
    private T data;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result() {

    }

    public Result(T data, String className) {
        this.className = className;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result<?> resualt = (Result<?>) o;
        return Objects.equals(className, resualt.className) && Objects.equals(data, resualt.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, data);
    }

    @Override
    public String toString() {
        return String.format("Resualt{className='%s', data=%s}", className, data);
    }
}

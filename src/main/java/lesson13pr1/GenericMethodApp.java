package lesson13pr1;

public class GenericMethodApp {
    public static void main(String[] args) {
        Result<Integer> result1 = validateAndGet(35);
        System.out.println(result1);

        Result<Float> result2 = validateAndGet(34F);
        System.out.println(result2);

        Response<String, Integer> response = get("salam", 5);
        System.out.println(response);
    }

    public static <T> Result<T> validateAndGet(T t) {
        if (t == null) {
            return new Result<>();
        }
        return new Result<>(t, t.getClass().getName());
    }

    public static <T, U> Response<T, U> get(T t, U u) {
        return new Response<>(t, u);

    }
}


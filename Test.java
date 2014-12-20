class Test {
    public static void main(String[] argv) {
        System.out.println("" + fib(10));
    }

    private static int fib(int x) {
        if (x <= 1) {
            return x;
        } else {
            return fib(x - 2) + fib(x - 1);
        }
    }
}

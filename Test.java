class Test {
    public static void main(String[] argv) {
        System.out.println(fib(10));
    }

    private static int fib(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1 || x == 2) {
            return 1;
        }
        return fib(x - 2) + fib(x - 1);
    }
}

class Succ {
    public static void main(String[] argv) {
        int a = 1;
        int b = 3;
        System.out.println(a+b);
        System.out.println(succ(a));
    }

    private static int succ(int x) {
        return x + 1;
    }
}

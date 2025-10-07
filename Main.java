class Main {
    static int a = 10;
    static int b = getB(); // ①

    static {
        System.out.println("Static Block: a = " + a + ", b = " + b); // ②
    }

    static int c = 30;

    static int getB() {
        System.out.println("getB() called: a = " + a + ", c = " + c); // ③
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Main: a = " + a + ", b = " + b + ", c = " + c); // ④
    }
}

class Test
{
    public static void main(String[] args)
    {
        testSum();
        testMultiply();
        testSubtract();
        testDevide();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }
    private static void testMultiply()
    {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.multiply(a, b);
        if (result == expected)
        {
            System.out.println("multiply: OK");
        }
        else
        {
            System.out.println("multiply: Failed, expected = " + expected + ", result = " + result);
        }
    }
    private static void testSubtract()
    {
        int a = 5;
        int b = 6;
        int expected = -1;
        BasicMath bm = new BasicMath();
        int result = bm.subtract(a, b);
        if (result == expected)
        {
            System.out.println("Subtract: OK");
        }
        else
        {
            System.out.println("Subtract: Failed, expected = " + expected + ", result = " + result);
        }
    }
    private static void testDevide()
    {
        int a = 3;
        int b = 6;
        double expected = 0.5;
        BasicMath bm = new BasicMath();
        int result = bm.devide(a, b);
        if (result == expected)
        {
            System.out.println("Devide: OK");
        }
        else
        {
            System.out.println("Devide: Failed, expected = " + expected + ", result = " + result);
        }
    }
}

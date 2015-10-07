class Test
{
    public static void main(String[] args)
    {
        testSum();
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

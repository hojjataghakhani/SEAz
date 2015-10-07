class Test
{
    public static void main(String[] args)
    {
        testSum();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        int multiply = bm.multiply(a, b);
        int multiply_expected = 30;
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
        if (multiply == multiply_expected)
        {
            System.out.println("Multiply: OK");
        }
        else
        {
            System.out.println("Multiply: Failed, expected = " + multiply_expected + ", result = " + multiply);
        }
    }
}

class SmallestNumber
{
    public static void main(String[] args) 
    {
        int a = 56;
        int b = 5;
        int c = 39;

        if (a < b && a < c) 
        {
            System.out.println("a is smaller");
        } 
        else if (b < a && b < c) 
        {
            System.out.println("b is smaller");
        } 
        else 
        {
            System.out.println("c is smaller ");
        }

    }

}
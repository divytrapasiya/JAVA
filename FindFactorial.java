class FindFactorial 
{
    
        int i, fact = 1;
        int number = 5;
        void disPlay()
        {
            for (i = 1; i <= number; i++) 
             {
                 fact = fact * i;
             }
        
        
            System.out.println("Factorial of " + number + " is: " + fact);
            }
        
    public static void main(String args[]) 
    {
        FindFactorial a=new FindFactorial();
        a.disPlay();
    }
}
import javax.lang.model.util.ElementScanner14;

class MinMaxArray 
{
    public static void main(String[] args) 
    {
        int a[] = { 7, 1, 12, 9, 3, 5 };
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) 
        {
            if (a[i] < min) 
            {
                min = a[i];
            }
             else if (a[i] > max) 
            {
                max = a[i];
            }
            else
            {
                default;
            }
            
        }
        System.out.println("Minimum value in array is: " + min);
        System.out.println("Maximum value in array is: " + max);
    }
}
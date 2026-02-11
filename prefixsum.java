import java.util.*;
public class prefixsum
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();
        int arr[]= new int[n];
        int prefixsum[]=new int [n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        prefixsum[0]=arr[0];
        for(int i=1;i<n;i++)
        
        {
            prefixsum[i]=prefixsum[i-1]+arr[i];
        }
        System.out.println("PREFIX SUM IS: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(prefixsum[i]+" ");
        }
    }
}

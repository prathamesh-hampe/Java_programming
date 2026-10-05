import java.util.*;

public class Hollow_Rectangle 
{
    public static void main(String[] args) 
    {
        int totRows = 4;
        int totColu = 5;

        for (int i = 1; i<= totRows; i++) 
        {
            for (int j = 1; j<=totColu; j++) 
            {
                if ( i == 1 || i == totRows || j == 1 || j == totColu) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
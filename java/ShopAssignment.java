/*Name: Opoku Davis
Index: 3406422*/
import java.util.Scanner;

public class ShopAssignment{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create arrays to store the sales figures for each shop
        int[] HighStreetBranchSales = new int[12];
        int[] MallBranchSales = new int[12];

        // Get the sales figures for each shop from the user
        System.out.println("Enter the sales figures for the High Street Branch:");
        for (int i = 0; i < 12; i++) {
            HighStreetBranchSales[i] = input.nextInt();
        }

        System.out.println("Enter the sales figures for the Mall Branch:");
        for (int i = 0; i < 12; i++) {
            MallBranchSales[i] = input.nextInt();
        }

        // Calculate the monthly combined sales for the two shops
        int[] monthlyCombinedSales = new int[12];
        for (int i = 0; i < 12; i++) {
            monthlyCombinedSales[i] = HighStreetBranchSales[i] + MallBranchSales[i];
        }

        // Calculate the monthly combined quarterly sales for the two shops
        int[] monthlyCombinedQuarterlySales = new int[4];
        for (int i = 0; i < 4; i++) {
            monthlyCombinedQuarterlySales[i] = monthlyCombinedSales[i * 3] + monthlyCombinedSales[i * 3 + 1] + monthlyCombinedSales[i * 3 + 2];
        }

        // Calculate the respective shops annual sales
        int highStreetBranchAnnualSales = 0;
        int mallBranchAnnualSales = 0;
        for (int i = 0; i < 12; i++) {
            highStreetBranchAnnualSales += HighStreetBranchSales[i];
            mallBranchAnnualSales += MallBranchSales[i];
        }

        // Calculate the grand total annual combined sales for the two shops
        int grandTotalAnnualCombinedSales = highStreetBranchAnnualSales + mallBranchAnnualSales;

        // Print the results
        System.out.println("The monthly combined sales for the two shops are:");
        for (int i = 0; i < 12; i++) {
            System.out.println(monthlyCombinedSales[i]);
        }

        System.out.println("The monthly combined quarterly sales for the two shops are:");
        for (int i = 0; i < 4; i++) {
            System.out.println(monthlyCombinedQuarterlySales[i]);
        }

        System.out.println("The respective shops annual sales are:");
        System.out.println("High Street Branch: " + highStreetBranchAnnualSales);
        System.out.println("Mall Branch: " + mallBranchAnnualSales);

        System.out.println("The grand total annual combined sales for the two shops is: " + grandTotalAnnualCombinedSales);
        input.close();
    }
}

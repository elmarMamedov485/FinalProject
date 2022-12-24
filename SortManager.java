package FinalProject;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import FinalProject.SortItemAsc.*;
import FinalProject.SortItemDsc.*;

public class SortManager {
    public static void sort(List<Item> list){
        System.out.println("Choose field to sort by:");
        System.out.println("1. All fields");
        System.out.println("2. Item id");
        System.out.println("3. Name");
        System.out.println("4. Category");
        System.out.println("5. Price");
        System.out.println("6. Old price");
        System.out.println("7. Sellable online");
        System.out.println("8. Link");
        System.out.println("9. Other colours");
        System.out.println("10. Short description");
        System.out.println("11. Designer");
        System.out.println("12. Depth");
        System.out.println("13. Height");
        System.out.println("14. Width");

        Collections.sort(list, new SortByNameAsc());

        Scanner sc = new Scanner(System.in);
        int n; 

        System.out.println("Enter field(number):");
        n = sc.nextInt();

        System.out.println("Choose order: ");
        System.out.println("1.Ascending");
        System.out.println("2.Descending");

        int order; 

        System.out.println("Enter order(number)");
        order = sc.nextInt();
        sc.close();
        switch(order){
            case 1:
            switch(n){
                case 1:
                    System.out.println("Not Implemented yet");
                    break;
                case 2:
                    Collections.sort(list, new SortByItemIdAsc());
                    break;
                case 3:
                    Collections.sort(list, new SortByNameAsc());
                    break;
                case 4:
                    Collections.sort(list, new SortByCategoryAsc());
                    break;
                case 5:
                    Collections.sort(list, new SortByPriceAsc());
                    break;
                case 6:
                    Collections.sort(list, new SortByOldPriceAsc());
                    break;
                case 7:
                    Collections.sort(list, new SortBySellableOnlineAsc());
                    break;
                case 8:
                    Collections.sort(list, new SortByLinkAsc());
                    break;
                case 9:
                    Collections.sort(list, new SortByOtherColorsAsc());
                    break;
                case 10:
                    Collections.sort(list, new SortByShortDescriptionAsc());
                    break;
                case 11:
                    Collections.sort(list, new SortByDesignerAsc());
                    break;
                case 12:
                    Collections.sort(list, new SortByDepthAsc());
                    break;
                case 13:
                    Collections.sort(list, new SortByHeightAsc());
                    break;
                case 14:
                    Collections.sort(list, new SortByWidthAsc());
                    break;
                default:
                    System.out.println("Wrong number");
            }
                break;
                case 2:
                switch(n){
                    case 1:
                        System.out.println("Not Implemented yet");
                        break;
                    case 2:
                        Collections.sort(list, new SortByItemIdDsc());
                        break;
                    case 3:
                        Collections.sort(list, new SortByNameDsc());
                        break;
                    case 4:
                        Collections.sort(list, new SortByCategoryDsc());
                        break;
                    case 5:
                        Collections.sort(list, new SortByPriceDsc());
                        break;
                    case 6:
                        Collections.sort(list, new SortByOldPriceDsc());
                        break;
                    case 7:
                        Collections.sort(list, new SortBySellableOnlineDsc());
                        break;
                    case 8:
                        Collections.sort(list, new SortByLinkDsc());
                        break;
                    case 9:
                        Collections.sort(list, new SortByOtherColorsDsc());
                        break;
                    case 10:
                        Collections.sort(list, new SortByShortDescriptionDsc());
                        break;
                    case 11:
                        Collections.sort(list, new SortByDesignerDsc());
                        break;
                    case 12:
                        Collections.sort(list, new SortByDepthDsc());
                        break;
                    case 13:
                        Collections.sort(list, new SortByHeightDsc());
                        break;
                    case 14:
                        Collections.sort(list, new SortByWidthDsc());
                        break;
                    default:
                        System.out.println("Wrong number");
                }
                break;
                default:
                    System.out.println("Wrong number");
        }
        
    }
}

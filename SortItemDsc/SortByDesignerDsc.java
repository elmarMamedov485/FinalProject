package FinalProject.SortItemDsc;
import java.util.Comparator;
import FinalProject.Item;

public class SortByDesignerDsc implements Comparator<Item>{
    public int compare(Item i1, Item i2){
        return i2.getDesigner().compareTo(i1.getDesigner());
    }
}

package ir.com.sample.designpattern.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mehrdad on 01/27/2022.
 */
public class ItemRepository {
    static List<Item> itemList = new ArrayList<Item>();
    public static void addItem(Item item){
        itemList.add(item);
    }
    public static void addItems(List<Item> items){
        itemList.addAll(items);
    }
}

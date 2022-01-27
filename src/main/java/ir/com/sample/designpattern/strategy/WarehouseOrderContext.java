package ir.com.sample.designpattern.strategy;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Mehrdad on 01/27/2022.
 */
public class WarehouseOrderContext {
    private PricingStrategy strategy;

    public WarehouseOrderContext(List<Item> items, PricingStrategy strategy) {
        this.strategy = strategy;
        ItemRepository.addItems(items);
    }

    public BigDecimal calculateFixedPrice(){
        try {
            return strategy.getFixedPrice();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

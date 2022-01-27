package ir.com.sample.designpattern.strategy;

import lombok.SneakyThrows;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Mehrdad on 01/27/2022.
 */
public class FifoPricing implements PricingStrategy {
    @Override
    @SneakyThrows
    public BigDecimal getFixedPrice() {
        List<Item> items = ItemRepository.itemList;
        if (items.isEmpty()) throw new Exception("Problem in calculating fixedPrice");
        return items.get(0).getPurchasePrice();
    }
}

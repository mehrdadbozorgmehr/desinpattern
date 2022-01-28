package ir.com.sample.designpattern.strategy;

import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
public class TireOrder extends WarehouseOrderContext{
    public TireOrder(List<Item> items, PricingStrategy strategy) {
        super(items, strategy);
    }
}

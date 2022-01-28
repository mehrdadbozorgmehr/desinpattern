package ir.com.sample.designpattern.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class EngineOrder extends WarehouseOrderContext {
    public EngineOrder(List<Item> items, PricingStrategy strategy) {
        super(items, strategy);
    }
}

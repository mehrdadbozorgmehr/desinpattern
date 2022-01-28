package ir.com.sample.designpattern.strategy;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by Mehrdad on 01/27/2022.
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        TireItem engineItem1 = new TireItem("turbo-11",new BigDecimal(100000));
        TireItem engineItem2 = new TireItem("turbo-12",new BigDecimal(120000));
        WarehouseOrderContext order1 = new EngineOrder(Arrays.<Item>asList(engineItem1,engineItem2),new LifoPricing());
        System.out.println("Pricing method is LIFO and FixedPrice is "+order1.calculateFixedPrice());

        TireItem tireItem3 = new TireItem("radial-13",new BigDecimal(1500));
        WarehouseOrderContext order2 = new TireOrder(Arrays.<Item>asList(tireItem3),new FifoPricing());
        System.out.println("Pricing method is FIFO and FixedPrice is "+order2.calculateFixedPrice());

        TireItem tireItem4 = new TireItem("radial-14",new BigDecimal(2000));
        TireItem tireItem5 = new TireItem("radial-15",new BigDecimal(2200));
        WarehouseOrderContext order3 = new TireOrder(Arrays.<Item>asList(tireItem4,tireItem5),new AveragePricing());
        System.out.println("Pricing method is Average and FixedPrice is "+order3.calculateFixedPrice());
    }


}

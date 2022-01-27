package ir.com.sample.designpattern.strategy;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Mehrdad on 01/27/2022.
 */
public interface PricingStrategy {
    BigDecimal getFixedPrice() throws Exception;
}

package ir.com.sample.designpattern.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by Mehrdad on 01/27/2022.
 */
@AllArgsConstructor
@Getter
@Setter
public class TireItem implements Item {

    private String serialNo;
    private BigDecimal purchasePrice;

    @Override
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }
}

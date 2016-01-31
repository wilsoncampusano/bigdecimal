package bigdecimal;

import java.math.BigDecimal;

public class BigDecimalUtil {

    public static boolean value(BigDecimal value, ComparableBigDecimal comparator) {
        return comparator.compareTo(value);
    }
}

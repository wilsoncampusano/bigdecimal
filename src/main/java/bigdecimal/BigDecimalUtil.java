package bigdecimal;
import java.math.BigDecimal;

public class BigDecimalUtil {

    public static boolean theValue(BigDecimal source, ComparableBigDecimal comparableBigDecimal){
        return comparableBigDecimal.compareTo(source);
    }
}

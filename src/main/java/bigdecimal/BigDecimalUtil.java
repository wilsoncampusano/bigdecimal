package bigdecimal;
import java.math.BigDecimal;

/**
 * Created by wicampusano on 11/21/2015.
 */
public class BigDecimalUtil {

    public static boolean theValue(BigDecimal source, ComparableBigDecimal comparableBigDecimal){
        return comparableBigDecimal.compareTo(source);
    }
}

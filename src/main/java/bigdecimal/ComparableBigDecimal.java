package bigdecimal;
import java.math.BigDecimal;

/**
 * Created by wicampusano on 11/21/2015.
 */
@FunctionalInterface
public interface ComparableBigDecimal {
    boolean compareTo(BigDecimal igualando);

    static ComparableBigDecimal isZeroOrNull(){
        return null;
    }
}

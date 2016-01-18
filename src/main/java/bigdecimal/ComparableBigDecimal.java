package bigdecimal;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by wicampusano on 11/21/2015.
 */
@FunctionalInterface
public interface ComparableBigDecimal {
    boolean compareTo(BigDecimal igualando);

    static ComparableBigDecimal isZeroOrNull(){
        return igualando -> {
            if(Objects.isNull(igualando))
                return true;
            if(igualando.compareTo(BigDecimal.ZERO) == 0)
                return true;
            return false;
        };
    }
}

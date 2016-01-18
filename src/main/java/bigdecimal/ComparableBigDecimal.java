package bigdecimal;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by wicampusano on 11/21/2015.
 */
@FunctionalInterface
public interface ComparableBigDecimal {
    boolean compareTo(BigDecimal target);

    static ComparableBigDecimal isZeroOrNull(){
        return source -> {
            if (isNull(source)) return true;
            if(source.compareTo(BigDecimal.ZERO) == 0)
                return true;
            return false;
        };
    }


    static ComparableBigDecimal isEqualTo(BigDecimal target) {
        return source -> {
            if(isNull(target)) return true;
            if(source.compareTo(target) == 0)
                return true;
            return false;
        };
    }


    static ComparableBigDecimal isNotEqualTo(BigDecimal target) {
        return source ->{
            if(isNull(target)) return true;
            if((source.compareTo(target) != 0))
                return true;
            return false;
        };

    }


    static boolean isNull(BigDecimal igualando) {
        if(Objects.isNull(igualando))
            return true;
        return false;
    }
}

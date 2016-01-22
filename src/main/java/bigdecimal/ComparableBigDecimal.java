package bigdecimal;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by wicampusano on 11/21/2015.
 */
@FunctionalInterface
public interface ComparableBigDecimal {
    boolean compareTo(BigDecimal value);

    static ComparableBigDecimal isZeroOrNull(){
        return source -> {
            if (isNull(source)) return true;
            if(source.compareTo(BigDecimal.ZERO) == 0)
                return true;
            return false;
        };
    }


    static ComparableBigDecimal isEqualTo(BigDecimal value) {
        return source -> {
            if(isNull(value)) return true;
            if(source.compareTo(value) == 0)
                return true;
            return false;
        };
    }


    static ComparableBigDecimal isNotEqualTo(BigDecimal value) {
        return source ->{
            if(isNull(value)) return true;
            if((source.compareTo(value) != 0))
                return true;
            return false;
        };

    }

    static ComparableBigDecimal isGreaterThan(BigDecimal minorValue) {
        return source ->{
            if(isNull(minorValue)) return false;
            if(source.compareTo(minorValue) == 1) return true;
            return false;
        };
    }


    static boolean isNull(BigDecimal igualando) {
        if(Objects.isNull(igualando))
            return true;
        return false;
    }
}

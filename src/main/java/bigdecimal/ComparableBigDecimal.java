package bigdecimal;
import java.math.BigDecimal;
import static java.util.Objects.isNull;

@FunctionalInterface
public interface ComparableBigDecimal {
    boolean compareTo(BigDecimal value);

    static ComparableBigDecimal isZeroOrNull(){
        return source -> {
            if (isNull(source)) return true;
            return (source.compareTo(BigDecimal.ZERO) == 0);
        };
    }

    static ComparableBigDecimal isEqualTo(BigDecimal value) {
        return source -> {
            if(isNull(value)) return true;
            return (source.compareTo(value) == 0);
        };
    }

    static ComparableBigDecimal isNotEqualTo(BigDecimal value) {
        return source ->{
            if(isNull(value)) return true;
            return ((source.compareTo(value) != 0));
        };

    }

    static ComparableBigDecimal isGreaterThan(BigDecimal minorValue) {
        return source ->{
            if(isNull(minorValue)) return false;
            return (source.compareTo(minorValue) == 1);
        };
    }

    static ComparableBigDecimal isLessThan(BigDecimal greaterValue) {
        return source ->{
            if(isNull(greaterValue)) return false;
            return (source.compareTo(greaterValue) == -1);
        };
    }
}
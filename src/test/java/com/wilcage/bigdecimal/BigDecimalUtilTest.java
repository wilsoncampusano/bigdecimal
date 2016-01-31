package com.wilcage.bigdecimal;
import com.wilcage.bigdecimal.ComparableBigDecimal;
import org.junit.Test;

import java.math.BigDecimal;

import static com.wilcage.bigdecimal.BigDecimalUtil.*;
import static com.wilcage.bigdecimal.ComparableBigDecimal.*;
import static org.junit.Assert.*;

public class BigDecimalUtilTest {
    public static final String MESSAGE ="COMPARISON NOT MATCH";

    public void assertThatABigDecimal(BigDecimal value, ComparableBigDecimal comparableBigDecimal) {
        assertTrue(MESSAGE, value(value, comparableBigDecimal));
    }

    @Test
    public void checkZeroOrNull(){
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal nulL = null;
        BigDecimal value = new BigDecimal(323);

        assertTrue(value(zero, isZeroOrNull()));
        assertTrue(value(nulL, isZeroOrNull()));
        assertFalse(value(value, isZeroOrNull()));
    }

    @Test
    public void checkForEqualValues(){

        BigDecimal value = new BigDecimal(323);
        BigDecimal anotherValue = new BigDecimal(324);

        assertTrue(value(value, isEqualTo(value)));
        assertFalse(value(value, isEqualTo(anotherValue)));
    }

    @Test
    public void checkForNonEqualValues(){

        BigDecimal value = new BigDecimal(323);
        BigDecimal anotherValue = new BigDecimal(324);

        assertThatABigDecimal(value, isNotEqualTo(anotherValue));
    }

    @Test
    public void checkForGreaterThanValues(){
        BigDecimal minorValue =  new BigDecimal(1000);
        BigDecimal greatervalue = new BigDecimal(1000.1);

        assertThatABigDecimal(greatervalue, isGreaterThan(minorValue));
    }

    @Test
    public void checkForLessThanValues(){

        BigDecimal lessValue =  new BigDecimal(999.9);
        BigDecimal greaterValue = new BigDecimal(1000);

        assertThatABigDecimal(lessValue, isLessThan(greaterValue));
    }
}

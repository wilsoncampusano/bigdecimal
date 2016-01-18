import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static bigdecimal.BigDecimalUtil.*;
import static bigdecimal.ComparableBigDecimal.isZeroOrNull;


/**
 * Created by wicampusano on 11/21/2015.
 */
public class BigDecimalUtilTest {


    @Test
    public void checkZeroOrNull(){
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal nulL = null;

        Assert.assertTrue("fails: is not zero" , theValue(zero, isZeroOrNull()));
        Assert.assertTrue("fails: is not null", theValue(nulL, isZeroOrNull()));
    }

    @Test
    public void aValueOf232IsNotZeroOrNull(){
        BigDecimal value = new BigDecimal(323);

        Assert.assertFalse("fails: is not zero or null", theValue(value, isZeroOrNull()));
    }

}

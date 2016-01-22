# BigDecimal comparison util.



Look this :(

```java
	//some imports ...
    import static bigdecimal.BigDecimalUtil.*;
	import static bigdecimal.ComparableBigDecimal;

	//some code...
    BigDecimal balance = account.getBalance();

    if(balance != null && balance.compareTo(BigDecimal.Zero) == 0){
    	//.. do something
    }

```

And now look this!

```java
	//some imports ...
    import static bigdecimal.BigDecimalUtil.*;
	import static bigdecimal.ComparableBigDecimal;

	//some code...
    BigDecimal balance = account.getBalance();

    if(theValue(balance, isZeroOrNull()){
    	//.. do something
    }
```

:+1:
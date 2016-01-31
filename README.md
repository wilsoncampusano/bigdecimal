# BigDecimal comparison util.



Look this

```java
	//some imports ...

	//some code...
    BigDecimal balance = account.getBalance();

    if(balance != null && balance.compareTo(BigDecimal.Zero) == 0){
    	//.. do something
    }

```

It's not clean code :tear: ...

Apply **ComparableBigDecimal**.... and now look this! :+1:

```java
	//some imports ...
    import static bigdecimal.BigDecimalUtil.*;
	import static bigdecimal.ComparableBigDecimal;

	//some code...
    BigDecimal balance = account.getBalance();

    if(value(balance, isZeroOrNull()){
    	//.. do something
    }
```

### Todos

 - ~~Zero or null~~
 - ~~Igual to~~
 - ~~Greater than~~
 - ~~Less than~~
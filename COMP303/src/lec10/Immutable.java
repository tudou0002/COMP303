package lec10;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;


@Target(TYPE)
@Immutable
public @interface Immutable {
	public String inspector() default "Yifei";
	//@Immutable
}

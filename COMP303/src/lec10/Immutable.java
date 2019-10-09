package lec10;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;


@Target(TYPE)
@Immutable

/**
 * In a way, annotation is created for documentation purpose
 * @author Yifei
 *
 */
public @interface Immutable {
	public String inspector() default "Yifei";
	//@Immutable(inspector="Someone")
	
	/*
	 * @Retention
	 * Source: won't be detected e.g.@Override
	 * Class: won't be detected
	 * Runtime: can be detected e.g. @Test
	 */
}

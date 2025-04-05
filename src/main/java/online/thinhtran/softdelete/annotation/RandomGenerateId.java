package online.thinhtran.softdelete.annotation;

import online.thinhtran.softdelete.generator.RandomIdGenerator;
import org.hibernate.annotations.IdGeneratorType;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@IdGeneratorType(RandomIdGenerator.class)
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface RandomGenerateId {
}

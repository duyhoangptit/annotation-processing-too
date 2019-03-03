package vn.hoangptit.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
// check lúc source compliler, RUN_TIME thì sẽ là lúc biên dịch
public @interface PublicFinal {

}

package cn.gjing.lock;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Gjing
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Lock {

    /**
     * 锁对应的key
     */
    String key();

    /**
     * 过期时间,单位(s)
     */
    int expire() default 5;

    /**
     * 超时时间,单位毫秒(ms)
     */
    int timeout() default 5000;

    /**
     * 重新获取锁的时间，单位ms
     */
    int retry() default 10;
}

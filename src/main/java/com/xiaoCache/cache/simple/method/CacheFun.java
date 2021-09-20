package com.xiaoCache.cache.simple.method;

import java.io.Serializable;

/**
 * [无参数的函数对象](Function object without parameters)
 * @description: zh - 无参数的函数对象
 * @description: en - Function object without parameters
 * @version: V1.0
 * @author XiaoXunYao
 * @since 2021-09-20 11:28:52
*/
@FunctionalInterface
public interface CacheFun<R> extends Serializable {
    /**
     * [执行函数](Executive function)
     * @description: zh - 执行函数
     * @description: en - Executive function
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021-09-20 11:29:00
     * @throws Exception 异常
     * @return R
    */
    R call() throws Exception;

    /**
     * [执行函数，异常包装为RuntimeException](Execute the function and wrap the exception as RuntimeException)
     * @description: zh - 执行函数，异常包装为RuntimeException
     * @description: en - Execute the function and wrap the exception as RuntimeException
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021-09-20 11:29:09
     * @return R
    */
    default R callWithRuntimeException(){
        try {
            return call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

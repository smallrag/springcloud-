package com.zzw.springcloud.alibaba.domain;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 18:57
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 18:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

private Integer code;
private String message;
private T data;

public CommonResult(Integer code,String message){
    this(code,message,null);
}

}

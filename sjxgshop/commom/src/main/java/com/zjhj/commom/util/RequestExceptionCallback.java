package com.zjhj.commom.util;

/**
 * Created by brain on 2016/6/16.
 */
public interface RequestExceptionCallback {
    void error(Integer code, String message);
}

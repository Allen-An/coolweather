package com.coolweather.app.util;

/**
 * Created by David-Ann on 2016/3/9 0009.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}

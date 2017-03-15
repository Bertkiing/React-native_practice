package com.helloworld;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

/**
 * Created by Administrator on 2017/3/15.
 */
public class ToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_SHORT_KEY = "SHORT";
    public static final String DURATION_LONG_KEY = "LONG";

    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ToastAndroidV";
    }

    /**
     * getContants返回了需要导出给JavaScript使用的常量。它并不一定需要实现，
     * 但在定义一些可以被JavaScript同步访问到的预定义的值时非常有用。
     * @return
     */
    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        Map<String,Object> contants = new HashMap<>();
        contants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
        contants.put(DURATION_SHORT_KEY,Toast.LENGTH_SHORT);
        return contants;
    }

    /**
     * 要导出一个方法给JavaScript使用，Java方法需要使用注解@ReactMethod。方法的返回类型必须为void。
     * @param message
     * @param duration
     */
    @ReactMethod
    public void show(String message,int duration){
        Toast.makeText(getReactApplicationContext(),message,duration).show();
    }

}

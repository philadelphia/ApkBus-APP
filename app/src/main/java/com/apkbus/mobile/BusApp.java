package com.apkbus.mobile;

import android.app.Application;

import com.apkbus.mobile.apis.Constants;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.mob.commons.SHARESDK;
import com.mob.mobapi.MobAPI;

import cn.sharesdk.framework.ShareSDK;

/**
 * Created by liyiheng on 16/9/19.
 */
public class BusApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        MobAPI.initSDK(this, Constants.MOBAPI_KEY);
        ShareSDK.initSDK(this, Constants.MOBAPI_KEY);
    }
}

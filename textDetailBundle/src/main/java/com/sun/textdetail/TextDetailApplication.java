package com.sun.textdetail;

import android.app.Application;

/**
 * @author hengyangji
 *         on 2021/11/2
 */
public class TextDetailApplication extends Application {

    public static TextDetailBundleIniter secondBundleIniter;

    // here is the second bundle init method
    @Override
    public void onCreate() {
        super.onCreate();
        secondBundleIniter = new TextDetailBundleIniter();
        secondBundleIniter.init(this);
    }
}

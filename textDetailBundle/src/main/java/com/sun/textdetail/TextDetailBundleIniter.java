package com.sun.textdetail;

import android.app.Application;

public class TextDetailBundleIniter {


    private Application application;


    public void init(Application application){

        this.application = application;
    }


    public Application getApplication(){

        return application;
    }
}

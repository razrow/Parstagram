package com.example.parstagram;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    //sets up the Parse SDK
    @Override
    public void onCreate() {
        super.onCreate();

        //register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("bgzJbYwoCZHsbfeSdtwnhs3h27ZG94rvzx3z8HI7")
                .clientKey("VtQvD0s8PsFn1q1jK2SLf3dmT6rHnCZomtxXwHdR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

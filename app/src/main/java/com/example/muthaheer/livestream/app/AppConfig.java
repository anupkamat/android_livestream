package com.example.muthaheer.livestream.app;

import android.app.Application;

/**
 * Created by muthaheer on 25/12/16.
 */

public class AppConfig extends Application {
    public static String URL_SERVER = "http://192.168.43.219:4300/api/";
    // Server user login url
    public static String URL_LOGIN = URL_SERVER + "user/authenticate";
    // Server user signup url
    public static String URL_SIGNUP = URL_SERVER + "user/signup";

    public static String URL_GETTOKEN = URL_SERVER + "stream";



}

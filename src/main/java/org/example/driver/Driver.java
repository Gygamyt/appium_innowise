package org.example.driver;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Driver {

    private static final ThreadLocal<AndroidDriver> DRIVER_STORAGE = new ThreadLocal<>();

    public Driver() {
    }

    public static AndroidDriver getDriver() {
        if (DRIVER_STORAGE.get() == null) {
            DRIVER_STORAGE.set(createDriver());
        }
        return DRIVER_STORAGE.get();
    }

    public static void quitDriver() {
        while (DRIVER_STORAGE.get() != null){
            DRIVER_STORAGE.get().quit();
        }
    }

    public static AndroidDriver createDriver() {
        UiAutomator2Options capabilities = new UiAutomator2Options()
                .disableWindowAnimation()
                .setDeviceName("Pixel 7")
                .setPlatformName("Android")
                .setPlatformVersion("14")
                .setAppPackage("my.android.calc")
                .setAppActivity("my.android.calc.MainActivity")
                .setApp("C:\\Users\\user\\IdeaProjects\\appium\\src\\test\\resources\\Calc.apk");
        return new AndroidDriver(getUrl(), capabilities);
    }

    private static URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.liam191.journeystore;

import android.app.Application;
import android.content.Context;

import androidx.test.runner.AndroidJUnitRunner;

public class CustomTestRunner extends AndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return super.newApplication(cl, FakeJourneyStoreApplication.class.getName(), context);
    }
}

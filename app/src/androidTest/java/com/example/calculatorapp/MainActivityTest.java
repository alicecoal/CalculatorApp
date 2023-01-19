package com.example.calculatorapp;

import static androidx.test.InstrumentationRegistry.getContext;
import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import java.util.Locale;

import javax.annotation.Nullable;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void editTextEnglishTest() {
        Locale.setDefault(new Locale("en", "EN"));
        SystemClock.sleep(100);
        Espresso.onView(withId(R.id.displayEditText)).check(matches(withText("Enter in a value")));

        Locale locale = new Locale("ru", "RU");
        Resources res = mActivityTestRule.getActivity().getResources();
        Configuration config = res.getConfiguration();
        config.locale = locale;
        res.updateConfiguration(config, res.getDisplayMetrics());
    }

    @Test
    public void editTextRussianTest() {
        /*ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
        mActivityTestRule.getActivity();*/
        Locale.setDefault(new Locale("ru", "RU"));
        SystemClock.sleep(100);
        Espresso.onView(withId(R.id.displayEditText)).check(matches(withText("Введите выражение")));
    }

    @Test
    public void orientationPortraitTest() {
        // testing if the "frame_layout1" container for Extended_calculator Fragment exists
        mActivityTestRule.getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        SystemClock.sleep(100);
        Espresso.onView(withId(R.id.frame_layout1)).check(doesNotExist());
    }

    @Test
    public void orientationLandscapeTest() {
        // testing if the "frame_layout1" container for Extended_calculator Fragment exists
        mActivityTestRule.getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        SystemClock.sleep(100);
        Espresso.onView(withId(R.id.frame_layout1)).check(matches(isDisplayed()));
    }




}
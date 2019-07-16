package com.russian_woodpecker.travis_ci_test;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withInputType;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(androidx.test.ext.junit.runners.AndroidJUnit4.class)
@LargeTest
public class BasicInstrumentedTest {

    @Rule
    public final ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEcho() {
        onView(withId(R.id.activity_main_et_echo_input)).perform(typeText("test"));
        onView(withId(R.id.activity_main_btn_echo_send)).perform(click());
        onView(withId(R.id.activity_main_tv_echo_text)).check(matches(withText("test")));
    }
}

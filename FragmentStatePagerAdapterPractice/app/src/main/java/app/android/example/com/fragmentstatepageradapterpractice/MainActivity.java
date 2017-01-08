package app.android.example.com.fragmentstatepageradapterpractice;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

import app.android.example.com.fragmentstatepageradapterpractice.FragmentStatePagerSupport;
import app.android.example.com.fragmentstatepageradapterpractice.R;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
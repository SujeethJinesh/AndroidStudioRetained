package app.android.example.com.facebooku;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}

class MyAdapter extends FragmentPagerAdapter {

    Fragment welcomePage = new welcomePage();
    Fragment oculus = new oculus();
    Fragment internet = new internet();
    Fragment powerOverWifi = new powerOverWifi();
    Fragment vehicleCommunication = new vehicleCommunication();
    Fragment dontBeSad = new DontBeSad();
    Fragment livingFarAway = new LivingFarAway();
    Fragment slowDownTime = new SlowDownTime();
    Fragment prom = new Prom();

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        if (i == 0)
        {
            return welcomePage;
        }
        if (i == 1)
        {
            return oculus;
        }
        if (i == 2)
        {
            return internet;
        }
        if (i == 3)
        {
            return powerOverWifi;
        }
        if (i == 4)
        {
            return vehicleCommunication;
        }
        if (i == 5) {
            return dontBeSad;
        }
        if (i == 6) {
            return livingFarAway;
        }
        if (i == 7) {
            return slowDownTime;
        }
        if (i == 8) {
            return prom;
        }
        return new Fragment();
    }

    @Override
    public int getCount() {
        return 9;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}

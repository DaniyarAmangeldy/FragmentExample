package daniyaramangeldy.exerciseapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class MainActivity extends AppCompatActivity {
    public static final String IS_CLICKED = "isClicked";
    TextView tv;
    AHBottomNavigation navigation;
    ViewPager pager;
    boolean isClicked = false;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);
        final Adapter adapter = new Adapter(getSupportFragmentManager());
        pager = (ViewPager) findViewById(R.id.container);
        pager.setAdapter(adapter);
        AHBottomNavigationItem item1 = new AHBottomNavigationItem("android",R.drawable.ic_android_black_24dp);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("home",R.drawable.ic_home_black_24dp);
        navigation.addItem(item1);
        navigation.addItem(item2);


        navigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                pager.setCurrentItem(position);
                return false;
            }
        });

        isClicked = false;
        if(savedInstanceState!=null){
            boolean a = savedInstanceState.getBoolean(IS_CLICKED);
            if(a == true) {
                tv.setText("Method.kZ!!!!! :) kwdskas;dl lOLOLOLO");
            }
        }

        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(IS_CLICKED,isClicked);
    }
}

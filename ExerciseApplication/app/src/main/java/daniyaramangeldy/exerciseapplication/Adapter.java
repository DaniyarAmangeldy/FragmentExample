package daniyaramangeldy.exerciseapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by daniyaramangeldy on 28.06.17.
 */

public class Adapter extends FragmentPagerAdapter {
    final Fragment fragment1 = new BlankFragment1();
    final Fragment fragment2 = new BlankFragment2();

    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return fragment1;
            case 1:
                return fragment2;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 2;
    }
}

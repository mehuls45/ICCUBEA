package iccubea.iccubea2017.com.iccubea;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.google.android.gms.internal.n;

/**
 * Created by Akshay on 22/07/17.
 */

public class TabbedPageAdapter extends FragmentPagerAdapter {

    int tabCnt;

    public TabbedPageAdapter(FragmentManager fm , int numberOFTabs) {
        super(fm);
        this.tabCnt = numberOFTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                KeynoteFragment keynoteFragment = new KeynoteFragment();
                return keynoteFragment;
            case 2:
                AboutPCCOEFrag pccoeFrag = new AboutPCCOEFrag();
                return pccoeFrag;
            case 1:
                AboutICCUBEAFrag iccubeaFrag = new AboutICCUBEAFrag();
                return iccubeaFrag;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCnt;
    }
}

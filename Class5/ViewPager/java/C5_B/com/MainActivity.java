package C5_B.com;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_tabs);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_pager);
        Fragment[] arrFrag = new Fragment[3];
        arrFrag[0] = new RedFragment();
        arrFrag[1] = new GreenFragment();
        arrFrag[2] = new BlackFragment();

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), arrFrag);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    private class MyPagerAdapter extends FragmentPagerAdapter{

        private Fragment[] arrFrag;

        public MyPagerAdapter(@NonNull FragmentManager fm, Fragment[] arrFrag) {
            super(fm);
            this.arrFrag = arrFrag;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return arrFrag[position];
        }

        @Override
        public int getCount() {
            return arrFrag.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {

            switch (position){
                case 0:
                    return "RED";
                case 1:
                    return "GREEN";
                case 2:
                    return "BLACK";
                default:
                    return "";

            }
        }
    }
}

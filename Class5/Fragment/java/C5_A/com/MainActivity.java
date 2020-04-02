package C5_A.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnColorBtnListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Red2Fragment red2frag = new Red2Fragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fl_fragment, red2frag).commit();
    }

    @Override
    //Color
    //0: red1, 1: red2, 2: red3

    public void onColorClick(int color) {
        Fragment fragment = null;

        switch(color){
            case 0:
                fragment = new RedFragment();
                break;
            case 1:
                fragment = new Red2Fragment();

                break;
            case 2:
                fragment = new Red3Fragment();
                break;
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_fragment, fragment).commit();

    }
}

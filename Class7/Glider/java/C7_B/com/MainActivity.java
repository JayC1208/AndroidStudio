package C7_B.com;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView myimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myimg = findViewById(R.id.img);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLoadImg();
            }
        });
    }

    private void startLoadImg() {
        String url = "https://t1.daumcdn.net/liveboard/happypet/226c5d22a96348978d1f392a509984ba.JPG";
        Glide.with(this).load(url).into(myimg);
    }
}

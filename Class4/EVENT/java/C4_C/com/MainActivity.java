package C4_C.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.im_like).setOnClickListener(this);
        findViewById(R.id.im_share).setOnClickListener(this);
        findViewById(R.id.im_photo).setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.im_like:
                Toast.makeText(MainActivity.this, "I like this!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.im_share:
                Toast.makeText(MainActivity.this, "Want to share this!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Toast.makeText(MainActivity.this, "Want this!", Toast.LENGTH_SHORT).show();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Toast.makeText(MainActivity.this, "Down!", Toast.LENGTH_SHORT).show();
                break;
            case MotionEvent.ACTION_UP:
                Toast.makeText(MainActivity.this, "UP!", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;  //when it is set as false, both touch and click lister works on same view
    }
}

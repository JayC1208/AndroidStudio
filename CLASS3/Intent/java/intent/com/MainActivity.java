package intent.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static intent.com.R.id.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(btn_call);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        Intent intent = new Intent();
//        intent.setAction(intent.ACTION_DIAL);
//        startActivity(intent);
        //Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,call.class);
        intent.putExtra("intent-message","MapSee");
        startActivity(intent);
    }
}

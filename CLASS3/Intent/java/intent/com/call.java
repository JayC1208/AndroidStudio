package intent.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class call extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        String msg = getIntent().getStringExtra("intent-message");
        Toast.makeText(call.this, msg,Toast.LENGTH_SHORT).show();
    }
}

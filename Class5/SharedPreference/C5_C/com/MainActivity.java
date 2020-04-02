package C5_C.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // default = -1 -> new user
    // original-user = 1
    public static final String SPREF_FIRST_USER_KEY = "1000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.hello);

        SharedPreferences sharedPref =  getPreferences(Context.MODE_PRIVATE);
        int fUser = sharedPref.getInt(SPREF_FIRST_USER_KEY, -1);

        if (fUser == 1){
            //original-user
            //오늘도 감사합니다
            textView.setText(getString(R.string.hello_user));
        }
        else if(fUser == -1){
            //new-user
            //만나서 반갑습니다
            textView.setText(getString(R.string.hello_first));
            adjustUser();
        }

    }
    private void adjustUser(){
        SharedPreferences sharedPref =  getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(SPREF_FIRST_USER_KEY, 1);
        editor.commit();

    }
}

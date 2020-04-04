package C7_A.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCalculation();
            }
        });
    }

    private void startCalculation() {
        AsyncCalTask task = new AsyncCalTask();
        task.execute(1,100_000_000);

    }
//AsyncTask<시작값, 중간값, 결과값>
    class AsyncCalTask extends AsyncTask<Integer, Integer, Integer>{

        @Override
        protected Integer doInBackground(Integer... integers) {
            int number = integers[0];
            int count = integers[1];
            int result = 0;
            int percent = count/100;
            for(int i = 0;i < count; i++){
                result += number;
                if(result % percent ==0){
                    publishProgress(result/percent);
                }
            }
            return result;
        }
        //UI thread
        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            display.setText("Result: " + integer);
        }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        display.setText(values[0]+"Percent");
    }
}
}

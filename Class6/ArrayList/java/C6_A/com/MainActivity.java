package C6_A.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import dataModel.PostItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PostItem> listItem = new ArrayList<>();
        LinearLayout scr_main = findViewById(R.id.l_scroll);

        for (int i = 0; i < 5; i++){
            PostItem postItem = new PostItem(true, 10, "meme",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTV0lKLz5MoMa94CiZR4dPuQU_JICUvCXQE_04DfbVkiKLHa9FW&usqp=CAU", "HAPPY!");
            listItem.add(i, postItem);
        }
        for (PostItem itm:listItem){

            View v = View.inflate(this, R.layout.post_item, null);
            TextView user_id = (TextView) v.findViewById(R.id.user_id);
            TextView user_text =(TextView) v.findViewById(R.id.user_text);

            user_id.setText(itm.getUserName());
            user_text.setText(itm.getPostText());
            scr_main.addView(v);
        }
    }
}

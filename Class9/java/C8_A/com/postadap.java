package C8_A.com;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class postadap extends RecyclerView.Adapter<postViewHolder> {

    private ArrayList<Post_item>posts;
    private Context mContext;

    public postadap(Context context, ArrayList<Post_item> itemList){
        mContext = context;
        posts = itemList;

    }
    @NonNull
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View base = View.inflate(mContext, R.layout.post_item,null);
        postViewHolder pvHolder = new postViewHolder(base, this);
        return pvHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {
        Post_item myitm =  posts.get(position);
        holder.user_id.setText(myitm.getUserName());
        holder.ptext.setText(myitm.getText());
        holder.likecnt.setText(String.valueOf(myitm.getLikeCnt()));
        Glide.with(mContext).load(myitm.getUrl()).into(holder.postimg);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}

package FB_1.com;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import FB_1.com.api.Api;

public class postadap extends RecyclerView.Adapter<postViewHolder> {

    private ArrayList<Api.Post>posts;
    private Context mContext;

    @NonNull
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View base = View.inflate(mContext, R.layout.post_item,null);
        postViewHolder pvHolder = new postViewHolder(base, this);
        return pvHolder;
    }

    public postadap(Context context, ArrayList<Api.Post> itemList){
        mContext = context;
        posts = itemList;
    }


    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {
        Api.Post myitm =  posts.get(position);
        String url = myitm.getImageUrl();
        holder.user_id.setText(myitm.getUploader());
        holder.ptext.setText(myitm.getText());
        holder.likecnt.setText(String.valueOf(myitm.getLikes().getCount()));
        Glide.with(mContext).load(url).into(holder.postimg);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}

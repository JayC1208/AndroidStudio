package RecyclerV;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import C6_A.com.R;
import dataModel.PostItem;

public class PostAdaptor extends RecyclerView.Adapter<PostViewHolder> {

    private Context mContext;
    private ArrayList<PostItem> postitems;
    public PostAdaptor(Context context, ArrayList<PostItem> listItem){
        mContext = context;
        postitems = listItem;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View baseview = View.inflate(mContext, R.layout.post_item,null);
        PostViewHolder postViewHolder = new PostViewHolder(baseview, this);
        return postViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        PostItem itm = postitems.get(position);
        holder.user_id.setText(itm.getUserName());
        holder.ptext.setText(itm.getPostText());
        holder.lcnt.setText(String.valueOf(itm.getLikeCount()));

    }

    @Override
    public int getItemCount() {
        return postitems.size();
    }

    public void onLikcClicked(int pos){
        PostItem  itm = postitems.get(pos);
        Toast.makeText(mContext, pos+" : " + itm.getPostText(), Toast.LENGTH_SHORT).show();    }
}

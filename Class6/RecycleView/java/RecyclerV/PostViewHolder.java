package RecyclerV;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import C6_A.com.R;

public class PostViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener {

    public CheckBox cb_like;
    public ImageView  pimg, like, share;
    public TextView lcnt, user_id, ptext;
    private PostAdaptor mAdap;

    public PostViewHolder(@NonNull View itemView, PostAdaptor postAdaptor) {
        super(itemView);
        pimg = itemView.findViewById(R.id.post_img);
//        like = itemView.findViewById(R.id.like);
        cb_like = itemView.findViewById(R.id.cb_like);
        share = itemView.findViewById(R.id.share);
        lcnt = itemView.findViewById(R.id.like_cnt);
        user_id = itemView.findViewById(R.id.user_id);
        ptext = itemView.findViewById(R.id.user_text);
        mAdap = postAdaptor;

//        like.setOnClickListener(this);
        share.setOnClickListener(this);
        cb_like.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int pos = getAdapterPosition();

        switch (v.getId()){
//            case R.id.like:
            case R.id.cb_like:
                mAdap.onLikcClicked(pos);
                break;
            case R.id.share:
                break;
        }

    }

}



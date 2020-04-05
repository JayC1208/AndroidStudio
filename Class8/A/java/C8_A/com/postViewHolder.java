package C8_A.com;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class postViewHolder extends RecyclerView.ViewHolder {

    public ImageView postimg, like, share;
    public TextView user_id, ptext, likecnt;
    public postadap mpada;

    public postViewHolder(@NonNull View itemView, postadap postadap) {
        super(itemView);
        postimg = itemView.findViewById(R.id.post_img);
        like = itemView.findViewById(R.id.like);
        share = itemView.findViewById(R.id.post_share);
        user_id = itemView.findViewById(R.id.post_id);
        ptext = itemView.findViewById(R.id.post_text);
        likecnt = itemView.findViewById(R.id.like_cnt);
        mpada = postadap;
    }
}

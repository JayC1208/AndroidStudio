package C5_A.com;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment implements View.OnClickListener {
private OnColorBtnListener colorBtnListener;
    public LeftFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        view.findViewById(R.id.v_red1).setOnClickListener(this);
        view.findViewById(R.id.v_red2).setOnClickListener(this);
        view.findViewById(R.id.v_red3).setOnClickListener(this);

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        colorBtnListener = (OnColorBtnListener) context;
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.v_red1:
                colorBtnListener.onColorClick(0);
                break;
            case R.id.v_red2:
                colorBtnListener.onColorClick(1);
                break;
            case R.id.v_red3:
                colorBtnListener.onColorClick(2);
                break;
        }


    }
}

package com.example.tiki_layout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_above#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_above extends Fragment {
    private int quantity =0;
    Sendingdata sendingdata;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
   ;

    public Fragment_above() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_above.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_above newInstance(String param1, String param2) {
        Fragment_above fragment = new Fragment_above();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_above, container, false);
        final ImageButton imageAdd = view.findViewById(R.id.imgbtn_add);
        ImageButton imageMinus = view.findViewById(R.id.imgbtn_minus);
        final TextView tvQuantityAbove = view.findViewById(R.id.tv_quantity);
        quantity = Integer.parseInt(tvQuantityAbove.getText().toString());
        imageAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity++;
                tvQuantityAbove.setText(String.valueOf(quantity));
            }
        });
        imageMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity--;
                tvQuantityAbove.setText(String.valueOf(quantity));
            }
        });
        return view;

    }
}
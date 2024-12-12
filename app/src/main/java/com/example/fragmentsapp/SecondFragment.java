package com.example.fragmentsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    //MOST IMPORTANT METHOD!!!!!!!!!!
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//MOST IMPORTANT METHOD!!!!!!!!!!
        //        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        Button btn = view.findViewById(R.id.btn_frag2);
        TextView txt = view.findViewById(R.id.text_frag2);

        btn.setOnClickListener(
                v2 ->
                        Toast.makeText(getActivity(),
                                "Good Bye from Second Fragment",
                                Toast.LENGTH_SHORT).show());

        return view;
    }
}
package com.example.tugas5mobile.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tugas5mobile.DataSource;
import com.example.tugas5mobile.Instagram;
import com.example.tugas5mobile.PostinganAdapter;
import com.example.tugas5mobile.R;

public class HomeFragment extends Fragment {

    public static final String EXTRA_INSTAGRAM = "extra_instagram";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvPostingan = view.findViewById(R.id.rv_post);
        rvPostingan.setHasFixedSize(true);
        PostinganAdapter postinganAdapter = new PostinganAdapter(DataSource.instagrams);
        rvPostingan.setAdapter(postinganAdapter);

        View rootview = requireActivity().findViewById(android.R.id.content);
        ImageView imageView = rootview.findViewById(R.id.IV_Home);
        ImageView imageView2 = rootview.findViewById(R.id.IV_Post);
        ImageView imageView3 = rootview.findViewById(R.id.IV_Search);
        imageView.setImageResource(R.drawable.homeberubahwarna);
        imageView2.setImageResource(R.drawable.baseline_add_24);
        imageView3.setImageResource(R.drawable.baseline_search_24);

        Bundle bundle = getArguments();
        if (bundle != null) {
            Instagram instagram = bundle.getParcelable(EXTRA_INSTAGRAM);
            if (instagram != null) {
                DataSource.instagrams.add(0, instagram);
                postinganAdapter.notifyDataSetChanged();
            }
        }



    }
}

package com.example.tugas5mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tugas5mobile.fragment.HomeFragment;
import com.example.tugas5mobile.fragment.PostinganFragment;
import com.example.tugas5mobile.fragment.ProfileFragment;
import com.example.tugas5mobile.fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_Home = findViewById(R.id.IV_Home);
        ImageView iv_Postingan = findViewById(R.id.IV_Post);
        ImageView iv_Profile = findViewById(R.id.IV_Profile);
        ImageView iv_Search = findViewById(R.id.IV_Search);

        FragmentManager fragmentManager = getSupportFragmentManager();
        HomeFragment homeFragment = new HomeFragment();

        iv_Home.setImageResource(R.drawable.homeberubahwarna);
        iv_Profile.setImageResource(R.drawable.baseline_account_circle_24);
        iv_Postingan.setImageResource(R.drawable.baseline_add_24);
        fragmentManager.beginTransaction()
                .add(R.id.frame_container, homeFragment, HomeFragment.class.getSimpleName())
                .commit();

        iv_Postingan.setOnClickListener(v -> {
            iv_Postingan.setImageResource(R.drawable.postingberubahwarna);
            iv_Profile.setImageResource(R.drawable.baseline_account_circle_24);
            iv_Home.setImageResource(R.drawable.baseline_home_24);
            iv_Search.setImageResource(R.drawable.baseline_search_24);

            PostinganFragment postinganFragment = new PostinganFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_container, postinganFragment)
                    .commit();
        });

        iv_Profile.setOnClickListener(v -> {
            iv_Profile.setImageResource(R.drawable.profileberubahwarna);
            iv_Home.setImageResource(R.drawable.baseline_home_24);
            iv_Postingan.setImageResource(R.drawable.baseline_add_24);
            iv_Search.setImageResource(R.drawable.baseline_search_24);

            ProfileFragment profileFragment = new ProfileFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_container, profileFragment)
                    .commit();
        });

        iv_Home.setOnClickListener(v -> {
            iv_Home.setImageResource(R.drawable.homeberubahwarna);
            iv_Profile.setImageResource(R.drawable.baseline_account_circle_24);
            iv_Postingan.setImageResource(R.drawable.baseline_add_24);
            iv_Search.setImageResource(R.drawable.baseline_search_24);

            HomeFragment homeFragment1 = new HomeFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_container, homeFragment1)
                    .commit();
        });

        iv_Search.setOnClickListener(v -> {
            iv_Search.setImageResource(R.drawable.searchberubahwarna);
            iv_Home.setImageResource(R.drawable.baseline_home_24);
            iv_Postingan.setImageResource(R.drawable.baseline_add_24);
            iv_Profile.setImageResource(R.drawable.baseline_account_circle_24);

            SearchFragment searchFragment = new SearchFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_container, searchFragment)
                    .commit();
        });
    }
}

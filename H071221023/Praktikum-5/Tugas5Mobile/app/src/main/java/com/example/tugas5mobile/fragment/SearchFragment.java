package com.example.tugas5mobile.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas5mobile.DataSource;
import com.example.tugas5mobile.Instagram;
import com.example.tugas5mobile.R;
import com.example.tugas5mobile.SeacrhAdapter;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SearchFragment extends Fragment {

    private ArrayList<Instagram> instagramList;
    private RecyclerView recyclerView;
    private SeacrhAdapter adapter;
    private ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


//        Mendapatkan referensi ke RecyclerView dan ProgressBar dari tampilan
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        progressBar = view.findViewById(R.id.progressBar);
// Membuat daftar Instagram dan adapter untuk RecyclerView
        instagramList = new ArrayList<>();
        adapter = new SeacrhAdapter(instagramList);
        recyclerView.setAdapter(adapter);
// Mendapatkan referensi ke SearchView dari tampilan dan menambahkan listener untuk pembaruan teks pencarian:
        androidx.appcompat.widget.SearchView searchView = view.findViewById(R.id.search_view);
        searchView.setIconifiedByDefault(false);

        // Ubah perilaku pencarian saat teks berubah
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                recyclerView.setVisibility((RecyclerView.GONE));
                performSearch(newText);
                return true;
            }
        });
    }

    private void performSearch(String query) { //untuk melakukan pemcarian
        progressBar.setVisibility(View.VISIBLE); //terlihat

        new Thread(() -> {
            ArrayList<Instagram> filteredList = new ArrayList<>();
            if (!query.isEmpty()) {
                for (Instagram item : DataSource.instagrams) {
                    if (item.getUsername().toLowerCase().contains(query.toLowerCase()) ||
                            item.getName().toLowerCase().contains(query.toLowerCase())) {
                        filteredList.add(item);
                    }
                }
            }

            // Menunggu beberapa detik untuk simulasi pencarian
            try {
                Thread.sleep(2000); // Ganti angka 2000 dengan durasi yang diinginkan dalam milidetik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            requireActivity().runOnUiThread(() -> {
                progressBar.setVisibility(View.GONE);
                recyclerView.setVisibility(RecyclerView.VISIBLE);
                instagramList.clear();
                instagramList.addAll(filteredList);
                adapter.notifyDataSetChanged();
            });
        }).start();
    }
}

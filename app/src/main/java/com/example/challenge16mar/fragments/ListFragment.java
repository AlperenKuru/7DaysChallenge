package com.example.challenge16mar.fragments;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.challenge16mar.R;
import com.example.challenge16mar.adapter.MyAdapter;
import com.example.challenge16mar.model.MyItem;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        MyAdapter adapter = new MyAdapter(getActivity(),getApplications());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<MyItem> getApplications() {
        List<MyItem> items = new ArrayList<>();
        PackageManager manager = getActivity().getPackageManager();
        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);

        List<ResolveInfo> infos = getActivity().getPackageManager().queryIntentActivities(intent, 0);
        for (ResolveInfo resolveInfo : infos) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            items.add(new MyItem(activityInfo.loadIcon(manager),activityInfo.loadLabel(manager).toString(),activityInfo.packageName));
        }
        return items;
    }


}
package me.ykrank.androidlifecycle_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ykrank on 2017/7/9.
 */

public class MainFragment extends Fragment {
    private Handler handler = new Handler();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        l("onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        l("onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        l("onCreateView");

        View button = view.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Main2Activity.class));
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        l("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        l("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        l("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        l("onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        l("onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        l("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        l("onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        l("onDetach");
    }

    private void l(String msg) {
        Log.d("MainFragment", msg);
    }
}

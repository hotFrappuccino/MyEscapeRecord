package com.example.escaperecord;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentMyRecord extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myrecord = inflater.inflate(R.layout.fragment_myrecord,container,false);
        //        Toast.makeText(getActivity(), "MyRecord",Toast.LENGTH_LONG).show();
        Button registerrecord = (Button)myrecord.findViewById(R.id.registerrecord);
        registerrecord.setOnClickListener((view)->{
//            Log.e("click","클릭함");
            Intent intent = new Intent(getActivity(),RegisterRecord.class);
            startActivityForResult(intent,3000);

        });

        return myrecord;
    }
}

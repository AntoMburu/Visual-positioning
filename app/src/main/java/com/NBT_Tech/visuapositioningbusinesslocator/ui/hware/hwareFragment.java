package com.NBT_Tech.visuapositioningbusinesslocator.ui.hware;

import android.content.Intent;
import android.net.Uri;
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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.NBT_Tech.visuapositioningbusinesslocator.Details;
import com.NBT_Tech.visuapositioningbusinesslocator.R;

import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.hware;
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.insuarance;

public class hwareFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(hware, null);

        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Chepshari's Hardware."));
        final Intent det1intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Chepshari's+Hardware/@0.5174571,35.2744622,17.25z/data=!4m8!1m2!2m1!1shardware!3m4!1s0x0:0xbc12a33d5fe57151!8m2!3d0.5181367!4d35.274168"));
        Button gb1 =  root.findViewById(R.id.gb1);
        Button det1= root.findViewById(R.id.det1);
        gb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        det1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det1intent);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Garkarpa Hardware"));
        final Intent det2intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Garkarpa+Hardware/@0.5174571,35.2744622,17.25z/data=!4m8!1m2!2m1!1shardware!3m4!1s0x0:0x59ce9addef8c4b44!8m2!3d0.5174823!4d35.2741492"));
        Button gb2 = (Button) root.findViewById(R.id.gb2);
        Button det2= root.findViewById(R.id.det2);
        gb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
            }
        });
        det2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det2intent);
            }
        });
        /*------------------------------------------------------------hadi hapa------------------------------------------------------------>*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Jokim Hardware"));
        final Intent det3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jokim+Hardware/@0.5174571,35.2744622,17.25z/data=!4m8!1m2!2m1!1shardware!3m4!1s0x0:0xcfe56ed25b0252d3!8m2!3d0.5169995!4d35.276826"));

        Button gb3 = (Button) root.findViewById(R.id.gb3);
        Button det3= root.findViewById(R.id.det3);

        gb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });
        det3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det3intent);
            }
        });
        /*------------------------------------------------------------hadi hapa------------------------------------------------------------>*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=E & M Hardware"));

        final Intent det4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/E+%26+M+Hardware/@0.5178922,35.2719464,17.5z/data=!4m8!1m2!2m1!1shardware!3m4!1s0x0:0xf5cac0ca54bd2bb3!8m2!3d0.5176043!4d35.2710023"));
        Button gb4 = (Button) root.findViewById(R.id.gb4);
        Button det4= root.findViewById(R.id.det4);

        gb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent4);
            }
        });
        det4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det4intent);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Eagle Hardware Ltd"));
        final Intent det5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Eagle+Hardware+Ltd/@0.5178922,35.2719464,17.5z/data=!4m8!1m2!2m1!1shardware!3m4!1s0x0:0xdfbc0b171657c7a3!8m2!3d0.5172469!4d35.2712618"));
        Button gb5 = (Button) root.findViewById(R.id.gb5);
        Button det5= root.findViewById(R.id.det5);


        gb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent5);

            }
        });
        det5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det5intent);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent6= new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Baraka Hardware And Electricals"));
        final Intent det6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Baraka+Hardware+And+Electricals/@0.5161526,35.2725058,17z/data=!3m1!4b1!4m8!1m2!2m1!1shardware!3m4!1s0x0:0xd8f596ba80f31540!8m2!3d0.5161526!4d35.2738072"));
        Button gb6 = (Button) root.findViewById(R.id.gb6);
        Button det6= root.findViewById(R.id.det6);


        gb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent6);
            }
        });
        det6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det6intent);
            }
        });
        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/

        return root;
    }

}
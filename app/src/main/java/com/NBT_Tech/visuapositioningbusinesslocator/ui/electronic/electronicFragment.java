package com.NBT_Tech.visuapositioningbusinesslocator.ui.electronic;

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

import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.electronic;
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.insuarance;

public class electronicFragment extends Fragment {
    private Object Det1,Det2,Det3,Det4,Det5,Det6,Det7,Det8,Det9,Det10,Det11,Det12;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(electronic, null);

        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Family Bank, Kenyatta St, Eldoret"));
        Button gb1 =  root.findViewById(R.id.gb1);
        gb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Transnational Bank, Eldoret"));
        Button gb2 =  root.findViewById(R.id.gb2);
        gb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=DTB Bank (Zion Mall)"));
        Button gb3;
        gb3 =  root.findViewById(R.id.gb3);
        gb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=I&M Bank Eldoret, Imperial Court"));
        Button gb4 =  root.findViewById(R.id.gb4);
        gb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent4);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Equity bank ltd-eldoret"));
        Button gb5 = root.findViewById(R.id.gb5);
        gb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent5);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Equity Bank Eldoret market Branch"));
        Button gb6 =  root.findViewById(R.id.gb6);
        gb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent6);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa------------------kimongonyo botique 0.5169639,35.2735841-------------------------->*/

        final Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?f=d&daddr=Kenya Commercial Bank, Kenyatta Street, Eldoret"));
        Button gb7 =  root.findViewById(R.id.gb7);
        gb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent7);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Kenya Commercial Bank"));
        Button gb8 =  root.findViewById(R.id.gb8);
        gb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent8);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Kenya Women Microfinance Bank"));
        Button gb9 =  root.findViewById(R.id.gb9);
        gb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent9);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Co - Operative Bank"));
        Button gb10;
        gb10 =  root.findViewById(R.id.gb10);
        gb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent10);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /* detail buttons     */


        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det1 = new Intent(getActivity(), Details.class);
        Button det1;
        det1 =  root.findViewById(R.id.det1);
        det1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det1);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det2 = new Intent(getActivity(), Details.class);
        Button det2;
        det2 =  root.findViewById(R.id.det2);
        det2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det2);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det3 = new Intent(getActivity(), Details.class);
        Button det3;
        det3 =  root.findViewById(R.id.det3);
        det3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det3);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det4 = new Intent(getActivity(), Details.class);
        Button det4;
        det4 =  root.findViewById(R.id.det4);
        det4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det4);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det5 = new Intent(getActivity(), Details.class);
        Button det5;
        det5 =  root.findViewById(R.id.det5);
        det5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det5);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det6 = new Intent(getActivity(), Details.class);
        Button det6;
        det6 =  root.findViewById(R.id.det6);
        det6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det6);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det7 = new Intent(getActivity(), Details.class);
        Button det7;
        det7 =  root.findViewById(R.id.det7);
        det7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det7);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det8 = new Intent(getActivity(), Details.class);
        Button det8;
        det8=  root.findViewById(R.id.det8);
        det8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det8);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det9= new Intent(getActivity(), Details.class);
        Button det9;
        det9 =  root.findViewById(R.id.det9);
        det9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det9);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det10 = new Intent(getActivity(), Details.class);
        Button det10;
        det10 =  root.findViewById(R.id.det10);
        det10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det10);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/

        return root;
    }

}
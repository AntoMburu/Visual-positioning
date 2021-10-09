package com.NBT_Tech.visuapositioningbusinesslocator.ui.beauty;

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
import com.NBT_Tech.visuapositioningbusinesslocator.MainActivity;
import com.NBT_Tech.visuapositioningbusinesslocator.R;

import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.eat;
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.fragment_beauty;
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.insuarance;

public class BeautyFragment extends Fragment {

    /*-------------------------------------------------copy modify------------------------------------------------------>*/
    private Object Det1,Det2,Det3,Det4,Det5,Det6,Det7,Det8,Det9,Det10,Det11,Det12,Det13,Det14,Det15,Det16,Det17;

    /*-------------------------------------------------</copy modify------------------------------------------------------>*/

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(fragment_beauty, null);

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
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent11 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Postbank Eldoret Branch"));
        Button gb11 = root.findViewById(R.id.gb11);
        gb11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent11);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent12 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Barclays Bank"));
        Button gb12 =  root.findViewById(R.id.gb12);
        gb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent12);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent13 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=National Bank-Eldoret"));
        Button gb13 =  root.findViewById(R.id.gb13);
        gb13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent13);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa------------------kimongonyo botique 0.5169639,35.2735841-------------------------->*/

        final Intent intent14 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?f=d&daddr=Bank Of Africa Eldoret Branch"));
        Button gb14 =  root.findViewById(R.id.gb14);
        gb14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent14);
            }
        });


        /*------------------------------------------------------------kuanzia hapa------------------kimongonyo botique 0.5169639,35.2735841-------------------------->*/

        final Intent intent15 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?f=d&daddr=Unaitas - Eldoret Branch, Eldoret"));
        Button gb15 =  root.findViewById(R.id.gb15);
        gb15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent15);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa------------------kimongonyo botique 0.5169639,35.2735841-------------------------->*/

        final Intent intent16 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?f=d&daddr=Guardian Bank, Eldoret "));
        Button gb16 =  root.findViewById(R.id.gb16);
        gb16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent16);
            }
        });
        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/

        /*------------------------------------------------------------kuanzia hapa------------------kimongonyo botique 0.5169639,35.2735841-------------------------->*/

        final Intent intent17 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?f=d&daddr=ABC - Bank"));
        Button gb17 = root.findViewById(R.id.gb17);
        gb17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent17);
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
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det11 = new Intent(getActivity(), Details.class);
        Button det11;
        det11 =  root.findViewById(R.id.det11);
        det11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det11);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det12 = new Intent(getActivity(), Details.class);
        Button det12;
        det12=  root.findViewById(R.id.det12);
        det12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det12);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det13= new Intent(getActivity(), Details.class);
        Button det13;
        det13 =  root.findViewById(R.id.det13);
        det13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det13);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det14 = new Intent(getActivity(), Details.class);
        Button det14;
        det14 =  root.findViewById(R.id.det14);
        det14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det14);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/

        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det15 = new Intent(getActivity(), Details.class);
        Button det15;
        det15=  root.findViewById(R.id.det15);
        det15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det15);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det16= new Intent(getActivity(), Details.class);
        Button det16;
        det16 =  root.findViewById(R.id.det16);
        det16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det16);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        Det17 = new Intent(getActivity(), Details.class);
        Button det17;
        det17 =  root.findViewById(R.id.det17);
        det17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity((Intent) Det17);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/


        return root;
    }
}
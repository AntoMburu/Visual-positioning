package com.NBT_Tech.visuapositioningbusinesslocator.ui.government;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.NBT_Tech.visuapositioningbusinesslocator.Details;
import com.NBT_Tech.visuapositioningbusinesslocator.R;

import com.NBT_Tech.visuapositioningbusinesslocator.MainActivity;

import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.government;

public class governmentFragment extends Fragment {


    /*-------------------------------------------------copy modify------------------------------------------------------>*/



    /*-------------------------------------------------</copy modify------------------------------------------------------>*/
    private Object Det1,Det2,Det3,Det4,Det5,Det6,Det7,Det8;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(government, null);

        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Huduma Center Eldoret, Eldoret"));
        final Intent det1intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Huduma+Center+Eldoret/@0.5200247,35.2704405,140m/data=!3m1!1e3!4m5!3m4!1s0x178101a7d3061c03:0x9f55eb1bf64df417!8m2!3d0.5201868!4d35.2702533"));
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
        /*------------------------------------------------------------hadi hapa------------------------------------------------------------>*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Kenya Police Divisional Head Quarters, Malaba Road, Eldoret"));
        final Intent det8intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Kenya+Police+Divisional+Head+Quarters,+Malaba+Rd,+Eldoret/@0.5185221,35.2734965,172m/data=!3m1!1e3!4m5!3m4!1s0x178101a6935d80e7:0xa3036bbf0ac283d0!8m2!3d0.5189699!4d35.2733839"));
        Button gb8 =  root.findViewById(R.id.gb8);
        Button det8= root.findViewById(R.id.det8);
        gb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent8);
            }
        });
        det8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det8intent);
            }
        });
        /*------------------------------------------------------------hadi hapa------------------------------------------------------------>*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Ministry of lands"));
        final Intent det3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Ministry+of+lands/@0.5199764,35.2645441,1579m/data=!3m1!1e3!4m8!1m2!2m1!1slands+eldoret!3m4!1s0x1781010a5a6ebda7:0xf5bc99713ec4a702!8m2!3d0.5243431!4d35.2767831"));

        Button gb3 = (Button) root.findViewById(R.id.gb3);
        Button det3= root.findViewById(R.id.det3);

        gb3.setOnClickListener(new View.OnClickListener() {

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
        final Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Department of Immigration, Oloo Street, Eldoret"));

        final Intent det4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Department+of+Immigration/@0.523399,35.2677655,15z/data=!3m1!4b1!4m5!3m4!1s0x1781010a30f68277:0xe78f079e6d2aecd!8m2!3d0.523399!4d35.2764988"));
        Button gb4 = (Button) root.findViewById(R.id.gb4);
        Button det4= root.findViewById(R.id.det4);

        gb4.setOnClickListener(new View.OnClickListener() {

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
        /*------------------------------------------------------------hadi hapa------------------------------------------------------------>*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Eldoret Law Courts, Eldoret"));
        final Intent det5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Eldoret+Law+Courts/@0.5183859,35.2679566,15z/data=!3m1!4b1!4m5!3m4!1s0x178101a15e024237:0x98e9e7670ce769d6!8m2!3d0.5183859!4d35.2766899"));
        Button gb5 = (Button) root.findViewById(R.id.gb5);
        Button det5= root.findViewById(R.id.det5);

        gb5.setOnClickListener(new View.OnClickListener() {

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
        /*------------------------------------------------------------hadi hapa------------------------------------------------------------>*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent6= new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Eldoret High Court"));
        final Intent det6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/high+court/@0.5184371,35.2723694,16z"));
        Button gb6 = (Button) root.findViewById(R.id.gb6);
        Button det6= root.findViewById(R.id.det6);

        gb6.setOnClickListener(new View.OnClickListener() {

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
        /*------------------------------------------------------------hadi hapa------------------------------------------------------------>*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent7= new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Kenya Power - Emergency Office"));
        final Intent det7intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Kenya+Power+-+Emergency+Office/@0.5385362,35.2756872,14z/data=!4m8!1m2!2m1!1skplc!3m4!1s0x178101a416be3b65:0xa01baad5ba760cb!8m2!3d0.5174433!4d35.2741592"));
        Button gb7 = (Button) root.findViewById(R.id.gb7);
        Button det7= root.findViewById(R.id.det7);

        gb7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent7);
            }
        });
        det7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det7intent);
            }
        });
        /*------------------------------------------------------------hadi hapa------------------------------------------------------------>*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Kenya Revenue Authority - North Rift Region Headquarters"));
        final Intent det2intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Kenya+Revenue+Authority+-+North+Rift+Region+Headquarters/@0.5199764,35.2683544,205m/data=!3m1!1e3!4m8!1m2!2m1!1skra!3m4!1s0x0:0x5949ba61b7c03219!8m2!3d0.5205881!4d35.2682644"));
        Button gb2 = (Button) root.findViewById(R.id.gb2);
        Button det2= root.findViewById(R.id.det2);

        gb2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent8);
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
        /* detail buttons     */





        return root;
    }
}
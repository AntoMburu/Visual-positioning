package com.NBT_Tech.visuapositioningbusinesslocator.ui.medicine;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.NBT_Tech.visuapositioningbusinesslocator.Details;
import com.NBT_Tech.visuapositioningbusinesslocator.MainActivity;
import com.NBT_Tech.visuapositioningbusinesslocator.R;

import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.government;
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.medicine;

public class medicineFragment extends Fragment {

    /*-------------------------------------------------copy modify------------------------------------------------------>*/



    /*-------------------------------------------------</copy modify------------------------------------------------------>*/
    private Object Det1,Det2,Det3,Det4,Det5,Det6,Det7,Det8,Det9,Det10,Det11,Det12;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(medicine, null);

        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Moi Teaching And Referral Hospital."));
        final Intent det1intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Moi+Teaching+And+Referral+Hospital/@0.5118812,35.2782001,15.25z/data=!4m8!1m2!2m1!1smedical!3m4!1s0x17810196205481ef:0xb2d614bfd81e3a3d!8m2!3d0.5116621!4d35.2804765"));
        Button gb1 =  root.findViewById(R.id.gb1);
        Button det1= root.findViewById(R.id.det1);
        gb1.setOnClickListener(new View.OnClickListener() {

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

        final Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=St. Luke's Orthopaedic & Trauma Hospital"));
        final Intent det2intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/St.+Luke's+Orthopaedic+%26+Trauma+Hospital/@0.5101363,35.283953,15z/data=!4m5!3m4!1s0x0:0xc57c64e3260998ee!8m2!3d0.5101363!4d35.283953"));
        Button gb2 = (Button) root.findViewById(R.id.gb2);
        Button det2= root.findViewById(R.id.det2);
        gb2.setOnClickListener(new View.OnClickListener() {

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
        final Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=6Avenue Healthcare Eldoret Clinic"));
        final Intent det3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Avenue+Healthcare+Eldoret+Clinic/@0.513984,35.2724495,15z/data=!4m8!1m2!2m1!1smedical!3m4!1s0x0:0x741e5ed8e80532b3!8m2!3d0.5142772!4d35.2697799"));

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
        final Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Fountain Healthcare"));

        final Intent det4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Fountain+Healthcare/@0.511161,35.2885523,17z/data=!3m1!4b1!4m8!1m2!2m1!1smedical!3m4!1s0x17810191e984ddff:0x30d4b67c2164b541!8m2!3d0.511161!4d35.290741"));
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

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Pioneer X-Ray & Scanning Services"));
        final Intent det5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Pioneer+X-Ray+%26+Scanning+Services/@0.515321,35.2726733,17z/data=!3m1!4b1!4m8!1m2!2m1!1smedical!3m4!1s0x0:0x41f7f249200a642a!8m2!3d0.515321!4d35.274862"));
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

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent6= new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Wareng Medical Services"));
        final Intent det6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Wareng+Medical+Services/@0.5177285,35.2716768,16.75z/data=!4m8!1m2!2m1!1smedical!3m4!1s0x0:0x5c2dbc17a4b8d2fe!8m2!3d0.5174246!4d35.2747822"));
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
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Bliss GVS Healthcare Eldoret"));
        final Intent det7intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bliss+GVS+Healthcare+Eldoret/@0.5182328,35.2857217,15.25z/data=!4m8!1m2!2m1!1smedical!3m4!1s0x0:0x9d5409c0056adbfb!8m2!3d0.5153286!4d35.2874985"));
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
        final Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=AAR Healthcare, Eldoret Clinic"));
        final Intent det8intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/AAR+Healthcare,+Eldoret+Clinic/@0.5167789,35.2718747,17z/data=!4m8!1m2!2m1!1smedical!3m4!1s0x0:0x6c123c4b52305598!8m2!3d0.5167789!4d35.2740633"));

        Button gb8 = (Button) root.findViewById(R.id.gb8);
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
        final Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=Cedar Clinical Associates"));

        final Intent det9intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cedar+Clinical+Associates/@0.5156138,35.2761749,17.75z/data=!4m8!1m2!2m1!1smedical!3m4!1s0x0:0x66464684efc88ff2!8m2!3d0.5148538!4d35.2787411"));
        Button gb9 = (Button) root.findViewById(R.id.gb9);
        Button det9= root.findViewById(R.id.det9);

        gb9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent9);
            }
        });
        det9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det9intent);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Fhok - Family Care Medical Centre"));
        final Intent det10intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Fhok+-+Family+Care+Medical+Centre-Eldoret/@0.5142373,35.2756454,18.25z/data=!4m8!1m2!2m1!1smedical!3m4!1s0x178101315d1c4601:0x884aa6fbc160e461!8m2!3d0.513896!4d35.277454"));
        Button gb10 = (Button) root.findViewById(R.id.gb10);
        Button det10= root.findViewById(R.id.det10);


        gb10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent10);

            }
        });
        det10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det10intent);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/



        return root;


    }
}
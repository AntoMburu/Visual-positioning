package com.NBT_Tech.visuapositioningbusinesslocator.ui.enter;

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

import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.enter;
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.insuarance;

public class enterFragment extends Fragment {

    /*-------------------------------------------------</copy modify------------------------------------------------------>*/

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(enter, null);

       /*<------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Fix Technologies\n"));
        final Intent det3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Fix+Technologies/@0.518062,35.2716218,18.25z/data=!4m8!1m2!2m1!1sphone+repair+service!3m4!1s0x0:0xed2fcd262311b104!8m2!3d0.5188327!4d35.2712316"));

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
        final Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=Goldentech Phone Repairs"));

        final Intent det4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Goldentech+Phone+Repairs/@0.518062,35.2716218,18.25z/data=!4m8!1m2!2m1!1sphone+repair+service!3m4!1s0x0:0xbc38ddab7e86ade5!8m2!3d0.5181672!4d35.2715226"));
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
        final Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Benner Phone Repair"));
        final Intent det5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Benner+Phone+Repair/@0.5163169,35.2753,18z/data=!4m8!1m2!2m1!1sphone+repair+service!3m4!1s0x0:0x7e81a5019734b95e!8m2!3d0.5164788!4d35.2770285"));
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
        final Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Vince Phone Solutions"));
        final Intent det6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Vince+Phone+Solutions/@0.5163907,35.2758447,17.5z/data=!4m8!1m2!2m1!1sphone+repair+service!3m4!1s0x0:0x71ba5b619cb8df13!8m2!3d0.5167196!4d35.2771351"));
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
        /*------------------------------------------------------------kuanzia hapa------------------kimongonyo botique 0.5169639,35.2735841-------------------------->*/

        final Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?f=d&daddr=Carlcare Service"));
        final Intent det7intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Carlcare+Service/@0.515415,35.2738481,17z/data=!3m1!4b1!4m8!1m2!2m1!1sphone+repair+service!3m4!1s0x0:0x2e9196a569c9d8fb!8m2!3d0.515415!4d35.2753957"));
        Button gb7 = (Button) root.findViewById(R.id.gb7);
        Button det7= root.findViewById(R.id.det7);
        gb7.setOnClickListener(new View.OnClickListener() {
            @Override
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
        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/


        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /* detail buttons     */

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/

        return root;
    }

}
package com.NBT_Tech.visuapositioningbusinesslocator.ui.eat;

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
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.government;
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.insuarance;

public class eatFragment extends Fragment {


    /*-------------------------------------------------copy modify------------------------------------------------------>*/
    private Object Det1,Det2,Det3,Det4,Det5,Det6,Det7,Det8,Det9,Det10,Det11,Det12,Det13,Det14,Det15,Det16,Det17;

    /*-------------------------------------------------</copy modify------------------------------------------------------>*/

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(eat, null);

        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=KFC Eldoret, Rupa place, Eldoret"));
        final Intent det1intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/KFC+Eldoret/@0.513839,35.2903826,19z/data=!4m8!1m2!2m1!1sRestaurants!3m4!1s0x0:0x3f6a5ec17f11767b!8m2!3d0.5140482!4d35.2906723"));
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

        final Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Java House, Eldoret-Malaba Rd, Eldoret"));
        final Intent det2intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Java+House/@0.5135268,35.2899859,19z/data=!4m8!1m2!2m1!1sRestaurants!3m4!1s0x0:0xb0b3582379b6154!8m2!3d0.5139377!4d35.2909914"));
        Button det2 = root.findViewById(R.id.det2);
        Button gb2 =  root.findViewById(R.id.gb2);
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
        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=The Well Irish Pub & Restaurant, Rupa's Mall, Nairobi Road, Box 207, Eldoret)"));
        final Intent det3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/The+Well+Irish+Pub+%26+Restaurant/@0.5139378,35.2904442,19z/data=!4m8!1m2!2m1!1sRestaurants!3m4!1s0x0:0x9b92f0a362e8ff78!8m2!3d0.5140874!4d35.2905968"));
        Button det3= root.findViewById(R.id.det3);

        Button gb3;
        gb3 =  root.findViewById(R.id.gb3);
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
        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=Zaika Lounge, Eldoret"));
        final Intent det4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Zaika+Lounge/@0.514134,35.2906992,17.5z/data=!4m8!1m2!2m1!1sRestaurants!3m4!1s0x0:0x70a0f458cc09da20!8m2!3d0.5148055!4d35.2908158"));
        Button det4= root.findViewById(R.id.det4);

        Button gb4 =  root.findViewById(R.id.gb4);
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

        final Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=UEAB, Better health Restaurant, Mumia street, Eldoret"));
        final Intent det5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/UEAB+Better+Health/@0.5139096,35.2833392,16.5z/data=!4m8!1m2!2m1!1sRestaurants!3m4!1s0x0:0x5209c7692fbf335a!8m2!3d0.5152454!4d35.2818793"));
        Button det5= root.findViewById(R.id.det5);
        det5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det5intent);
            }
        });
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

        final Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Maggies Restaurant, Eldoret"));
        Button gb6 =  root.findViewById(R.id.gb6);
        final Intent det6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Maggies+Restaurant/@0.5151931,35.2711105,16z/data=!4m8!1m2!2m1!1sRestaurants!3m4!1s0x178101a35e25fda1:0x77c4498a6089c3db!8m2!3d0.5151931!4d35.2754879"));
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

        final Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?f=d&daddr=Klique Restaurant, Eldoret"));
        Button gb7 =  root.findViewById(R.id.gb7);
        final Intent det7intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Klique+Restaurant/@0.5162038,35.272981,17z/data=!4m8!1m2!2m1!1sRestaurants!3m4!1s0x0:0x23f163a4fe5c899b!8m2!3d0.51708!4d35.2762198"));
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
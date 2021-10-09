package com.NBT_Tech.visuapositioningbusinesslocator.ui.superm;

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
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.insuarance;
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.medicine;
import static com.NBT_Tech.visuapositioningbusinesslocator.R.layout.superm;

public class superFragment extends Fragment {
    /*-------------------------------------------------copy modify------------------------------------------------------>*/
    private Object Det1,Det2,Det3,Det4,Det5,Det6,Det7,Det8,Det9,Det10,Det11,Det12,Det13,Det14;

    /*-------------------------------------------------</copy modify------------------------------------------------------>*/

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(superm, null);

       /*<------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Naivas Supermarket Eldoret"));
        final Intent det3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Naivas+Supermarket+Eldoret/@0.5142916,35.2755428,17z/data=!3m1!4b1!4m10!1m2!2m1!1ssupermarket!3m6!1s0x0:0x41fc5432473a4581!8m2!3d0.5142919!4d35.2773833!9m1!1b1"));

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
        final Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=0.517334, 35.272719"));

        final Intent det4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Naivas+Supermarket+Eldoret/@0.5142916,35.2755428,17z/data=!3m1!4b1!4m10!1m2!2m1!1ssupermarket!3m6!1s0x0:0x41fc5432473a4581!8m2!3d0.5142919!4d35.2773833!9m1!1b1"));
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
        final Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Transmatt Supermarket"));
        final Intent det5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Transmatt+Supermarket/@0.5158472,35.2747704,17z/data=!4m8!1m2!2m1!1ssupermarket!3m4!1s0x0:0x87ad2e1c2de61384!8m2!3d0.5159729!4d35.2747037"));
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
        final Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Khetia's Supermarket"));
        final Intent det6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Khetia+Supermarket+Ltd/@0.5158472,35.2747704,17z/data=!4m8!1m2!2m1!1ssupermarket!3m4!1s0x0:0x81d3b68e055cf2a!8m2!3d0.5150999!4d35.2770352"));
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

        final Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?f=d&daddr=Rupa's Mall"));
        final Intent det7intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Chandarana+Foodplus/@0.5141602,35.2906222,19z/data=!4m8!1m2!2m1!1ssupermarket!3m4!1s0x1781019aa5a853f1:0x81bff41f9f8c3911!8m2!3d0.5144991!4d35.290919"));
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
        final Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Yako Supermarket"));
        final Intent det8intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Yako+Supermarket/@0.5170354,35.2750347,17.5z/data=!4m8!1m2!2m1!1ssupermarket!3m4!1s0x0:0x754a83495d3230c4!8m2!3d0.5169693!4d35.2763372"));

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
        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/
        final Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Eldomatt Supermarket - Hyper Branch"));

        final Intent det9intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Eldomatt+Supermarket+-+Hyper+Branch/@0.5170354,35.2750347,17.5z/data=!4m8!1m2!2m1!1ssupermarket!3m4!1s0x0:0xce319014fc4471cf!8m2!3d0.5175969!4d35.2741961"));
        Button gb9 = (Button) root.findViewById(R.id.gb9);
        Button det9= root.findViewById(R.id.det9);

        gb9.setOnClickListener(new View.OnClickListener() {
            @Override
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
        final Intent intent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Uchumi Supermarket, Muliro Rd, Eldoret"));
        final Intent det10intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Uchumi+Supermarket/@0.5193073,35.2724655,18z/data=!4m8!1m2!2m1!1ssupermarket!3m4!1s0x0:0xa0d865f6c0902f85!8m2!3d0.5200028!4d35.2726116"));
        Button gb10 = (Button) root.findViewById(R.id.gb10);
        Button det10= root.findViewById(R.id.det10);


        gb10.setOnClickListener(new View.OnClickListener() {
            @Override
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
       /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent12 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Eldo Raiya Supermarket"));
        final Intent det12intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Fhok+-+Family+Care+Medical+Centre-Eldoret/@0.5142373,35.2756454,18.25z/data=!4m8!1m2!2m1!1smedical!3m4!1s0x178101315d1c4601:0x884aa6fbc160e461!8m2!3d0.513896!4d35.277454"));
        Button gb12 =  root.findViewById(R.id.gb12);
        Button det12= root.findViewById(R.id.det12);
        gb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent12);
            }
        });
        det12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det12intent);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent13 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Eldoret Mattresses Ltd, Off Oloo Street, Kenyatta St, Eldoret"));
        final Intent det13intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Fhok+-+Family+Care+Medical+Centre-Eldoret/@0.5142373,35.2756454,18.25z/data=!4m8!1m2!2m1!1smedical!3m4!1s0x178101315d1c4601:0x884aa6fbc160e461!8m2!3d0.513896!4d35.277454"));
        Button gb13 =  root.findViewById(R.id.gb13);
        Button det13= root.findViewById(R.id.det13);
        gb13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent13);
            }
        });
        det13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det13intent);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /*------------------------------------------------------------kuanzia hapa-------------------------------------------->*/

        final Intent intent14 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=Ukwala Supermarket Uganda Road, Eldoret"));
        final Intent det14intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        Button gb14=  root.findViewById(R.id.gb14);
        Button det14= root.findViewById(R.id.det14);
        gb14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(intent14);
            }
        });
        det14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OPENING MAP", Toast.LENGTH_SHORT).show();
                startActivity(det14intent);
            }
        });

        /*------------------------------------------------------------hadi hapa-------------------------------------------->*/
        /* detail buttons     */





        return root;
    }
}
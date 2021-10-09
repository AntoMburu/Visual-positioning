package com.NBT_Tech.visuapositioningbusinesslocator;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.NBT_Tech.visuapositioningbusinesslocator.ui.alllocs;
import com.google.android.material.navigation.NavigationView;

import static android.app.PendingIntent.getActivity;

public class Home extends AppCompatActivity
     implements       NavigationView.OnNavigationItemSelectedListener
{
    /*  View View;
      Fragment government;
      FragmentManager fragmentManager=getFragmentManager();
      FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();


     */
    private AppBarConfiguration mAppBarConfiguration;
    private Object governmentFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

       // navigationView.setNavigationItemSelectedListener(this);

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.GOV, R.id.MED, R.id.EDU, R.id.BEAUTY, R.id.CLOTH, R.id.elec, R.id.hware, R.id.agrov,
                R.id.INSURANCE, R.id.allLoc, R.id.BEAUTY, R.id.ENT, R.id.eat, R.id.SUPER, R.id.HOME
                , R.id.repair,R.id.contact)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);


        return true;
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                Intent intentt = new Intent(Intent.ACTION_SEND);

                intentt.setType("text/plain");
                String shareBody=("Check out this app");
                String shareSub=("Visual Business Locator");
                intentt.putExtra(Intent.EXTRA_TEXT,shareBody);
                intentt.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                intentt.putExtra(Intent.EXTRA_COMPONENT_NAME,"this is my app");
                startActivity(Intent.createChooser(intentt,"share via"));
                break;
           /* case R.id.contactus:
                Toast.makeText(this,"contact us on",Toast.LENGTH_SHORT).show();
                break;

            */
            case R.id.sign:
                Intent intent = new Intent(Home.this, LoginActivity.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }



    public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
        if (Item.getItemId() == R.id.allLoc) {
            Intent intent = new Intent(Home.this, alllocs.class);
            startActivity(intent);
        }
        return true;
    }


}

/*
 if (Item.getItemId() == R.id.allLoc) {
            Intent intent = new Intent(Home.this, MainActivity.class);
            startActivity(intent);
        }
 */
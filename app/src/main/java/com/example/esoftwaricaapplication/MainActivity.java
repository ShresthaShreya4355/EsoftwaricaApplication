package com.example.esoftwaricaapplication;

import android.os.Bundle;

import com.example.esoftwaricaapplication.ui.dashboard.DashboardFragment;
import com.example.esoftwaricaapplication.ui.dashboard.Student;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DashboardFragment.students.add(new Student("20","Jeenifer","Boudha","Female"));
        DashboardFragment.students.add(new Student("19","Chandler","Kathmandu","Male"));
        DashboardFragment.students.add(new Student("20","Saroj","Australia","Others"));

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}

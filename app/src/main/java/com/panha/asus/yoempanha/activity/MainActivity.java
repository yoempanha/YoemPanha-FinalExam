package com.panha.asus.yoempanha.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.panha.asus.yoempanha.R;
import com.panha.asus.yoempanha.fragment.AccountFragment;
import com.panha.asus.yoempanha.fragment.CategoriesFragment;
import com.panha.asus.yoempanha.fragment.HomeFragment;
import com.panha.asus.yoempanha.fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initElement();
        navigationView.setOnNavigationItemSelectedListener(navListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectFragment = null;
            switch (menuItem.getItemId()) {
                case R.id.homeFragment:
                    selectFragment = new HomeFragment();
                    break;
                case R.id.categoriesFragment:
                    selectFragment = new CategoriesFragment();
                    break;
                case R.id.searchFragment:
                    selectFragment = new SearchFragment();
                    break;
                case R.id.accountFragment:
                    selectFragment = new AccountFragment();
                    break;
            }
            if (selectFragment != null) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction.replace(R.id.fragmentContainer,selectFragment);
                transaction.commit();
            }
            return true;
        }
    };

    private void initElement() {
        navigationView = findViewById(R.id.homeBottomNavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new HomeFragment()).commit();
    }
}

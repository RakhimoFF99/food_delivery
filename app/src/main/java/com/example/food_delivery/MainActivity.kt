package com.example.food_delivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.food_delivery.databinding.ActivityMainBinding
import com.example.food_delivery.fragments.AccountFragment
import com.example.food_delivery.fragments.HomeFragment
import com.example.food_delivery.fragments.SearchFragment
import com.example.food_delivery.fragments.ShoppingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
        supportActionBar?.hide();


        val homeFragment = HomeFragment()
        val searchFragment = SearchFragment()
        val shoppingFragment  = ShoppingFragment()
        val accountFragment = AccountFragment()

        makeCurrentFragment (homeFragment)


        binding.bottomNavigation.setOnItemSelectedListener   {

            when(it.itemId) {
                R.id.ic_home -> {
                    makeCurrentFragment(homeFragment)
                    return@setOnItemSelectedListener true
                }

                R.id.ic_search -> {
                    makeCurrentFragment(searchFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.ic_bag -> {
                    makeCurrentFragment(shoppingFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.ic_person -> {
                    makeCurrentFragment(accountFragment)
                    return@setOnItemSelectedListener true
                }
            }
            false

        }
    }

    private  fun makeCurrentFragment (fragment: Fragment) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_wrapper,fragment)
                commit();
            }
    }
}
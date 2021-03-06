package app.tuancuong.com.tuancuong.MenuWeb;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import app.tuancuong.com.tuancuong.Adapter.MenuWeb.MenuWebAdapter;
import app.tuancuong.com.tuancuong.R;

public class MenuWeb extends AppCompatActivity{
    private Toolbar toolbar;
    private TabLayout tablayout;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_web);

        getWidGetFunction();
    }

    private void getWidGetFunction() {
        //addcontrols
        toolbar   = findViewById(R.id.toolbar);
        tablayout = findViewById(R.id.tablayout);
        viewpager = findViewById(R.id.viewpager);
        initViewPager();
    }

    private void initViewPager() {
        tablayout.setupWithViewPager(viewpager);
        MenuWebAdapter menuWebAdapter = new MenuWebAdapter(getSupportFragmentManager(), this);
        viewpager.setAdapter(menuWebAdapter);
    }

}

package br.poa.sprenger.brincation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import br.poa.sprenger.brincation.ui.bichos.BichosFragment;
import br.poa.sprenger.brincation.ui.numeros.NumerosFragment;
import br.poa.sprenger.brincation.ui.vogais.VogaisFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadConfigs();
    }

    private void loadConfigs(){
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add(R.string.aba_title_bichos, BichosFragment.class)
                .add(R.string.aba_title_numeros, NumerosFragment.class)
                .add(R.string.aba_title_vogais, VogaisFragment.class)
                .create());

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = findViewById(R.id.viewPageTab);
        viewPagerTab.setViewPager(viewPager);

        getSupportActionBar().setElevation(0);
    }
}
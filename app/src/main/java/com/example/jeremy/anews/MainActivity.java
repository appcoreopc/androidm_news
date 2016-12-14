package com.example.jeremy.anews;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.GetChars;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.example.jeremy.anews.adapter.News;
import com.example.jeremy.anews.adapter.NewsDataAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements
        Profile.OnFragmentInteractionListener, GetStarted.OnFragmentInteractionListener, NewsFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /*RecyclerView recyclerView;
    NewsDataAdapter adapter;
*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            loadFragment(NewsFragment.newInstance("", ""));

/*
            createDummyNews();
            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            adapter = new NewsDataAdapter(news);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
*/

        }
        else if (id == R.id.action_user) {
            loadFragment(Profile.newInstance("", ""));
        }
        else if (id == R.id.action_search) {
            loadFragment(GetStarted.newInstance("", ""));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private void loadFragment(Fragment fragment)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, fragment).commit();
    }


    List<News> news = new ArrayList();

    private void createDummyNews()
    {
        news.add(new News("Why Trump's State pick is so controversial", "Boosters of Donald Trump's candidate to be the next secretary of state talk about his experience leading one of the world's largest companies -- and so do his detractors.\n" +
                "\n" +
                "Fans of ExxonMobil CEO Rex Tillerson say running a global energy company equips the 64-year-old with the management tools needed to represent the US abroad. Skeptics say a closer look at that experience raises questions about conflicts of interest and whether the nominee would put US or corporate interests first.", ""));
        news.add(new News("Kanye West goes to Trump Tower", "The lobby of Trump Tower rolled out the figurative red carpet Tuesday as President-elect Donald Trump welcomed a celebrity guest list for meetings as he prepares to take office.\n" +
                "\n" +
                "The parade of big names past the assembled press, gawking passers-by and tourists included rapper Kanye West, football legends Jim Brown and Ray Lewis, Trump backer and reality TV star Omarosa Manigault and billionaire philanthropist Bill Gates.", ""));
        news.add(new News("Governor cries on blasphemy trial first day","On trial for blasphemy, Jakarta's embattled governor Basuki Tjahaja Purnama, popularly called Ahok, gave emotional testimony to a packed courtroom on Tuesday.\n" +
                "\n" +
                "Ahok, an ethnic Chinese Christian, has been accused of insulting Islam after he quoted a verse from the Quran in a November speech. Hardline Islamists say he shouldn't administer a Muslim-majority city.", ""));
        news.add(new News("Protests erupt over 20-year austerity plan", "Fierce protests erupted in 15 Brazilian cities Tuesday as the country's Senate approved a controversial 20-year austerity plan.\n" +
                "\n" +
                "Known as PEC 55, the constitutional amendment imposes a cap on public spending that will limit federal investment in social programs for the next 20 years.", ""));
        news.add(new News("Report: Military set fire to towns in Myanmar", "", ""));
        news.add(new News("Trump rewrites US foreign policy", "", ""));
        news.add(new News("Gates, Rice pushed for ExxonMobil exec", "", ""));
    }
}

package com.example.imageslider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14,card15,card16,card17,card18;
    ViewPager viewPager;
    Timer timer;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewpager);

        List<Integer> imageList= new ArrayList<>();
        imageList.add(R.drawable.one);
        imageList.add(R.drawable.two);
        imageList.add(R.drawable.three);
        imageList.add(R.drawable.four);
        imageList.add(R.drawable.five);

        MyAdapter myAdapter=new MyAdapter(imageList);
        viewPager.setAdapter(myAdapter);
        handler=new Handler();
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        int i = viewPager.getCurrentItem();

                        if (i == imageList.size() - 1)
                        {
                            i=0;
                            viewPager.setCurrentItem(i,true);
                        }
                        else
                        {
                            i++;
                            viewPager.setCurrentItem(i,true);
                        }


                    }
                });

            }
        },4000,4000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.home_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.location:
            Toast.makeText(getApplicationContext(),"LOCATION",Toast.LENGTH_SHORT).show();
            break;
            case R.id.profile:
                Toast.makeText(getApplicationContext(),"PROFILE",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rating:
                Toast.makeText(getApplicationContext(),"RATE THIS APP",Toast.LENGTH_SHORT).show();
                break;



            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        card1=(CardView)findViewById(R.id.c1);
        card2=(CardView)findViewById(R.id.c2);
        card3=(CardView)findViewById(R.id.c3);
        card4=(CardView)findViewById(R.id.c4);
        card5=(CardView)findViewById(R.id.c5);
        card6=(CardView)findViewById(R.id.c6);
        card7=(CardView)findViewById(R.id.c7);
        card8=(CardView)findViewById(R.id.c8);
        card9=(CardView)findViewById(R.id.c9);
        card10=(CardView)findViewById(R.id.c10);
        card11=(CardView)findViewById(R.id.c11);
        card12=(CardView)findViewById(R.id.c12);
        card13=(CardView)findViewById(R.id.c13);
        card14=(CardView)findViewById(R.id.c14);
        card15=(CardView)findViewById(R.id.c15);
        card16=(CardView)findViewById(R.id.c16);
        card17=(CardView)findViewById(R.id.c17);
        card18=(CardView)findViewById(R.id.c18);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);
        card11.setOnClickListener(this);
        card12.setOnClickListener(this);
        card13.setOnClickListener(this);
        card14.setOnClickListener(this);
        card15.setOnClickListener(this);
        card16.setOnClickListener(this);
        card17.setOnClickListener(this);
        card18.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){
            case R.id.c1:
                i=new Intent(this,one.class);
                startActivity(i);
                break;

            case R.id.c2:
                i=new Intent(this,two.class);
                startActivity(i);
                break;

            case R.id.c3:
                i=new Intent(this,three.class);
                startActivity(i);
                break;

            case R.id.c4:
                i=new Intent(this,four.class);
                startActivity(i);
                break;

            case R.id.c5:
                i=new Intent(this,five.class);
                startActivity(i);
                break;

            case R.id.c6:
                i=new Intent(this,six.class);
                startActivity(i);
                break;

            case R.id.c7:
                i=new Intent(this,seven.class);
                startActivity(i);
                break;

            case R.id.c8:
                i=new Intent(this,eight.class);
                startActivity(i);
                break;

            case R.id.c9:
                i=new Intent(this,nine.class);
                startActivity(i);
                break;

            case R.id.c10:
                i=new Intent(this,ten.class);
                startActivity(i);
                break;

            case R.id.c11:
                i=new Intent(this,eleven.class);
                startActivity(i);
                break;

            case R.id.c12:
                i=new Intent(this,twelve.class);
                startActivity(i);
                break;

            case R.id.c13:
                i=new Intent(this,tharteen.class);
                startActivity(i);
                break;

            case R.id.c14:
                i=new Intent(this,fourteen.class);
                startActivity(i);
                break;

            case R.id.c15:
                i=new Intent(this,fifteen.class);
                startActivity(i);
                break;

            case R.id.c16:
                i=new Intent(this,sixteen.class);
                startActivity(i);
                break;

            case R.id.c17:
                i=new Intent(this,seventeen.class);
                startActivity(i);
                break;

            case R.id.c18:
                i=new Intent(this,eightenn.class);
                startActivity(i);
                break;

        }

    }

}
package com.example.aditya.coins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onecoin(View view)
    {
        toaster(150);
    }
    public void twocoin(View view)
    {
        toaster(480);
    }
    public void threecoin(View view)
    {
        toaster(1100);
    }
    public void fourcoin(View view)
    {
        toaster(2400);
    }
    public void fivecoin(View view)
    {
        toaster(5000);
    }
    public void toaster(int noc)
    {
        Toast toast = Toast.makeText(this,"Coins:"+noc,Toast.LENGTH_SHORT);
        toast.show();
    }
}

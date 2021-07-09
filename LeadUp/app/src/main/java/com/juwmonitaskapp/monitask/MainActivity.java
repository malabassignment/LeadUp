package com.LeadUp.LeadUp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread td= new Thread(){
            public void run()
            {
                try {
                    sleep(3000);

                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }

                finally {
                    Intent t= new Intent(MainActivity.this,Register.class);
                    startActivity(t);
                }
            }
        }; td.start();

    }

}
package c.usmanrasool.tns;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splashscreen extends Activity{
    private static int SPLASH_TIMER = 2200;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splashscreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIMER);
    }
}

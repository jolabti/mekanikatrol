package com.ayubella.mekanikakatrol;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Splash extends Activity {
    private static int progress = 0;
    private int status = 0;
    ProgressBar progressBar;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        new Thread(new Runnable() {
            public void run() {
                while (status < 100) {
                    status = loading();
                    handler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress(status);
                        }
                    });
                }
                handler.post(new Runnable() {
                    public void run() {
                        Intent pindah = new Intent(Splash.this,
                                MainActivity.class);
                        startActivity(pindah);
                        finish();
                    }
                });
            }

            public int loading() {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                return ++progress;
            }
        }).start();


        //     Thread timerThread = new Thread(){
        //       public void run(){
        //          try{
        //              sleep(3000);
        //          }catch(InterruptedException e){
        //              e.printStackTrace();
        //         }finally{
        //             Intent intent = new Intent(Splash.this,MainActivity.class);
        //            startActivity(intent);
        //       }
        //   }
        //  };
        //  timerThread.start();


    }
}
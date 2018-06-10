package padphone.launchmodetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * MacinActivity为singleInstance,singleTask时的日志
     * 06-06 09:27:57.915 1976-1976/padphone.launchmodetest I/System.out: mainactivity oncreate
     * 06-06 09:27:57.917 1976-1976/padphone.launchmodetest I/System.out: mainactivity onstart
     * 06-06 09:27:57.917 1976-1976/padphone.launchmodetest I/System.out: mainactivity onresume
     * 06-06 09:28:32.837 1976-1976/padphone.launchmodetest I/System.out: mainactivity onpause
     * 06-06 09:28:34.337 1976-1976/padphone.launchmodetest I/System.out: mainactivity onstop
     * 06-06 09:28:41.121 1976-1976/padphone.launchmodetest I/System.out: mainactivity onnewintent
     * 06-06 09:28:41.123 1976-1976/padphone.launchmodetest I/System.out: mainactivity onstart
     * 06-06 09:28:41.123 1976-1976/padphone.launchmodetest I/System.out: mainactivity onresume
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("mainactivity oncreate");
        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setText(getTaskId() + "======taskId" + "===time==" + System.currentTimeMillis());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Activity2.class));
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("mainactivity onresume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("mainactivity onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("mainactivity onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("mainactivity onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("mainactivity ondestroy");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        System.out.println("mainactivity onnewintent");
    }
}

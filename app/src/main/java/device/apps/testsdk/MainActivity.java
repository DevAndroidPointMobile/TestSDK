package device.apps.testsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import device.sdk.Control;
import device.sdk.Information;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            Information information = Information.getInstance();
            String version = information.getAndroidImageVersion();
            TextView tv = (TextView)findViewById(R.id.text_version);
            tv.setText(version);
        }catch(Exception e)
        {
            e.printStackTrace();
        }


    }
}
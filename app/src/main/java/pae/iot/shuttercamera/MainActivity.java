package pae.iot.shuttercamera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init OpenCV
        if (BuildConfig.DEBUG) {
            OpenCVLoader.initDebug();
        }


    }
}

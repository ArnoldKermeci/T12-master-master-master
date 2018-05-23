package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.model.Jelo;

public class SecondActivity extends Activity {
    private int position=0;
    private Jelo[] jelos= new Jelo[]{
   //     new Jelo ("sarma.jpg", "sarma", "meso u kupusu", "0", "meso + kupus", "500","400");
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStart()", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onRestart()", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onPause()", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStop()", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void btnOpenCameraClicked(View view) {
        final int REQUEST_IMAGE_CAPTURE = 1;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }
}

package comc.example.mohammedmorse.uilearn;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comc.example.mohammedmorse.uilearn.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

    }
}

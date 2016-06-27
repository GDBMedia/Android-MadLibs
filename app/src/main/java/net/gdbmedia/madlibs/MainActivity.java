package net.gdbmedia.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.input1) EditText mEditText1;
    @Bind(R.id.input2) EditText mEditText2;
    @Bind(R.id.input3) EditText mEditText3;
    @Bind(R.id.input4) EditText mEditText4;
    @Bind(R.id.input5) EditText mEditText5;
    @Bind(R.id.input6) EditText mEditText6;
    @Bind(R.id.input7) EditText mEditText7;
    @Bind(R.id.input8) EditText mEditText8;
    @Bind(R.id.input9) EditText mEditText9;
    @Bind(R.id.title) TextView mTitleTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface indieFlower = Typeface.createFromAsset(getAssets(), "fonts/IndieFlower.ttf");

        mTitleTextView.setTypeface(indieFlower);
    }
    public void click(View view){




        String [] inputs = {mEditText1.getText().toString(), mEditText2.getText().toString(),  mEditText3.getText().toString(), mEditText4.getText().toString(), mEditText5.getText().toString(), mEditText6.getText().toString(), mEditText7.getText().toString(), mEditText8.getText().toString(), mEditText9.getText().toString()};
        if(Arrays.asList(inputs).contains("")){
            Toast.makeText(MainActivity.this, "You must fill out Every Input", Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(MainActivity.this, MadLib.class);
            intent.putExtra("inputs", inputs);
            startActivity(intent);
        }

    }
}

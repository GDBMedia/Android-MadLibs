package net.gdbmedia.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MadLib extends AppCompatActivity {
    @Bind(R.id.outputTextView) TextView mOutputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);
        Intent intent = getIntent();
        ButterKnife.bind(this);

        String[] inputs = intent.getStringArrayExtra("inputs");
        Typeface indieFlower = Typeface.createFromAsset(getAssets(), "fonts/IndieFlower.ttf");

        mOutputTextView.setTypeface(indieFlower);

        String output = "Double Dagger is playing in " + inputs[0] + " on " + inputs[1] + " at a really cool spot called " + inputs[2] + ". They're playing with " + inputs[3] + " and " + inputs[4] + ", but not with " + inputs[5] + " unfortunately. I think that this show will be really " + inputs[6] + "! I hear that there will be " + inputs[7] + " girls and " + inputs[8] +  "guys there." ;

        mOutputTextView.setText(output);

    }
}

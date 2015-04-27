package com.github.yoojia.keyboard.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.yoojia.keyboard.CoolNumberKeyboard;
import com.github.yoojia.keyboard.OnNumberCommitListener;
import com.github.yoojia.keyboard.app.R;

public class MainActivity extends ActionBarActivity {

    private CoolNumberKeyboard mKeyboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mKeyboard = new CoolNumberKeyboard(this);

        Button button = (Button) findViewById(R.id.show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mKeyboard.show(MainActivity.this,null,new OnNumberCommitListener() {
                    @Override
                    public void onCommit(String number) {
                        Toast.makeText(MainActivity.this,number, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

}
package com.example.a5alumno.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener, ActionMode.Callback{

    private ActionMode mActionMode;
    private static final String TAG_SECOND_ACTIVITY = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        return false;
    }

    @Override
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return false;
    }

    @Override
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        return false;
    }

    @Override
    public void onDestroyActionMode(ActionMode mode) {

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onLongClick(View view) {
        boolean click = false;
        if (view.getId() == R.id.imageViewIcon) {
            Log.i(SecondActivity.TAG_SECOND_ACTIVITY, "ImageView long-clicked");
            // if ActionMode is null "not started"
            if (mActionMode != null) {
                click = false;
            // Start the CAB
            }else {
                this.mActionMode = this.startSupportActionMode(this);
                view.setSelected(true);
                click = true;
            }
        }
        return click;
    }
}

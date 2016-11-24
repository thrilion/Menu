package com.example.a5alumno.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater = this.getMenuInflater();
        mMenuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.copyItem:
                Toast.makeText(this,"Copy Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cutItem:
                Toast.makeText(this,"Cut Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pasteItem:
                Toast.makeText(this,"Paste Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.searchItem:
                Toast.makeText(this,"Search Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.compareItem:
                Toast.makeText(this,"Compare Item", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

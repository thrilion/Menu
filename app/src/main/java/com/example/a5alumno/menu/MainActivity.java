package com.example.a5alumno.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ActionMode.Callback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        this.registerForContextMenu(image);
    }

    /*
     * MENU
     */

    // Definición de la vista del menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater = this.getMenuInflater();
        mMenuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // Definición de las acciones al clicar un elemento del menu
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

    /*
     * CONTEXT MENU
     */

    // Definición de la vista del context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater mContMenuInflater = this.getMenuInflater();
        mContMenuInflater.inflate(R.menu.main_menu, menu);
    }

    // Definición de las acciones al clicar un elemento del context menu
    @Override
    public boolean onContextItemSelected(MenuItem item) {
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
        return super.onContextItemSelected(item);
    }

    /*
     * CONTEXTUAL ACTION MENU
     */

    // Definición de la vista del context menu
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
}

package com.acadgild.siddharth.contextmenuthroughxml94;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mb;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mb = (Button)findViewById(R.id.button);

          // Register the context menu with BUTTON object mb
          registerForContextMenu(mb);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        //Set header to the context menu

        menu.setHeaderTitle("Made by XML");


        if(v.getId() == R.id.button)
        {
            getMenuInflater().inflate(R.menu.menuu,menu);
        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        // Actions which are to be performed on the click on menu

        if(item.getItemId()==R.id.actionone)
        {
            Toast.makeText(getApplicationContext(),"Action 1 Performed",Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.actiontwo)
        {
            Toast.makeText(getApplicationContext(),"Action 2 Performed",Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.actionthree)
        {
            Toast.makeText(getApplicationContext(),"Action 3 Performed",Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }
}

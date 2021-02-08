
package com.example.actionbarapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import static com.example.actionbarapplication.R.menu.main_activity_actions;

/**
 * @copyright : p
 * <p>
 * create time:2021/2/7
 * <p>
 * author:pyz
 */

public class MainActivity extends AppCompatActivity {
    int pyz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(main_activity_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSetting();
                return true;
            case R.id.action_test:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSetting() {
    }

    private void openSearch() {
    }
}
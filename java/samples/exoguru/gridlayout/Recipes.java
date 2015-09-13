package samples.exoguru.gridlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Recipes extends ActionBarActivity {
    private Button GroceryList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        GroceryList = (Button)findViewById(R.id.button);


        GroceryList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startStory();
            }
        });
    }


    private void startStory() {
        Intent myIntent = new Intent(Recipes.this, MainActivity.class);
        startActivity(myIntent);
    }


}

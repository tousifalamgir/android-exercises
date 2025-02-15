package ca.mohawk.exploringlayouts;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        setContentView(R.layout.main_menu);
    }

    public void loadConstraintLayout(View v) {
        setContentView(R.layout.activity_main);
    }

    public void loadTableLayout(View v) {
        setContentView(R.layout.my_table_layout);
    }
    public void loadMenuLayout(View v) {
        setContentView(R.layout.main_menu);
    }
    public void loadAttr1Layout(View v) {
        setContentView(R.layout.attributes);
    }
    public void loadAttr2Layout(View v) {
        setContentView(R.layout.attributes2);
    }
}
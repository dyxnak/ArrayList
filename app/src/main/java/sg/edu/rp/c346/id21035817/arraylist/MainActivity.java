package sg.edu.rp.c346.id21035817.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("ArrayList");

        fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // b
        fruits.add(3,"durian");

        // d
        fruits.remove(0);

        // e
        fruits.set(fruits.size()-1, "dragon fruit");

        tv = findViewById(R.id.textView);

        String text = "Fruits\n";
        text += "=====\n";

        for (int i = 0; i < fruits.size(); i++) {
            text += fruits.get(i) + "\n";

            // c
            String theFruit = fruits.get(i);
        }

        tv.setText(text);
    }
}
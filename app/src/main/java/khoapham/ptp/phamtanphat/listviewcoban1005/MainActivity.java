package khoapham.ptp.phamtanphat.listviewcoban1005;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter banve;
    ArrayList<String> mangmonhoc = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1 : Tao ra 1 listview
        lv = findViewById(R.id.listview);
        //2 : Tao ra 1 ban ve

        mangmonhoc.add("Toan");
        mangmonhoc.add("Ly");
        mangmonhoc.add("Hoa");
        mangmonhoc.add("Sinh");
        mangmonhoc.add("Su");
        mangmonhoc.add("Dia");

        banve = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangmonhoc);
        //3 : Gan ban ve vao listview
        lv.setAdapter(banve);

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                mangmonhoc.remove(position);
                banve.notifyDataSetChanged();
                return true;
            }
        });
    }

}

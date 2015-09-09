package unicauca.movil.viewsseleccionables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView list;
    TextView txt;
    String data[];
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        txt = (TextView) findViewById(R.id.txt);

        data = getResources().getStringArray(R.array.juegos);

        list.setOnItemClickListener(this);

        //Adapter BAsico
        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        //Adapter con Template
        adapter = new ArrayAdapter<String>(this, R.layout.template_item, R.id.name, data);

        list.setAdapter(adapter);



    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        txt.setText(data[i]);
    }
}

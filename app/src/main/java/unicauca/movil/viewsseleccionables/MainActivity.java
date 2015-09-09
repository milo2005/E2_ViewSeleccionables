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

import java.util.ArrayList;
import java.util.List;

import unicauca.movil.viewsseleccionables.adapters.GameAdapter;
import unicauca.movil.viewsseleccionables.models.Game;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView list;
    TextView txt;
   // String data[];
    //ArrayAdapter<String> adapter;

    List<Game> data;
    GameAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        txt = (TextView) findViewById(R.id.txt);
        list.setOnItemClickListener(this);

        //data = getResources().getStringArray(R.array.juegos);
        //Adapter BAsico
        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        //Adapter con Template
        //adapter = new ArrayAdapter<String>(this, R.layout.template_item, R.id.name, data);


        data = new ArrayList<>();
        adapter = new GameAdapter(this,data);

        list.setAdapter(adapter);

        loadData();

    }

    private void loadData() {
        String games[] = getResources().getStringArray(R.array.juegos_completo);
        for(int i =0; i<games.length;i++){

            String game[] = games[i].split(",");

            Game g = new Game();
            g.setName(game[0]);
            g.setGenere(game[1]);
            g.setScore(Float.parseFloat(game[2]));
            g.setImgUrl(game[3]);

            data.add(g);
        }

        adapter.notifyDataSetChanged();

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //txt.setText(data[i]);
        txt.setText(data.get(i).getName());
    }
}

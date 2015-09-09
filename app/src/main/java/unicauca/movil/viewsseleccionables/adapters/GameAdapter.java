package unicauca.movil.viewsseleccionables.adapters;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import unicauca.movil.viewsseleccionables.R;
import unicauca.movil.viewsseleccionables.models.Game;

/**
 * Created by Dario Chamorro on 9/09/2015.
 */
public class GameAdapter extends BaseAdapter {

    Context context;
    List<Game> data;

    public GameAdapter(Context context, List<Game> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = null;

        if(view == null){
            v = View.inflate(context, R.layout.template_game,null);
        }else{
            v = view;
        }

        Game g = (Game) getItem(i);

        TextView txt = (TextView) v.findViewById(R.id.title);
        txt.setText(g.getName());

        txt = (TextView) v.findViewById(R.id.txt_genere);
        txt.setText(g.getGenere());

        txt = (TextView) v.findViewById(R.id.txt_start);
        txt.setText(g.getScore()+"");

        ImageView img = (ImageView) v.findViewById(R.id.img);

        Picasso.with(context)
                .load(Uri.parse(g.getImgUrl()))
                .into(img);


        return v;
    }
}

package com.example.elton.rankingpopulacao;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FederacaoAdapter extends BaseAdapter {

    Context ctx;
    List<Federacao> lista;

    public FederacaoAdapter(Context ctx, List<Federacao> lista){
        this.ctx;
        this.lista;
    }

    @Override
    public int getCount(){
        return lista.size();
    }

    @Override
    public Object getItem(int i){
        return lista.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        Federacao federacao = lista.get(i);
        View linha = LaoyoutInflater.from(ctx).inflate(R.layout.linha,null);
        ImageView img = (ImageView)linha.findViewById(R.id.imageView);
        TextView nome = (TextView) linha.findViewById(textView_1);
        TextView populacao = (TextView) linha.findViewById(textView_2);
        TextView ano = (TextView) linha.findViewById(textView_3);
        TypeArray bandeiras = ctx.getResources().obtainTypedArray(R.array.bandeiras);
        return lista;
    }

}

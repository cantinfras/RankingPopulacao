package com.example.elton.rankingpopulacao;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    List<Federacao> federacoes;
    FederacaoAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linha);
        listView=new ListView(this);
        setContentView(listView);
        federacoes=new ArrayList<Federacao>();
        federacoes.add(new Federacao(1,"China", 1379302784, 2017, 0));
        federacoes.add(new Federacao(2,"Índia", 1281935872, 2017, 1));
        federacoes.add(new Federacao(3,"Estados Unidos", 326625792, 2017, 2));
        federacoes.add(new Federacao(4,"Indonésia", 260580736, 2017, 3));
        federacoes.add(new Federacao(5,"Brasil", 207353392, 2017, 4));
        federacoes.add(new Federacao(6,"Paquistão", 204924864, 2017, 5));
        federacoes.add(new Federacao(7,"Nigéria", 190632256, 2017, 6));
        federacoes.add(new Federacao(8,"Bangladesh", 157826576, 2017, 7));
        federacoes.add(new Federacao(9,"Rússia", 142257520, 2017, 8));
        federacoes.add(new Federacao(10,"Japão", 126451400, 2017, 9));
        federacoes.add(new Federacao(11,"México", 125594792, 2017, 10));
        federacoes.add(new Federacao(12,"Etiópia", 105350016, 2017, 11));
        federacoes.add(new Federacao(13,"Filipinas", 103256080, 2017, 12));
        federacoes.add(new Federacao(14,"Egito", 97041072, 2017, 13));
        federacoes.add(new Federacao(15,"Vietnã", 96160160, 2017, 14));
        listView.setAdapter(new FederacaoAdapter(this,federacoes));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?>adapterView, View view, int i, long l){
        Federacao federacao = (Federacao)adapterView.getItemAtPosition(i);
        Toast.makeText(this,federacao.getNome(), Toast.LENGTH_SHORT).show();
    }


}

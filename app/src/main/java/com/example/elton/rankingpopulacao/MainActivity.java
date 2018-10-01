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
        federacoes.add(new Federacao("China", 1379302784, 2017, 0));
        federacoes.add(new Federacao("Índia", 1281935872, 2017, 1));
        federacoes.add(new Federacao("Estados Unidos", 326625792, 2017, 2));
        federacoes.add(new Federacao("Indonésia", 260580736, 2017, 3));
        federacoes.add(new Federacao("Brasil", 207353392, 2017, 4));
        federacoes.add(new Federacao("Paquistão", 204924864, 2017, 5));
        federacoes.add(new Federacao("Nigéria", 190632256, 2017, 6));
        federacoes.add(new Federacao("Bangladesh", 157826576, 2017, 7));
        federacoes.add(new Federacao("Rússia", 142257520, 2017, 8));
        federacoes.add(new Federacao("Japão", 126451400, 2017, 9));
        federacoes.add(new Federacao("México", 125594792, 2017, 10));
        federacoes.add(new Federacao("Etiópia", 105350016, 2017, 11));
        federacoes.add(new Federacao("Filipinas", 103256080, 2017, 12));
        federacoes.add(new Federacao("Egito", 97041072, 2017, 13));
        federacoes.add(new Federacao("Vietnã", 96160160, 2017, 14));
        listView.setAdapter(new FederacaoAdapter(this,federacoes));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?>adapterView, View view, int i, long l){
        Federacao federacao = (Federacao)adapterView.getItemAtPosition(i);
        Toast.makeText(this,federacao.getNome(), Toast.LENGTH_SHORT).show();
    }


}

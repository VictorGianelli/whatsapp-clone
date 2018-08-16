package br.com.whatsappandroid.cursoandroid.whatsapp2.fragment;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.whatsappandroid.cursoandroid.whatsapp2.R;
import br.com.whatsappandroid.cursoandroid.whatsapp2.model.Contato;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContatosFragment extends Fragment {

    private ListView listView;
    private ArrayAdapter adapter;
    private ArrayList<String> contatos;

    public ContatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Instânciar objetos
        contatos = new ArrayList<>();
        contatos.add("Mariana Silva");
        contatos.add("Leticia Almeida");
        contatos.add("José Renato");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contatos, container, false);

        listView = view.findViewById(R.id.lv_contatos);
        adapter = new ArrayAdapter(
                getActivity(),
                R.layout.lista_contato,
                contatos
        );
        listView.setAdapter(adapter);

        return view;
    }

}

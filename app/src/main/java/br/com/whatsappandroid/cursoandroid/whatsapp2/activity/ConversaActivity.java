package br.com.whatsappandroid.cursoandroid.whatsapp2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import br.com.whatsappandroid.cursoandroid.whatsapp2.R;
import br.com.whatsappandroid.cursoandroid.whatsapp2.helper.Base64Custom;

public class ConversaActivity extends AppCompatActivity {

    private Toolbar toolbar;

    // dados do destinatário
    private String nomeUsuarioDestinatario;
    private String idUsuarioDestinatario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversa);

        Bundle extra = getIntent().getExtras();
        if( extra != null ){
            nomeUsuarioDestinatario = extra.getString("nome");
        }

        toolbar = findViewById(R.id.tb_conversa);

        // Configura toolbar
        toolbar.setTitle( nomeUsuarioDestinatario );
        toolbar.setNavigationIcon(R.drawable.ic_action_arrow_left);
        setSupportActionBar(toolbar);

    }
}

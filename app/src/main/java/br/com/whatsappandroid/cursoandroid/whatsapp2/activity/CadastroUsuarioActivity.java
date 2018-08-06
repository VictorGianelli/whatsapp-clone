package br.com.whatsappandroid.cursoandroid.whatsapp2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.whatsappandroid.cursoandroid.whatsapp2.R;
import br.com.whatsappandroid.cursoandroid.whatsapp2.model.Usuario;

public class CadastroUsuarioActivity extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText senha;
    private Button botaoCadastrar;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        nome            =    findViewById(R.id.edit_cadastro_nome);
        email           =    findViewById(R.id.edit_cadastro_email);
        senha           =    findViewById(R.id.edit_cadastro_senha);
        botaoCadastrar  =    findViewById(R.id.bt_cadastrar);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario = new Usuario();
                usuario.setNome( nome.getText().toString() );
                usuario.setEmail(email.getText().toString());
                usuario.setSenha(senha.getText().toString());
                cadastrarUsuario();
            }
        });

    }

    private void cadastrarUsuario(){
        
    }

}

package exemplologin.segundotina.fiap.com.br.exemplodelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logar(View v) {

        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);


        EditText edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        EditText edtSenha = (EditText) findViewById(R.id.edtSenha);
        String nome = edtUsuario.getText().toString();
        String senha = edtSenha.getText().toString();

        if (nome.toLowerCase().equals("FIAP")|| senha.toLowerCase().equals("FIAP123")){

            Toast.makeText(this, "Seu nome " + nome + "Senha" + senha , Toast.LENGTH_SHORT).show();

        }else {
            Toast.makeText(this, getString(R.string.mensagem_erro), Toast.LENGTH_SHORT).show();

        }


    }



}

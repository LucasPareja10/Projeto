package com.example.login;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class loginAtividade extends Activity {
    private EditText edtUsuario;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        InicializaObjetos();
    }

    public void InicializaObjetos() {
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
    }

    private void MensagemInformativa(String mensagen) {
        new AlertDialog.Builder(this)
                .setTitle("The Club")
                .setMessage(mensagen)
                .setPositiveButton("OK", null)
                .setCancelable(false)
                .show();
    }

    public void Login(View v) {
        login classe_login = new login();
        classe_login.setUsuario(edtUsuario.getText().toString());
        classe_login.setSenha(edtSenha.getText().toString());

        if (classe_login.ValidarUsuario() == false) {
            MensagemInformativa("Dados Incorretos, Favor    preenchê-los corretamente!");
        } else {
            setResult(Activity.RESULT_OK);
            finish();
        }
    }
}


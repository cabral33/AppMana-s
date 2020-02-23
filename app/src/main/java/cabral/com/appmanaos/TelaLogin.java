package cabral.com.appmanaos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class TelaLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void btnLogin(View view) {
        EditText  cartao = findViewById(R.id.numeroCartao);
        EditText senha = findViewById(R.id.textSenha);

            Intent intent = new Intent(this, TelaPrincipal.class);
            startActivity(intent);
    }


}

package mx.edu.tesoem.isc.p5y67s2120222hmrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class InicialActivity extends AppCompatActivity {

    Handler manejador = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        manejador.postDelayed(autocambiar, 5000);
    }

    Runnable autocambiar = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(InicialActivity.this,PrincipalActivity.class);
            startActivity(intent);
            finish();
        }
    };
}
package unam.fca.dmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView campo_texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        campo_texto = (TextView) findViewById(R.id.texto);
        campo_texto.setText("Tu nombre es Nayelly y el numero de cuenta 416129924");

    }
}

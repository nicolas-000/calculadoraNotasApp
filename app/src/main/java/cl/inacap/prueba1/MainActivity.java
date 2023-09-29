package cl.inacap.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    SeekBar cantNotas;
    ImageButton botonEliminar1, botonEliminar2, botonEliminar3, botonEliminar4, botonEliminar5, botonEliminar6, botonEliminar7, botonEliminar8, botonEliminar9, botonEliminar10;
    TextView textoCant, promedio, ponderacionFinal, textoPorcentaje1, textoPorcentaje2, textoPorcentaje3, textoPorcentaje4, textoPorcentaje5, textoPorcentaje6, textoPorcentaje7, textoPorcentaje8, textoPorcentaje9, textoPorcentaje10;
    EditText nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9, nota10, ponderacion1, ponderacion2, ponderacion3, ponderacion4, ponderacion5, ponderacion6, ponderacion7, ponderacion8, ponderacion9, ponderacion10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantNotas = (SeekBar) findViewById(R.id.cantNotas);
        cantNotas.setMax(9);
        cantNotas.setProgress(0);
        textoCant = (TextView) findViewById(R.id.textoCant);
        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        nota3 = (EditText) findViewById(R.id.nota3);
        nota4 = (EditText) findViewById(R.id.nota4);
        nota5 = (EditText) findViewById(R.id.nota5);
        nota6 = (EditText) findViewById(R.id.nota6);
        nota7 = (EditText) findViewById(R.id.nota7);
        nota8 = (EditText) findViewById(R.id.nota8);
        nota9 = (EditText) findViewById(R.id.nota9);
        nota10 = (EditText) findViewById(R.id.nota10);
        ponderacion1 = (EditText) findViewById(R.id.ponderacion1);
        ponderacion2 = (EditText) findViewById(R.id.ponderacion2);
        ponderacion3 = (EditText) findViewById(R.id.ponderacion3);
        ponderacion4 = (EditText) findViewById(R.id.ponderacion4);
        ponderacion5 = (EditText) findViewById(R.id.ponderacion5);
        ponderacion6 = (EditText) findViewById(R.id.ponderacion6);
        ponderacion7 = (EditText) findViewById(R.id.ponderacion7);
        ponderacion8 = (EditText) findViewById(R.id.ponderacion8);
        ponderacion9 = (EditText) findViewById(R.id.ponderacion9);
        ponderacion10 = (EditText) findViewById(R.id.ponderacion10);
        textoPorcentaje1 = (TextView) findViewById(R.id.textoPorcentaje1);
        textoPorcentaje2 = (TextView) findViewById(R.id.textoPorcentaje2);
        textoPorcentaje3 = (TextView) findViewById(R.id.textoPorcentaje3);
        textoPorcentaje4 = (TextView) findViewById(R.id.textoPorcentaje4);
        textoPorcentaje5 = (TextView) findViewById(R.id.textoPorcentaje5);
        textoPorcentaje6 = (TextView) findViewById(R.id.textoPorcentaje6);
        textoPorcentaje7 = (TextView) findViewById(R.id.textoPorcentaje7);
        textoPorcentaje8 = (TextView) findViewById(R.id.textoPorcentaje8);
        textoPorcentaje9 = (TextView) findViewById(R.id.textoPorcentaje9);
        textoPorcentaje10 = (TextView) findViewById(R.id.textoPorcentaje10);
        botonEliminar1 = (ImageButton) findViewById(R.id.botonEliminar1);
        botonEliminar2 = (ImageButton) findViewById(R.id.botonEliminar2);
        botonEliminar3 = (ImageButton) findViewById(R.id.botonEliminar3);
        botonEliminar4 = (ImageButton) findViewById(R.id.botonEliminar4);
        botonEliminar5 = (ImageButton) findViewById(R.id.botonEliminar5);
        botonEliminar6 = (ImageButton) findViewById(R.id.botonEliminar6);
        botonEliminar7 = (ImageButton) findViewById(R.id.botonEliminar7);
        botonEliminar8 = (ImageButton) findViewById(R.id.botonEliminar8);
        botonEliminar9 = (ImageButton) findViewById(R.id.botonEliminar9);
        botonEliminar10 = (ImageButton) findViewById(R.id.botonEliminar10);
        TextView[] textoPorcentajes = {textoPorcentaje1, textoPorcentaje2, textoPorcentaje3, textoPorcentaje4, textoPorcentaje5, textoPorcentaje6, textoPorcentaje7, textoPorcentaje8, textoPorcentaje9, textoPorcentaje10};
        ImageButton[] botonesEliminar = {botonEliminar1, botonEliminar2, botonEliminar3, botonEliminar4, botonEliminar5, botonEliminar6, botonEliminar7, botonEliminar8, botonEliminar9, botonEliminar10};
        EditText[] datos = {nota1, ponderacion1, nota2, ponderacion2, nota3, ponderacion3, nota4, ponderacion4, nota5, ponderacion5, nota6, ponderacion6, nota7, ponderacion7, nota8, ponderacion8, nota9, ponderacion9, nota10, ponderacion10};
        promedio = (TextView) findViewById(R.id.promedio);
        ponderacionFinal = (TextView) findViewById(R.id.ponderacionFinal);

        cantNotas.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textoCant.setText(String.valueOf(progress + 1));
                for (int i = 0; i <= progress; i++){
                    datos[i*2].setVisibility(View.VISIBLE);
                    datos[i*2+1].setVisibility(View.VISIBLE);
                    textoPorcentajes[i].setVisibility(View.VISIBLE);
                    botonesEliminar[i].setVisibility(View.VISIBLE);
                };
                for (int i = 9; i > progress; i--){
                    datos[i*2].setVisibility(View.GONE);
                    datos[i*2].setText("");
                    datos[i*2+1].setVisibility(View.GONE);
                    datos[i*2+1].setText("");
                    textoPorcentajes[i].setVisibility(View.GONE);
                    botonesEliminar[i].setVisibility(View.GONE);
                    if (i == 1) {
                        botonesEliminar[0].setVisibility(View.GONE);
                    }
                };
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        for (int i = 0; i < botonesEliminar.length; i++) {
            botonesEliminar[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int progreso = cantNotas.getProgress();
                    datos[progreso].setVisibility(View.GONE);
                    datos[progreso+1].setVisibility(View.GONE);
                    cantNotas.setProgress(cantNotas.getProgress()-1);
                    datos[progreso].setText("");
                    datos[progreso+1].setText("");
                    calcularPromedio(datos);
                }
            });
        }

        for (int i = 0; i < datos.length; i++) {
            datos[i].setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if (!b) {
                        calcularPromedio(datos);
                    }
                }
            });
        }
    }

    public void calcularPromedio(EditText[] datos) {
        double prom = 0.0;
        int ponderacionTotal = 0;
        for (int i = 0; i <= cantNotas.getProgress(); i++) {
            double nota = 0.0001;
            int ponderacion = 0;
            if (!datos[i*2].getText().toString().matches("")) {
                nota = Double.parseDouble(datos[i*2].getText().toString());
                if (nota < 1.0 || nota > 7.0) {
                    Toast.makeText(this,"La nota debe estar entre 1.0 y 7.0", Toast.LENGTH_SHORT).show();
                }
            }
            if (!datos[i*2+1].getText().toString().matches("")) {
                ponderacion = Integer.parseInt(datos[i*2+1].getText().toString());
                if (ponderacion > 100 || ponderacion < 1) {
                    Toast.makeText(this,"La ponderacion debe estar entre 1 y 100", Toast.LENGTH_SHORT).show();
                }
            }
            ponderacionTotal += ponderacion;
            prom += nota * ponderacion / 100;
        }
        promedio.setText("" + prom);
        ponderacionFinal.setText(ponderacionTotal + " %");
        if (ponderacionTotal > 100) {
            ponderacionFinal.setTextColor(Color.parseColor("#ff0000"));
            Toast.makeText(this,"La ponderación final no debe superar el 100%", Toast.LENGTH_SHORT).show();
        } else {
            ponderacionFinal.setTextColor(getResources().getColor(android.R.color.tab_indicator_text));
        }
        if (prom < 4.0) {
            promedio.setTextColor(Color.parseColor("#ff0000"));
        } else {
            promedio.setTextColor(Color.parseColor("#00ff00"));
        }
    }
}
package multiples.com.multiwebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MOODLE
        //Button butt1=(Button)findViewById(R.id.button);
        Button moodle_button=(Button) findViewById(R.id.aulavirtual);
        //ImageButton moodle_button=(ImageButton) findViewById(R.id.aulavirtual);

        //BIBLIOTECA
        //Button butt2=(Button)findViewById(R.id.button3);
        Button biblioteca_button=(Button) findViewById(R.id.biblioteca);
        //ImageButton biblioteca_button=(ImageButton) findViewById(R.id.biblioteca);

        //INTRANET
        Button intranet_button=(Button) findViewById(R.id.intranet);
        //ImageButton intranet_button=(ImageButton) findViewById(R.id.intranet);

        //UBICACION
        //Button butt4=(Button)findViewById(R.id.button4);
        Button ubicacion_button=(Button) findViewById(R.id.ubicacion);
        //ImageButton ubicacion_button=(ImageButton) findViewById(R.id.ubicacion);

        moodle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(MainActivity.this,second.class);
                startActivity(int1);
            }
        });

        biblioteca_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(MainActivity.this,third.class);
                startActivity(int1);
            }
        });

        intranet_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(MainActivity.this,four.class);
                startActivity(int1);
            }
        });

        ubicacion_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(MainActivity.this,five.class);
                startActivity(int1);
            }
        });

    }
}

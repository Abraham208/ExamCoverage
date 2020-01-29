package mcm.edu.ph.examcoverage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/** all the imports from this point forward are added by me **/
import android.widget.Spinner; // ang import para macall ang spinner
import android.widget.Button; // ang import para macall ang button
import android.widget.EditText; // ang import para macall ang textbox (EditText)
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String text; //diri nato gideclare ang string para magamit sya sa tanan functions(methods) sa MainActivity.java Class
    Spinner spinner; //ang spinner gideclare nato as object (otherwise known as variable);
    Button button; //ang button gideclare nato as object (otherwise known as variable);
    EditText txtbox; //ang EditText gideclare nato as object (otherwise known as variable);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner =  findViewById(R.id.kibsSpin); //gitawag nato ang kibSpin spinner gikan sa activity_main.xml
        button =   findViewById(R.id.btn); //gitawag nato ang btn button gikan sa activity_main.xml
        txtbox =   findViewById(R.id.txtBox); //gitawag nato ang txtbox EditText gikan sa activity_main.xml

        button.setOnClickListener( //nagcreate ta ug button onclick listener
                new View.OnClickListener() { //para mag autotype sya type lang ug new View.OnClickListener. pag naay suggestion just press enter or click
                    @Override
                    public void onClick(View v) {
                        //ang code na gusto ninyo irun after mo magclick ug button, diri ibutang

                    }
                }
        );
    }
}

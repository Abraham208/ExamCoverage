package mcm.edu.ph.examcoverage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent; /** this time gigamit nato ang intent para makareceive ug data **/
import android.widget.TextView; //gi import nato para naa tay display

public class SecondActivity extends AppCompatActivity {

    String txtBoxTxt="", spinnerTxt=""; //string declarations as container
    int numBoxInt=0; //container variable pud ni
    TextView tbt,st,nbt; //TextView declarations para madisplay nato ang data later
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent qwerty = getIntent(); //gideclare nato si intent qwerty nga ang purpose lang niya is to receive.

        txtBoxTxt = qwerty.getStringExtra("TEXT_SA_TEXTBOX"); //this time gikuha na nato ang data gikan kay TEXT_SA_TEXTBOX padulong sa txtBoxTxt
        spinnerTxt = qwerty.getStringExtra("TEXT_SA_SPINNER"); //same as above

        numBoxInt = qwerty.getIntExtra("INT_NATO",0); //comment on this line below
        /** same lang with the string pero this time nangayo siya ug default value (zero)
         *  pag wala syay makita nga unod (or data). This applies for all number
         *  based data types such as float, double, long, etc.
         **/

        tbt = findViewById(R.id.txtBox); //ang textview para sa typed text
        st = findViewById(R.id.spinTxtBox); // ang textview para sa spinner text
        nbt = findViewById(R.id.numTxtBox); // ang textview para sa number

        //tbt.setText(txtBoxTxt); // atong ipadisplay sa textview ang data, typed text
        st.setText(spinnerTxt); //spinner
        //nbt.setText(String.valueOf(numBoxInt)); //this time kay int man sya, ato sa syang giconvert to String.


    }
}

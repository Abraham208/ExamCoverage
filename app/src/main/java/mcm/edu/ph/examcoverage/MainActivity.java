package mcm.edu.ph.examcoverage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/** all the imports from this point forward are added by me **/
import android.widget.Spinner; // ang import para macall ang spinner
import android.widget.Button; // ang import para macall ang button
import android.widget.EditText; // ang import para macall ang textbox (EditText)
import android.view.View; // imports na related sa UI interactions. gigamit nato sa onclick listener
import android.widget.AdapterView; //similar sa views para sa button pero this time gamiton nato para sa
import android.content.Intent; // ang import nato para magamit ang intent. responsible para maka move ta to another activity.

public class MainActivity extends AppCompatActivity {

    String txtFromSpinner,txtFromTxtbox; //diri nato gideclare ang string para magamit sya sa tanan functions(methods) sa MainActivity.java Class
    Spinner spinner; //ang spinner gideclare nato as object (otherwise known as variable);
    Button button; //ang button gideclare nato as object (otherwise known as variable);
    EditText txtbox,numbox; //ang EditText gideclare nato as object (otherwise known as variable);
    int number = 0; //naghimo ko ug integer variable just to use as an example later

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner =  findViewById(R.id.kibsSpin); //gitawag nato ang kibSpin spinner gikan sa activity_main.xml
        button =   findViewById(R.id.btn); //gitawag nato ang btn button gikan sa activity_main.xml
        txtbox =   findViewById(R.id.txtBox); //gitawag nato ang txtBox EditText gikan sa activity_main.xml
        numbox =   findViewById(R.id.numBox); //gitawag nato ang numBox EditText, dummy data, gamiton nato for illustration purposes


        spinner.setOnItemSelectedListener( //listener para sa spinner para magcollapse sya pag iclick type lang variableninyo.setOnItemSelectedListener();
                new AdapterView.OnItemSelectedListener() {
                    //for this part para mag auto complete type lang new AdapterView.OnItemSelectedListener then iclick ang suggestion
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        //diri nimo ibutang ang code para maselect ang option gikan sa spinner
                        txtFromSpinner = spinner.getSelectedItem().toString(); // mao ni ang code para makuha nato ang giselect sa spinner. gibutang nato sa string
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        //blangkohi lang diri
                    }
                }
        );

        button.setOnClickListener( //nagcreate ta ug button onclick listener
                new View.OnClickListener() { //para mag autotype sya type lang ug new View.OnClickListener. pag naay suggestion just press enter or click
                    @Override
                    public void onClick(View v) {
                        //ang code na gusto ninyo irun after mo magclick ug button, diri ibutang

                        txtFromTxtbox = String.valueOf(txtbox.getText()); //comment relating to this line of code below
                        /** gikuha nato diri ang whatever gitype nimo sa EditText. Important nga naay String.valueOf()
                         *  nga method para ma sure nato nga string jud ang atong data. Gamit pud sya pangconvert from
                         *  other data types (int, double, char, float) into string in which required ta later.
                         *  Note:
                         *
                         *  to convert any data type to string, String.valueOf(variablediri);
                         *  to convert string data type to double, Double.parseDouble(variablediri);
                         *  to convert string data type to int, Integer.parseInt(variablediri);
                         *
                         *  so kung gusto nato nga integer diretso ato makuha gikan sa textbox ani ang code:
                         *
                         *  txtFromTxtbox = Integer.parseInt(txtbox.getText());
                         *
                         **/
                        number = Integer.parseInt(String.valueOf(numbox.getText()));
                        /** this time int na atong kailangan, so una iconvert gihapon nato sya into string.
                         *  after sa string conversion, ato napud sya inconvert to int. There are other ways
                         *  to do this but isa ni sa easiest.
                         **/

                        Intent i  = new Intent(MainActivity.this, SecondActivity.class); //comment relating to this line of code below
                        /** kani nga line of code nag declare sa atong intention nga mag move ta to another activity.
                         *  sa sulod sa Intent() Object nga ato gicreate is ang mga activities (or java classes)
                         *  nga inyo iforward after ninyo istart ang intent. Ang pasabot sa MainActivity.this nga part
                         *  is kung where magstart ang atong intent. Ang SecondActivity.class nga part is kung asa
                         *  next iforward ang intent, which for this case ang SecondActivity.
                         *  Special Notes:
                         *
                         *  Para makacreate ka ug new activity, iright click ang package folder sa right side, for
                         *  this project ang mcm.edu.ph.examcoverage, then New > Activity > Empty Activity
                         *
                         *  Pag kani nga line of code mag error use this instead:
                         *  Intent i  = new Intent(this, SecondActivity.class);
                         **/

                        i.putExtra("TEXT_SA_SPINNER",txtFromSpinner); //comment relating to this line of code below
                        /** sa ani na way ta maka pass ug variable from one activity padulong sa next one.
                         *  ang "TEXT_SA_SPINNER" kay ang iyahang intent data name, in other words, murag
                         *  variable name lang gihapon. So ang nahitabo ani nga line of code is atong gi
                         *  pasa ang unod ni txtFromSpinner (which is string) padulong kay TEXT_SA_SPINNER
                         **/
                        i.putExtra("INT_NATO", number); //same sa example sa taas. integer sya pero same lang gihapon.
                        i.putExtra("TEXT_SA_TXTBOX", txtFromTxtbox); //ato napud gipasa ang unod gikan sa textbox
                        startActivity(i); //nag indicate nga istart na nato ang intent. always last ni sa intent code.

                    }//closure sa onclick listener. Please ignore
                }//closure sa button onclick function. Please ignore
        ); //closure sa onclick method. Please ignore
    }//closure sa oncreate. Please ignore
}//closure sa main activity. Please ignore

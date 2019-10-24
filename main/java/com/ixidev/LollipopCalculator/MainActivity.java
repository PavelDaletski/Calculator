package com.ixidev.LollipopCalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText input;
    TextView result;
    Button but1;
    Button but2;
    Button but3;
    Button but4;
    Button but5;
    Button but6;
    Button but7;
    Button but8;
    Button but9;
    Button but0;
    Button butsin;
    Button butplus;
    Button butmin;
    Button butc;
    Button butv;
    Button butequl;
    Button butmult;
    Button butdivi;
    Button butbra1;
    Button butbra;
    Button butsinus;
    Button butcos;
    Button buttan;
    Button butctg;
    Button butkoren;
    Button butx2;
    Button butlog;
    Button butsec;
    Button butrad;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.input);
        result = (TextView) findViewById(R.id.result);


        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);
        but0 = (Button) findViewById(R.id.but0);
        butsin = (Button) findViewById(R.id.butsin);
        butplus = (Button) findViewById(R.id.butplus);
        butmin = (Button) findViewById(R.id.butmin);
        butc = (Button) findViewById(R.id.butc);
        butv = (Button) findViewById(R.id.butv);
        butequl = (Button) findViewById(R.id.butequl);
        butmult = (Button) findViewById(R.id.butmult);
        butdivi = (Button) findViewById(R.id.butdivi);
        butbra1 = (Button) findViewById(R.id.butbra1);
        butbra = (Button) findViewById(R.id.butbra);
        butsinus = (Button) findViewById(R.id.butsinus);
        butcos = (Button) findViewById(R.id.butcos);
        buttan = (Button) findViewById(R.id.buttan);
        butctg = (Button) findViewById(R.id.butctg);
        butkoren = (Button) findViewById(R.id.butkoren);
        butx2 = (Button) findViewById(R.id.butx2);
        butrad = (Button) findViewById(R.id.butrad);
        butsec = (Button) findViewById(R.id.butsec);
        butlog = (Button) findViewById(R.id.butlog);


        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
        but6.setOnClickListener(this);
        but7.setOnClickListener(this);
        but8.setOnClickListener(this);
        but9.setOnClickListener(this);
        but0.setOnClickListener(this);
        butx2.setOnClickListener(this);
        buttan.setOnClickListener(this);
        butsinus.setOnClickListener(this);
        butsin.setOnClickListener(this);
        butsec.setOnClickListener(this);
        butplus.setOnClickListener(this);
        butmult.setOnClickListener(this);
        butmin.setOnClickListener(this);
        butkoren.setOnClickListener(this);
        butequl.setOnClickListener(this);
        butdivi.setOnClickListener(this);
        butctg.setOnClickListener(this);
        butcos.setOnClickListener(this);
        butbra.setOnClickListener(this);
        butbra1.setOnClickListener(this);
        butrad.setOnClickListener(this);
        butlog.setOnClickListener(this);

    }
        @Override
        public void onSaveInstanceState(Bundle savedInstanceState) {
            super.onSaveInstanceState(savedInstanceState);
            savedInstanceState.putString("key_name", result.getText().toString());

        }

        @Override
        public void onRestoreInstanceState(Bundle savedInstanceState){
            super.onRestoreInstanceState(savedInstanceState);
            {
                result.setText("" + savedInstanceState.getString("key_name"));


            }
        }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.but1:
                input.setText(input.getText() + "1");
                break;
            case R.id.but2:
                input.setText(input.getText() + "2");
                break;
            case R.id.but3:
                input.setText(input.getText() + "3");
                break;
            case R.id.but4:
                input.setText(input.getText() + "4");
                break;
            case R.id.but5:
                input.setText(input.getText() + "5");
                break;
            case R.id.but6:
                input.setText(input.getText() + "6");
                break;
            case R.id.but7:
                input.setText(input.getText() + "7");
                break;
            case R.id.but8:
                input.setText(input.getText() + "8");
                break;
            case R.id.but9:
                input.setText(input.getText() + "9");
                break;
            case R.id.but0:
                input.setText(input.getText() + "0");
                break;
            case R.id.butv:
                input.setText(input.getText() + ".");
                break;
            case R.id.butplus:
                input.setText(input.getText() + "+");
                break;
            case R.id.butmin:

                input.setText(input.getText() + "-");
                break;
            case R.id.butdivi:
                input.setText(input.getText() + "/");
                break;
            case R.id.butmult:
                input.setText(input.getText() + "*");
                break;
            case R.id.butcos:
                input.setText("COS("+input.getText());
                break;
            case R.id.butsinus:
                input.setText("SIN("+input.getText());
                break;
            case R.id.butlog:
                input.setText("LOG("+input.getText());
                break;
            case R.id.buttan:
                input.setText("TAN(" + input.getText());
                break;
            case R.id.butctg:
                input.setText("CTG(" +input.getText());
                break;
            case R.id.butkoren:
                input.setText( "SQRT(" +input.getText());
                break;
            case R.id.butrad:
                input.setText("RAD("+input.getText());
                break;
            case R.id.butx2:
                input.setText(input.getText()+"^"+2);
                break;
            case R.id.butsec:
                input.setText(input.getText()+"^");
                break;
            case R.id.butpi:
                input.setText(input.getText()+"PI");
                break;
            case R.id.butsin:
                input.setText(input.getText()+"-");
                break;
            case R.id.butequl:
                try {
                    Expression expression = new Expression(input.getText().toString());
                    BigDecimal tempresult = expression.eval();
                    result.setText(tempresult.toPlainString());
                } catch (ArithmeticException e) {
                    result.setText("Error");
                } catch (Expression.ExpressionException e) {
                    result.setText("Eror2");
                } catch (NumberFormatException e) {
                    result.setText("Error3");
                }
                break;

            case R.id.butbra:
                input.setText(input.getText() + "(");
                break;
            case R.id.butbra1:
                input.setText(input.getText() + ")");
                break;
            case R.id.butc:
                input.setText("");
                break;
            default:
                break;
        }

    }


}








package com.example.calc12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.String;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";

    public void onClick1 (View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) v;
        string = (String) button.getText().toString();

        if (!string.contains("+") && !string.contains("-") && !string.contains("*") && !string.contains("/")) {
            string1 = string1 + string;

            if (arrayList.size() > 0) {

                String remove = arrayList.remove((arrayList.size() - 1));


            }
            arrayList.add(string1);

        }

        else {

            arrayList.add(string);
            arrayList.add(string);
            string1 = "";


        }

         textView.setText(textView.getText().toString()+string);

        //textView.setText(arrayList.toString());
    }
    

public void onClick (View v) {

        TextView textView1 = (TextView) findViewById(R.id.textView1);

        double calculator = 0;
        int x = arrayList.size();

   while(x != 1) {

    if (x > 3) {
                
    	if (arrayList.get(3).contains("*") || arrayList.get(3).contains("/")){

    		if (arrayList.get(3).contains("*")) { calculator = Double.parseDouble(arrayList.get(2)) * Double.parseDouble(arrayList.get(4));}
        	if (arrayList.get(3).contains("/")) { calculator = Double.parseDouble(arrayList.get(2)) / Double.parseDouble(arrayList.get(4)); }

                arrayList.remove(2);
                arrayList.remove(2);
                arrayList.remove(2);
                arrayList.add(2, Double.toString(calculator));
                x = arrayList.size();

        } 
         else {

      if (arrayList.get(1).contains("+")) {
                    calculator = Double.parseDouble(arrayList.get(0)) + Double.parseDouble(arrayList.get(2));
                }
      if (arrayList.get(1).contains("-")) {
                    calculator = Double.parseDouble(arrayList.get(0)) - Double.parseDouble(arrayList.get(2));
                }
      if (arrayList.get(1).contains("*")) {
                    calculator = Double.parseDouble(arrayList.get(0)) * Double.parseDouble(arrayList.get(2));
                }
      if (arrayList.get(1).contains("/")) {
                    calculator = Double.parseDouble(arrayList.get(0)) / Double.parseDouble(arrayList.get(2));
                }

                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.add(0, Double.toString(calculator));
                x = arrayList.size();

    }         
}
else {

                if (arrayList.get(1).contains("+")) {
                    calculator = Double.parseDouble(arrayList.get(0)) + Double.parseDouble(arrayList.get(2));
                }
                if (arrayList.get(1).contains("-")) {
                    calculator = Double.parseDouble(arrayList.get(0)) - Double.parseDouble(arrayList.get(2));
                }
                if (arrayList.get(1).contains("*")) {
                    calculator = Double.parseDouble(arrayList.get(0)) * Double.parseDouble(arrayList.get(2));
                }
                if (arrayList.get(1).contains("/")) {
                    calculator = Double.parseDouble(arrayList.get(0)) / Double.parseDouble(arrayList.get(2));
                }

                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.add(0, Double.toString(calculator));
                x = arrayList.size();


            }

   }

        textView1.setText(Double.toString(calculator));
    }

    public void clear  (View v) {
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView = (TextView) findViewById(R.id.textView);

        string1 = "";
        string = "";

        textView1.setText("0");
        textView.setText("");
        arrayList.clear();
    }
    
 

                public void onPunct (View v) {
                	Button button;
                	 TextView textView1 = (TextView) findViewById(R.id.textView1);
                	  button =(Button)findViewById(R.id.button21);

                	  textView1.setText(".");
            
             
               	
                }
            }




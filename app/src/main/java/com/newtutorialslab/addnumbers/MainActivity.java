package com.newtutorialslab.addnumbers;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    private EditText ed1, ed2;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.num1);
        ed2 = (EditText) findViewById(R.id.num2);

        b1 = (Button) findViewById(R.id.add);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = ed1.getText().toString().trim();
                String value2 = ed2.getText().toString().trim();

                Integer number1 = Integer.parseInt(value1);
                Integer number2 = Integer.parseInt(value2);

                int result = number1+number2;

                Toast.makeText(getApplicationContext(),"Result:"+result,Toast.LENGTH_LONG).show();

            }
        });
    }

}

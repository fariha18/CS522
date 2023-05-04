package edu.stevens.cs522.hello;

import static edu.stevens.cs522.hello.ShowActivity.MESSAGE_KEY;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class  MainActivity extends Activity implements View.OnClickListener {
    EditText textbox;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        textbox = (EditText) findViewById(R.id.textbox);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, ShowActivity.class);
        EditText textView = findViewById(R.id.textbox);
        intent.putExtra(MESSAGE_KEY, String.valueOf(textView));
        startActivity(intent);
        textView.setText("Hello " + textbox.getText());
    }
}



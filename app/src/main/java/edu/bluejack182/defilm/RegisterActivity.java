package edu.bluejack182.defilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
;
    }

    public void redirectLogin(android.view.View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}

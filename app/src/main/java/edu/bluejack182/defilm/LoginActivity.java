package edu.bluejack182.defilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void redirectRegister(android.view.View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}

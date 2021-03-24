package kz.study.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btn_kiru, btn_tirkelu;
    EditText  et_email, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_kiru=findViewById(R.id.btn_kiru);
        btn_tirkelu=findViewById(R.id.btn_tirkelu);
        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);

        btn_tirkelu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registration = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(registration);
            }
        });
            btn_kiru.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(TextUtils.isEmpty(et_email.getText())){
                        et_email.setError("Толық толтырыңыз!");
                        return;
                    }
                    if(TextUtils.isEmpty(et_password.getText())){
                        et_password.setError("Толық толтырыңыз!");
                        return;
                    }
                    if(et_email.getText().toString().equals("akmaral.ilyas@gmail.com") &&
                            et_password.getText().toString().equals("123123")){

                        Intent registration = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(registration);

                    } else {
                        Toast.makeText(LoginActivity.this, "Почта немесе пароль қате жазылды!", Toast.LENGTH_SHORT).show();
                    }


                }
        });
    }
}
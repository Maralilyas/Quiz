package kz.study.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {
    EditText et_name, et_email, et_password;
    Button btn_tirkelu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        et_name=findViewById(R.id.et_name);
        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);
        btn_tirkelu=findViewById(R.id.btn_tirkelu);

        btn_tirkelu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(et_name.getText())){
                    et_name.setError("Толық толтырыңыз!");
                    return;
                }
                if(TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("Толық толтырыңыз!");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("Толық толтырыңыз!");
                    return;
                }

                Intent registration = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(registration);
            }
        });
    }
}
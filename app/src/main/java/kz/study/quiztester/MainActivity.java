package kz.study.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_surak1, tv_surak2, tv_surak3, tv_surak4;
    RadioButton rb_s1_jauap1,rb_s1_jauap2,rb_s1_jauap3;
    RadioButton rb_s2_jauap1, rb_s2_jauap2, rb_s2_jauap3;
    RadioButton rb_s3_jauap1, rb_s3_jauap2,rb_s3_jauap3;
    RadioButton rb_s4_jauap1, rb_s4_jauap2, rb_s4_jauap3;
    Button btn_tekseris;
    String [] suraktar = {"1. Шыңғысханның 1211-1215 жылдары жаулап алған жері:",
            "2. Түрксіб теміржолын салуға басшылық еткен қазақ зиялысы:",
            "3. Тәуелсіз Мемлекеттер Достығы(ТМД) құрылды:",
            "4. Қаңлылардың Жетіасар кешеніндегі ең үлкен қаласы:"
    };

    String [][] variant = {
            {"Русь", "Қытай", "Хорезм"},
            {"Қ.Сәтбаев", "Ж.Мыңбаев", "Т.Рысқұлов"},
            {"1991ж. 21 желтоқсан, Алматы", "1991ж. 18 тамыз, Бишкек", "1991ж. 13 желтоқсан, Ашхабад"},
            {"Алтынасар", "Көк-Мардан", "Пұшық-Мардан"},
    };

    String [] jauaptar = {"Қытай", "Т.Рысқұлов", "1991ж. 21 желтоқсан, Алматы", "Алтынасар"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_surak1 = findViewById(R.id.tv_surak1);
        tv_surak2 = findViewById(R.id.tv_surak2);
        tv_surak3 = findViewById(R.id.tv_surak3);
        tv_surak4 = findViewById(R.id.tv_surak4);

        rb_s1_jauap1 = findViewById(R.id.rb_s1_jauap1);
        rb_s1_jauap2 = findViewById(R.id.rb_s1_jauap2);
        rb_s1_jauap3 = findViewById(R.id.rb_s1_jauap3);

        rb_s2_jauap1 = findViewById(R.id.rb_s2_jauap1);
        rb_s2_jauap2 = findViewById(R.id.rb_s2_jauap2);
        rb_s2_jauap3 = findViewById(R.id.rb_s2_jauap3);

        rb_s3_jauap1 = findViewById(R.id.rb_s3_jauap1);
        rb_s3_jauap2 = findViewById(R.id.rb_s3_jauap2);
        rb_s3_jauap3 = findViewById(R.id.rb_s3_jauap3);

        rb_s4_jauap1 = findViewById(R.id.rb_s4_jauap1);
        rb_s4_jauap2 = findViewById(R.id.rb_s4_jauap2);
        rb_s4_jauap3 = findViewById(R.id.rb_s4_jauap3);

        btn_tekseris = findViewById(R.id.btn_tekseris);
        suraktarJinau();


        btn_tekseris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Tekseris(tv_surak1,rb_s1_jauap1,rb_s1_jauap2, rb_s1_jauap3,0);
                Tekseris(tv_surak2,rb_s2_jauap1,rb_s2_jauap2, rb_s2_jauap3,1);
                Tekseris(tv_surak3,rb_s3_jauap1,rb_s3_jauap2, rb_s3_jauap3,2);
                Tekseris(tv_surak4,rb_s4_jauap1,rb_s4_jauap2, rb_s4_jauap3,3);
            }
        });
    }
    public void Tekseris(TextView tv_surak, RadioButton rb1, RadioButton rb2, RadioButton rb3, int index){
        if(rb1.isChecked() &&
                rb1.getText().toString().equals(jauaptar[index])) {
            tv_surak.setText(suraktar[index] + "\nдұрыс");
            tv_surak.setTextColor(getResources().getColor(R.color.green_3));

        } else if(rb2.isChecked() &&
                rb2.getText().toString().equals(jauaptar[index])){
            tv_surak.setText(suraktar[index] + "\nдұрыс");
            tv_surak.setTextColor(getResources().getColor(R.color.green_3));

        } else if(rb3.isChecked() &&
                rb3.getText().toString().equals(jauaptar[index])) {
            tv_surak.setText(suraktar[index] + "\nдұрыс");
            tv_surak.setTextColor(getResources().getColor(R.color.green_3));

        } else{
            tv_surak.setText(suraktar[index] + "\nқате");
            tv_surak.setTextColor(getResources().getColor(R.color.red));
        }
    }
    public void suraktarJinau(){
        tv_surak1.setText(suraktar[0]);
        rb_s1_jauap1.setText(variant[0][0]);
        rb_s1_jauap2.setText(variant[0][1]);
        rb_s1_jauap3.setText(variant[0][2]);

        tv_surak2.setText(suraktar[1]);
        rb_s2_jauap1.setText(variant[1][0]);
        rb_s2_jauap2.setText(variant[1][1]);
        rb_s2_jauap3.setText(variant[1][2]);

        tv_surak3.setText(suraktar[2]);
        rb_s3_jauap1.setText(variant[2][0]);
        rb_s3_jauap2.setText(variant[2][1]);
        rb_s3_jauap3.setText(variant[2][2]);

        tv_surak4.setText(suraktar[3]);
        rb_s4_jauap1.setText(variant[3][0]);
        rb_s4_jauap2.setText(variant[3][1]);
        rb_s4_jauap3.setText(variant[3][2]);
    }
}
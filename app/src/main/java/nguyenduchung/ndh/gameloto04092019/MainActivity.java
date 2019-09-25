package nguyenduchung.ndh.gameloto04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button mbtnRandom;
    TextView mtxtResult;
    EditText medtmin,medtmax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //rule,graph

        //Task check valid muber
            //1: phai nhap gia tri
            //2: neu so mim>max=> max=min +1
            //3: so min >0
        //Task handle ramdom
        // (max - min +1) + min
        //Task show toast
         //thong bao loi hay thanh cong

//            Random random = new Random();
//            int numberint= random.nextInt(10 - 5 + 1) + 5;
//            Log.d("BBB",numberint +"");

       // cach lay gia tri
        mbtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lay gia tri edittext
                String sTextMin=medtmin.getText().toString();
                String sTextMax=medtmax.getText().toString();
                //kiem tra gia tri
                if(sTextMin.equals("") || sTextMax.isEmpty()){
                    Toast.makeText(MainActivity.this,"Chua nhap gia tri",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
    private void initView() {
        mbtnRandom=findViewById(R.id.btn_random);
        mtxtResult=findViewById(R.id.txt_Result);
        medtmin=findViewById(R.id.edt_min);
        medtmax=findViewById(R.id.edt_max);
    }

}

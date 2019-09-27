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
    Random mRandom=new Random();
    String mStringvalueRandom="";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //rule,graph

        //Task check valid muber
            //1: phai nhap gia tri
            //2: neu so mim>max=> max=min +1
            //3: min <100 ,max <=100
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
                if(sTextMin.isEmpty() && sTextMax.isEmpty()) return;
                int sMin=Integer.parseInt(sTextMin);
                int sMax=Integer.parseInt(sTextMax);
                if(sMin < 100 && sMax <= 100) {
                    if (sMin >= sMax) {
                        sMax = sMin + 1;
                    }
                }else {
                        sMax = 100;
                        sMin = 99;
                    }
                medtmin.setText(sMin + "");
                medtmax.setText(sMax + "");
                int valuerabdom =mRandom.nextInt(sMax - sMin + 1) + sMin;
                mStringvalueRandom += valuerabdom + " - ";
                mtxtResult.setText(mStringvalueRandom);

                }

        });


    }

    private void soLoto(int min,int max){
        Random random = new Random();
        int numberint= random.nextInt(max - min + 1) + min;
        mtxtResult.setText(numberint);
    }
    private void initView() {
        mbtnRandom=findViewById(R.id.btn_random);
        mtxtResult=findViewById(R.id.txt_Result);
        medtmin=findViewById(R.id.edt_min);
        medtmax=findViewById(R.id.edt_max);
    }

}

package nguyenduchung.ndh.gameloto04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnRamdom;
    TextView txtResult;
    EditText edtmin,edtmax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //rule,graph
        initView();
        //Task check valid muber
            //1: phai nhap gia tri
            //2: neu so mim>max=> max=min +1
            //3: so min >0
        //Task handle ramdom
        //Task show toast
         //thong bao loi hay thanh cong

    }
    private void initView() {
        btnRamdom.findViewById(R.id.btn_ramdom);
        txtResult.findViewById(R.id.txt_Result);
        edtmin.findViewById(R.id.edt_min);
        edtmax.findViewById(R.id.edt_max);
    }


}

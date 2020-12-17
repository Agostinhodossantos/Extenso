package multiple.recyclerviewmultiple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button   reg_button_join_us;
    private EditText reg_result_et , reg_num_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reg_button_join_us = findViewById(R.id.reg_button_join_us);
        reg_result_et    = findViewById(R.id.reg_result_et);
        reg_num_et     = findViewById(R.id.reg_num_et);

        reg_button_join_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                reg_result_et.setText("");
            }
        });
    }
}

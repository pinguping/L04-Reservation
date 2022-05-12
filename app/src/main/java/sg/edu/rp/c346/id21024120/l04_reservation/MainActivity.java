package sg.edu.rp.c346.id21024120.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1
    EditText etName;
    EditText etNumber;
    EditText etSize;
    CheckBox cbSmoke;
    DatePicker dp;
    TimePicker tp;
    Button btnConfirm;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2
        etName = findViewById(R.id.EditTextName);
        etNumber = findViewById(R.id.EditTextNumber);
        etSize = findViewById(R.id.EditTextSize);
        cbSmoke = findViewById(R.id.checkboxSmoke);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnConfirm = findViewById(R.id.buttonConfirm);
        btnReset = findViewById(R.id.buttonReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp.updateDate(2020, 4, 01);
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);

            }
        });

        cbSmoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smokeMsg;
                if (cbSmoke.isChecked()) {
                    smokeMsg = "Y";
                } else {
                    smokeMsg = "N";
                }
            }
        });



        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // date---
                String date;
                int day = dp.getDayOfMonth();
                int month = dp.getMonth() + 1;
                int year = dp.getYear();
                date = day + "/" + month + "/" + year;

                // time---
                String time;
                int hour = tp.getCurrentHour();
                int min = tp.getCurrentMinute();

                if (min < 10) {
                    time = hour + ":0" + min;
                } else {
                    time = hour + ":" + min;
                }



            }
        });


    }
}
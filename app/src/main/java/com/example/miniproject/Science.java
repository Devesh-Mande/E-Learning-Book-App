package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Science extends AppCompatActivity {
    TextView sci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        sci=(TextView)findViewById(R.id.textView4);
        sci.setText("" +
                "Science is a systematic enterprise that builds and organizes knowledge in the form of testable explanations and predictions about the universe." +
                "[1][2]The earliest roots in the history of science can be traced to Ancient Egypt and Mesopotamia in around 3000 to 1200 BCE.[3][4]" +
                " Their contributions to mathematics, astronomy, and medicine entered and shaped Greek natural philosophy of classical antiquity, whereby formal attempts were made to provide explanations of events in the physical world based on natural causes." +
                "[3][4] After the fall of the Western Roman Empire, " +
                "knowledge of Greek conceptions of the world deteriorated in Western Europe during the early centuries (400 to 1000 CE) of the Middle Ages,[5] but was preserved in the Muslim world during the Islamic Golden Age.[6] ");
    }
}
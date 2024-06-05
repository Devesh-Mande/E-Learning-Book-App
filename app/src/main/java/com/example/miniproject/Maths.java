package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Maths extends AppCompatActivity {
    TextView maths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
        maths=(TextView)findViewById(R.id.textView3);
        maths.setText("Mathematics (from Ancient Greek μάθημα; máthēma: 'knowledge, study, learning') is an area of knowledge that includes such topics as numbers (arithmetic, number theory),[1] formulas and related structures (algebra),[2] shapes and the spaces in which they are contained (geometry),[1] and quantities and their changes (calculus and analysis).[3][4][5]\n" +
                "\n" +
                "Most mathematical activity involves discovering and proving properties of abstract objects by pure reasoning. These objects are either abstractions from nature, such as natural numbers or lines, or — in modern mathematics — entities that are stipulated with certain properties, called axioms. A proof consists of a succession of applications of some deductive rules to already known results, including previously proved theorems");
    }
}
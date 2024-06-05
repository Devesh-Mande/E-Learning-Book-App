package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class English extends AppCompatActivity {
    TextView eng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        eng=(TextView)findViewById(R.id.textView2);
        eng.setText("English is an Indo-European language and belongs to the West Germanic group of the Germanic languages.[18] Old English originated from a Germanic tribal and linguistic continuum along the Frisian North Sea coast, whose languages gradually evolved into the Anglic languages in the British Isles, and into the Frisian languages and Low German/Low Saxon on the continent. The Frisian languages, which together with the Anglic languages form the Anglo-Frisian languages, are the closest living relatives of English. Low German/Low Saxon is also closely related, and sometimes English, the Frisian languages, and Low German are grouped together as the Ingvaeonic (North Sea Germanic)" );
    }
}
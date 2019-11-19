package com.haanhgs.richtexteditor;

import androidx.appcompat.app.AppCompatActivity;
import jp.wasabeef.richeditor.RichEditor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private RichEditor editor;
    private ImageButton ibnBold;
    private ImageButton ibnItalic;
    private ImageButton ibnUnderline;
    private ImageButton ibnStrike;
    private ImageButton ibnLeft;
    private ImageButton ibnCenter;
    private ImageButton ibnRight;
    private ImageButton ibnBullet;
    private ImageButton ibnNumber;


    private void initEditor(){
        editor = findViewById(R.id.editor);
        editor.setEditorFontSize(18);
        editor.setEditorFontColor(Color.BLACK);
        editor.setPadding(10, 10, 10, 10);
        editor.setPlaceholder("Create or edit content ...");
    }

    private void initButtons(){
        ibnBold = findViewById(R.id.ibnBold);
        ibnItalic = findViewById(R.id.ibnItalic);
        ibnUnderline = findViewById(R.id.ibnUnderline);
        ibnStrike = findViewById(R.id.ibnStrike);
        ibnLeft = findViewById(R.id.ibnLeft);
        ibnCenter = findViewById(R.id.ibnCenter);
        ibnRight = findViewById(R.id.ibnRight);
        ibnBullet = findViewById(R.id.ibnBullet);
        ibnNumber = findViewById(R.id.ibnNumber);
    }

    private void handleBold(){
        ibnBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setBold();
            }
        });
    }

    private void handleRight(){
        ibnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setAlignRight();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initEditor();
        initButtons();
        handleBold();
        handleRight();


    }
}

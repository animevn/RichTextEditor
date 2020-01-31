package com.haanhgs.richtexteditor;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.richeditor.RichEditor;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editor)
    RichEditor editor;
    @BindView(R.id.cvEditor1)
    CardView cvEditor1;
    @BindView(R.id.ibnBold)
    ImageButton ibnBold;
    @BindView(R.id.ibnItalic)
    ImageButton ibnItalic;
    @BindView(R.id.ibnUnderline)
    ImageButton ibnUnderline;
    @BindView(R.id.ibnStrike)
    ImageButton ibnStrike;
    @BindView(R.id.ibnLeft)
    ImageButton ibnLeft;
    @BindView(R.id.ibnCenter)
    ImageButton ibnCenter;
    @BindView(R.id.ibnRight)
    ImageButton ibnRight;
    @BindView(R.id.ibnBullet)
    ImageButton ibnBullet;
    @BindView(R.id.ibnNumber)
    ImageButton ibnNumber;
    @BindView(R.id.cvEditor2)
    CardView cvEditor2;

    private void initEditor() {
        editor.setEditorFontSize(18);
        editor.setEditorFontColor(Color.BLACK);
        editor.setPadding(10, 10, 10, 10);
        editor.setPlaceholder("Create or edit content ...");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initEditor();
    }

    @OnClick({R.id.ibnBold, R.id.ibnItalic, R.id.ibnUnderline, R.id.ibnStrike, R.id.ibnLeft,
            R.id.ibnCenter, R.id.ibnRight, R.id.ibnBullet, R.id.ibnNumber})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ibnBold:
                editor.setBold();
                break;
            case R.id.ibnItalic:
                editor.setItalic();
                break;
            case R.id.ibnUnderline:
                editor.setUnderline();
                break;
            case R.id.ibnStrike:
                editor.setStrikeThrough();
                break;
            case R.id.ibnLeft:
                editor.setAlignLeft();
                break;
            case R.id.ibnCenter:
                editor.setAlignCenter();
                break;
            case R.id.ibnRight:
                editor.setAlignRight();
                break;
            case R.id.ibnBullet:
                editor.setBullets();
                break;
            case R.id.ibnNumber:
                editor.setNumbers();
                break;
        }
    }
}

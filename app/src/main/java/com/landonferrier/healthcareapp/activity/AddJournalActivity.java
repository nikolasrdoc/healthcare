package com.landonferrier.healthcareapp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import com.kaopiz.kprogresshud.KProgressHUD;
import com.landonferrier.healthcareapp.R;
import com.landonferrier.healthcareapp.views.CustomFontEditText;
import com.landonferrier.healthcareapp.views.CustomFontTextView;
import com.parse.ParseObject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AddJournalActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_back)
    public ImageView btnBack;

    @BindView(R.id.edt_journal_title)
    public CustomFontEditText edtJournalTitle;

    @BindView(R.id.edt_entry)
    public CustomFontEditText edtJournalEntry;

    @BindView(R.id.tv_pain_level)
    public CustomFontTextView tvPainLevel;

    @BindView(R.id.rc_photos)
    public RecyclerView rcPhotos;

    @BindView(R.id.btn_save)
    public CustomFontTextView btnSave;


    @BindView(R.id.tvTitle)
    public CustomFontTextView tvTitle;

    ParseObject journal;
    String journalId = "";

    KProgressHUD hud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_journal);
        ButterKnife.bind(this);
        hud = KProgressHUD.create(this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setCancellable(true)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f);
        btnBack.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_back:
                finish();
                break;
            case R.id.btn_save:
                finish();
                break;
        }
    }
}

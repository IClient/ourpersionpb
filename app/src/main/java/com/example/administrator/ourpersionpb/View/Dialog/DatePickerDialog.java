package com.example.administrator.ourpersionpb.View.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.example.administrator.ourpersionpb.R;


/**
 * Created by Administrator on 2017/9/18 0018.
 */

public class DatePickerDialog extends Dialog {
    Context context;
    int layout;

    public DatePickerDialog(Context context, int theme, int layout) {
        super(context, theme);
        setCanceledOnTouchOutside(false);
        this.context = context;
        this.layout = layout;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker_dialog);
    }
}

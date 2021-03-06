package com.xwtiger.devrescollect.study.androidapi.event;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

import com.xwtiger.devrescollect.utils.Utils;


/**
 * Created by Busap-112 on 2017/12/20.
 */

public class MyTextView extends TextView {

    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev){
        Log.d("testevent", "【农民1】任务<" + Utils.actionToString(ev.getAction()) + "> : 需要分派，我下面没人了，怎么办？自己干吧");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev){
        boolean bo = true;
        switch (ev.getAction()){
            case MotionEvent.ACTION_CANCEL:
                bo = false;
                break;
            case MotionEvent.ACTION_MOVE:
                bo = false;
                break;
            case MotionEvent.ACTION_DOWN:
                bo = true;
                break;
        }
        Log.d("testevent", "【农民1】任务<" + Utils.actionToString(ev.getAction()) + "> : 自己动手，埋头苦干。能解决？" + bo);
        return bo;
    }

}

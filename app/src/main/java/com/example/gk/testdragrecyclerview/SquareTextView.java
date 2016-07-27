package com.example.gk.testdragrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 项目名称：TestDragRecyclerView
 * 类描述：
 * 创建人：gk
 * 创建时间：2016/7/27 16:07
 * 修改人：gk
 * 修改时间：2016/7/27 16:07
 * 修改备注：
 */
public class SquareTextView extends TextView {
    public SquareTextView(Context context) {
        super(context);
    }

    public SquareTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}

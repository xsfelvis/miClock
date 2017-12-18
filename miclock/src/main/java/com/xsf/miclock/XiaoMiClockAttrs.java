package com.xsf.miclock;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import com.xsf.miclock.util.DensityUtils;

/**
 * Author: xushangfei
 * Time: created at 2017/12/17.
 * Description:
 */

public class XiaoMiClockAttrs {
    /**
     * 背景色
     */
    private int mBackgroundColor;
    /**
     * 亮色 用于分针、秒针、渐变终止色
     */
    private int mLightColor;
    /**
     * 暗色 圆弧、刻度线、时针、渐变起始色
     */
    private int mDarkColor;
    /**
     * 刻度盘数字文本大小
     */
    private float mTextSize;

    private Context mContext;


    public XiaoMiClockAttrs(Context context, AttributeSet attrs, int defStyleAttr) {
        this.mContext = context;
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.xiaomiClockView, defStyleAttr, 0);
        try {
            mBackgroundColor = ta.getColor(R.styleable.xiaomiClockView_backgroundColor, Color.parseColor("#237EAD"));
            mLightColor = ta.getColor(R.styleable.xiaomiClockView_lightColor, Color.parseColor("#ffffff"));
            mDarkColor = ta.getColor(R.styleable.xiaomiClockView_darkColor, Color.parseColor("#80ffffff"));
            mTextSize = ta.getDimension(R.styleable.xiaomiClockView_textSize, DensityUtils.sp2px(context, 14));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ta.recycle();
        }
    }

    public int getBackgroundColor() {
        return mBackgroundColor;
    }

    public int getLightColor() {
        return mLightColor;
    }

    public int getDarkColor() {
        return mDarkColor;
    }

    public float getTextSize() {
        return mTextSize;
    }
}

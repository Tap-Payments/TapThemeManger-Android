package company.tap.sample.uikit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import company.tap.sample.R;


public class TapTextView extends AppCompatTextView {

    public TapTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            final TypedArray styledAttributes = getContext().getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.TapTextView,
                    0, 0);

            try {
                float textSize = styledAttributes.getFloat(R.styleable.TapTextView_fontSize, getTextSize());
                int textColor = styledAttributes.getInt(R.styleable.TapTextView_color, getCurrentTextColor());
                setTextSize(textSize);
                setTextColor(textColor);
            } finally {
                styledAttributes.recycle();
            }
        }
    }

    public void setFontSize(float textSize){
        setTextSize(textSize);
        invalidate();
    }

    public void setColor(int textColor){
        setTextColor(textColor);
        invalidate();
    }

}

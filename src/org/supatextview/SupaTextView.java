package org.supatextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

public class SupaTextView extends TextView {

	public SupaTextView(Context context, AttributeSet attrs) {
		super(context, attrs);

		if (attrs != null) {
			TypedArray styledAttributes = context.obtainStyledAttributes(attrs,
					R.styleable.SupaTextView);

			String typeFontString = styledAttributes
					.getString(R.styleable.SupaTextView_type_font);
			styledAttributes.recycle();

			Log.d("SupaTextView.SupaTextView()", "typeFontString:"
					+ typeFontString);

			try {
				if (typeFontString != null && typeFontString.length() > 0) {
					Typeface tf = Typeface.createFromAsset(context.getAssets(),
							typeFontString);

					this.setTypeface(tf);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

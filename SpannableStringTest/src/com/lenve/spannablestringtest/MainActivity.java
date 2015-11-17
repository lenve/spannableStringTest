package com.lenve.spannablestringtest;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.drawable.Drawable;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11,
			tv12, tv13;
	private EditText et1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initTv1();
		initTv2();
		initTv3();
		initTv4();
		initTv5();
		initTv6();
		initTv7();
		initTv8();
		initTv9();
		initTv10();
		initTv11();
		initTv12();
		initTv13();
	}

	/**
	 * 设置超链接
	 */
	private void initTv13() {
		tv13 = (TextView) this.findViewById(R.id.tv13);
		SpannableString ss13 = new SpannableString("打电话，发短信，发邮件，打开网页");
		ss13.setSpan(new URLSpan("tel:13534884482"), 0, 3,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss13.setSpan(new URLSpan("smsto:13534884482"), 4, 7,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss13.setSpan(new URLSpan("mailto:584991843@qq.com"), 8, 11,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss13.setSpan(new URLSpan("http://www.baidu.com"), 12, 16,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv13.setText(ss13);
		tv13.setMovementMethod(LinkMovementMethod.getInstance());
	}

	/**
	 * 设置文本的外观，包括字体、大小、样式和颜色
	 */
	private void initTv12() {
		tv12 = (TextView) this.findViewById(R.id.tv12);
		SpannableString ss12 = new SpannableString("设置文本的外观，包括字体、大小、样式和颜色");
		ss12.setSpan(new TextAppearanceSpan(MainActivity.this,
				android.R.style.TextAppearance_Medium), 0, ss12.length(),
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv12.setText(ss12);
	}

	/**
	 * 完全平方公式（上标和下标的使用）
	 */
	private void initTv11() {
		tv11 = (TextView) this.findViewById(R.id.tv11);
		SpannableString ss11 = new SpannableString("(x1 + x2)2 = x12+x22+2x1x2");
		// 设置下标
		ss11.setSpan(new SubscriptSpan(), 2, 3,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		// 设置下标字体大小
		ss11.setSpan(new AbsoluteSizeSpan(30), 2, 3,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new SubscriptSpan(), 7, 8,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new AbsoluteSizeSpan(30), 7, 8,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new SubscriptSpan(), 14, 15,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new AbsoluteSizeSpan(30), 14, 15,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new SubscriptSpan(), 18, 19,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new AbsoluteSizeSpan(30), 18, 19,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new SubscriptSpan(), 23, 24,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new AbsoluteSizeSpan(30), 23, 24,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new SubscriptSpan(), 25, 26,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new AbsoluteSizeSpan(30), 25, 26,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		// 设置上标
		ss11.setSpan(new SuperscriptSpan(), 9, 10,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new AbsoluteSizeSpan(30), 9, 10,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new SuperscriptSpan(), 15, 16,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new AbsoluteSizeSpan(30), 15, 16,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new SuperscriptSpan(), 19, 20,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss11.setSpan(new AbsoluteSizeSpan(30), 19, 20,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv11.setText(ss11);
	}

	/**
	 * 设置字体粗体样式
	 */
	private void initTv10() {
		tv10 = (TextView) this.findViewById(R.id.tv10);
		SpannableString ss10 = new SpannableString("字体样式，粗体、斜体等");
		ss10.setSpan(new StyleSpan(Typeface.BOLD), 5, 7,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv10.setText(ss10);
	}

	/**
	 * 基于X轴的缩放
	 */
	private void initTv9() {
		tv9 = (TextView) this.findViewById(R.id.tv9);
		SpannableString ss9 = new SpannableString("基于X轴缩放");
		// ScaleXSpan中的参数大于1表示横向扩大，小于1大于0表示缩小，等于1表示正常显示
		ss9.setSpan(new ScaleXSpan(2), 0, ss9.length(),
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv9.setText(ss9);
	}

	/**
	 * 设置图片，设置的图片会替换掉之前的文字
	 */
	private void initTv8() {
		tv8 = (TextView) this.findViewById(R.id.tv8);
		SpannableString ss8 = new SpannableString("设置图片");
		ss8.setSpan(
		// DynamicDrawableSpan.ALIGN_BASELINE表示依照基线对齐
		// DynamicDrawableSpan.ALIGN_BOTTOM表示依照底部对齐
				new DynamicDrawableSpan(DynamicDrawableSpan.ALIGN_BOTTOM) {

					@Override
					public Drawable getDrawable() {
						Drawable d = getResources().getDrawable(
								R.drawable.ic_launcher);
						d.setBounds(0, 0, 150, 150);
						return d;
					}
				}, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);// 这里的参数0，1表示将“设”字替换为图片
		tv8.setText(ss8);
	}

	/**
	 * 下划线
	 */
	private void initTv7() {
		tv7 = (TextView) this.findViewById(R.id.tv7);
		SpannableString ss7 = new SpannableString("下划线");
		ss7.setSpan(new UnderlineSpan(), 0, ss7.length(),
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv7.setText(ss7);
	}

	/**
	 * 删除线
	 */
	private void initTv6() {
		tv6 = (TextView) this.findViewById(R.id.tv6);
		SpannableString ss6 = new SpannableString("删除线");
		ss6.setSpan(new StrikethroughSpan(), 0, ss6.length(),
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv6.setText(ss6);
	}

	/**
	 * 设置装饰效果，浮雕
	 */
	private void initTv5() {
		tv5 = (TextView) this.findViewById(R.id.tv5);
		SpannableString ss5 = new SpannableString("浮雕浮雕浮雕浮雕");
		ss5.setSpan(new EmbossMaskFilter(new float[] { 1, 1, 3 }, 1.5f, 8, 3),
				0, ss5.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv5.setText(ss5);
	}

	/**
	 * 设置装饰效果，模糊
	 */
	private void initTv4() {
		tv4 = (TextView) this.findViewById(R.id.tv4);
		SpannableString ss4 = new SpannableString("模糊模糊模糊模糊");
		ss4.setSpan(new MaskFilterSpan(new BlurMaskFilter(1f, Blur.OUTER)), 0,
				ss4.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv4.setText(ss4);
	}

	/**
	 * 设置文本颜色
	 */
	private void initTv3() {
		tv3 = (TextView) this.findViewById(R.id.tv3);
		SpannableString ss3 = new SpannableString("设置文本颜色");
		ss3.setSpan(new ForegroundColorSpan(Color.parseColor("#FF3030")), 0,
				ss3.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv3.setText(ss3);
	}

	/**
	 * 设置点击事件
	 */
	private void initTv2() {
		tv2 = (TextView) this.findViewById(R.id.tv2);
		SpannableString ss2 = new SpannableString("点我吧123456");
		ss2.setSpan(new ClickableSpan() {

			@Override
			public void onClick(View widget) {
				Log.i("lenve", "tv2---onClick");
				Toast.makeText(MainActivity.this, "点我呀", Toast.LENGTH_SHORT)
						.show();
			}
		}, 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		tv2.setText(ss2);
		// 设置tv2为可点击状态
		tv2.setMovementMethod(LinkMovementMethod.getInstance());
	}

	/**
	 * 设置背景颜色
	 */
	private void initTv1() {
		tv1 = (TextView) this.findViewById(R.id.tv1);
		SpannableString ss1 = new SpannableString("设置背景颜色");
		ss1.setSpan(new BackgroundColorSpan(Color.parseColor("#FFD700")), 0,
				ss1.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
		tv1.setText(ss1);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn1:
			tv1.append("1234");
			break;

		default:
			break;
		}
	}
}

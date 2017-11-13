package tapfuns.from.com.fragmentfromavtivityinfo.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/11/3.
 */
public class BaseFragmentView extends LinearLayout{
    private LayoutParams layoutParams;
    private TextView textView;

    public TextView getTextViewss() {
        return textView;
    }

    public BaseFragmentView(Context context) {
        super(context);
        init(context);
    }
    public void init(Context context){
        textView=new TextView(context);
        textView.setText("我是一個好人");
        textView.setTextSize(30);
        layoutParams=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        this.addView(textView,layoutParams);
    }
}

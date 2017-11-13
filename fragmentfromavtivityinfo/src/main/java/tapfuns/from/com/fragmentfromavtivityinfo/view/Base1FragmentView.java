package tapfuns.from.com.fragmentfromavtivityinfo.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.tapfuns.utils.tool.TapfunsScreenUtil;

/**
 * Created by Administrator on 2017/11/6.
 */
public class Base1FragmentView extends LinearLayout{
    private LinearLayout layout;
    private BaseFragmentView baseFragment;
    private EditText editText;
    private LayoutParams layoutParam;
    private Button button;
    protected TapfunsScreenUtil mScreen;

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public EditText getEditText() {
        return editText;
    }

    public void setEditText(EditText editText) {
        this.editText = editText;
    }

    public LinearLayout getLayout() {
        return layout;
    }

    public void setLayout(LinearLayout layout) {
        this.layout = layout;
    }

    /**

     * 上线文对象
     */
    protected Context mContext;
    /**
     * 判断是否是手机设备
     */
    protected boolean isPhone;
    /**
     * 设备宽度
     */
    protected int mWidth;
    /**
     * 设备高度
     */
    protected int mHeight;
    protected boolean _isPortrait;
    public Base1FragmentView(Context context) {
        super(context);
        init(context);
    }
    public void init(Context context){
        this.setOrientation(LinearLayout.VERTICAL);
        mContext = context;
        mScreen = TapfunsScreenUtil.getInStance((Activity) mContext);
        _isPortrait = mScreen.isPortrait((Activity)mContext);
        //language=Controls.getInstance().getLanguage().toLowerCase();
        //Controls.instance().setPortrait(isPortrait);
        mWidth = mScreen.getPxWidth();
        mHeight= mScreen.getPxHeight();

        editText=new EditText(context);
        layoutParam=new LayoutParams(LayoutParams.MATCH_PARENT,mHeight/8);
        this.addView(editText,layoutParam);

        button=new Button(context);
        button.setText("btn");
        layoutParam=new LayoutParams(LayoutParams.MATCH_PARENT,mHeight/8);
        this.addView(button,layoutParam);

        layout=new LinearLayout(context);
        layout.setId(View.generateViewId());
        layoutParam=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        this.addView(layout,layoutParam);

//        BaseFragmentView baseFragment=new BaseFragmentView(context);
//        layoutParam=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
//        layout.addView(baseFragment,layoutParam);
    }
}

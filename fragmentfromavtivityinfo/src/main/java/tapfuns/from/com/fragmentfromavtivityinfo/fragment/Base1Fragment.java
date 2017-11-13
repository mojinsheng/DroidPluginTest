package tapfuns.from.com.fragmentfromavtivityinfo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import tapfuns.from.com.fragmentfromavtivityinfo.view.Base1FragmentView;

/**
 * Created by Administrator on 2017/11/6.
 */
public class Base1Fragment extends Fragment {
    private Base1FragmentView base1Fragment;
    private EditText editText;
    private Button button;
    private SetMessage setMessage;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setMessage=(SetMessage) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        base1Fragment=new Base1FragmentView(getActivity());
        editText=base1Fragment.getEditText();
        button=base1Fragment.getButton();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMessage.onMessage(editText.getText().toString().toString());
            }
        });
        return base1Fragment;
    }
    public interface SetMessage{
        public void onMessage(String info);
    }
}

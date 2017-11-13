package tapfuns.from.com.fragmentfromavtivityinfo.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tapfuns.from.com.fragmentfromavtivityinfo.view.BaseFragmentView;

/**
 * Created by Administrator on 2017/11/3.
 */
public class BaseFragment extends Fragment {
    private BaseFragmentView baseFragment;
    private String info;
    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("tapfuns","onCreateView");
        baseFragment=new BaseFragmentView(getActivity());
        textView=baseFragment.getTextViewss();
        Bundle b= getArguments();
        if(b!=null){

            info=b.getString("info");

            textView.setText(info);
        }

        // textView.setText("");
        return baseFragment;
    }


}

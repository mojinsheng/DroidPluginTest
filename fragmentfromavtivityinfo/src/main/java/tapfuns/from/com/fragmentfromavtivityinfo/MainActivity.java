package tapfuns.from.com.fragmentfromavtivityinfo;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import tapfuns.from.com.fragmentfromavtivityinfo.fragment.Base1Fragment;
import tapfuns.from.com.fragmentfromavtivityinfo.fragment.BaseFragment;
import tapfuns.from.com.fragmentfromavtivityinfo.view.BaseFragmentView;
import tapfuns.from.com.fragmentfromavtivityinfo.view.MainView;
import tapfuns.from.com.mylibrary.Mylib;
import tapfuns.from.com.mylibrary.TwoActivity;

public class MainActivity extends FragmentActivity{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction=null;
    private Button button;
    private EditText editText;
    LinearLayout layoutss
            ;
    MainView mainView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainView=new MainView(this);
        setContentView(R.layout.activity_main);
        layoutss=mainView.getLayout();
        Log.i("tapfuns","说明:"+Mylib.getIntgance().getText());
        button=(Button)findViewById(R.id.btn);
//        editText=mainView.getEditText();
//        fragmentManager=getSupportFragmentManager();
//        fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.replace(layoutss.getId(),new Base1Fragment());
//        fragmentTransaction.commit();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info=editText.getText().toString().trim();
                Base1Fragment baseFragment=new Base1Fragment();
////                Bundle b=new Bundle();
////                b.putString("info",info);
////                baseFragment.setArguments(b);
//                fragmentManager=getSupportFragmentManager();
//                fragmentTransaction=fragmentManager.beginTransaction();
//                fragmentTransaction.replace(layoutss.getId(),baseFragment);
//                fragmentTransaction.commit();
                Intent intent=new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });
    }

//    @Override
//   // public void onMessage(String info) {
//        mainView.getTextViewss().setText(info);
//    }
}

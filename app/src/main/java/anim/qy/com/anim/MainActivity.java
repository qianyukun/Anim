package anim.qy.com.anim;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import anim.qy.com.anim.bean.AlphaAnimation;
import anim.qy.com.anim.bean.Anim;
import anim.qy.com.anim.bean.CombainAnimation;
import anim.qy.com.anim.bean.RotateAnimation;
import anim.qy.com.anim.bean.ScaleAnimation;
import anim.qy.com.anim.bean.TranslateAnimation;

/**
 * Created by Alter on 2018/3/13.
 */

public class MainActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        imageView = findViewById(R.id.image);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new ItemDecoration(this,ItemDecoration.VERTICAL_LIST));
        adapter = new Adapter();
        adapter.setItemlistener(new IItemlistener() {
            @Override
            public void onClick(Anim data, int position) {
                data.doAnim(imageView);
            }
        });
        recyclerView.setAdapter(adapter);
        adapter.setData(initData());

    }

    private List<Anim> initData(){
        List<Anim> anims = new ArrayList<>();
        anims.add(new AlphaAnimation(1,"AlphaAnimation"));
        anims.add(new RotateAnimation(2,"RotateAnimation"));
        anims.add(new ScaleAnimation(3,"ScaleAnimation"));
        anims.add(new TranslateAnimation(4,"TranslateAnimation"));
        anims.add(new CombainAnimation(5,"CombainAnimation"));
        return anims;
    }
}

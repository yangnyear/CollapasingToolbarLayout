package com.swpuiot.timeweaker.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Window;

import com.swpuiot.timeweaker.R;
import com.swpuiot.timeweaker.adapter.RecycleViewAdapter;
import com.swpuiot.timeweaker.presenter.MainHolder;
import com.swpuiot.timeweaker.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainHolder.view{
    private RecyclerView mRecyclerView;
    private MainHolder.presenter mPresenter;
    private LinearLayoutManager mLinearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        inite();
        mPresenter.setRecycViewAdapter();
        mRecyclerView.setLayoutManager(mLinearLayoutManager);


    }
    public  void inite(){
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_my));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView= (RecyclerView) findViewById(R.id.rc_mainlist);
        mLinearLayoutManager=new LinearLayoutManager(this);


        mPresenter=new MainPresenter(this);
    }

    @Override
    public void setRecycViewAdapter(RecycleViewAdapter recycViewAdapter) {
        if (recycViewAdapter!=null){
            mRecyclerView.setAdapter(recycViewAdapter);
        }
    }

}

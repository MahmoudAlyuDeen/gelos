package com.afterapps.gelos.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.Toast;

import com.afterapps.JokesLoader;
import com.afterapps.gelos.BaseActivity;
import com.afterapps.gelos.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity
        extends BaseActivity<HomeView, HomePresenter>
        implements HomeView {

    @BindView(R.id.home_joke_button)
    Button mHomeJokeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @NonNull
    @Override
    public HomePresenter createPresenter() {
        return new HomePresenter();
    }

    @Override
    protected void displayLoadingState() {
    }

    @Override
    protected void discardData() {
    }

    @OnClick(R.id.home_joke_button)
    public void onViewClicked() {
        JokesLoader jokesLoader = new JokesLoader();
        Toast.makeText(this, jokesLoader.getJoke(), Toast.LENGTH_SHORT).show();
    }
}

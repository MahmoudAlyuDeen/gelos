package gelos.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Button;

import com.afterapps.JokesLoader;
import com.afterapps.gelos.BaseActivity;
import com.afterapps.gelos.EndpointsAsyncTask;
import com.afterapps.gelos.R;
import com.afterapps.jokesdisplayer.JokesActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity
        extends BaseActivity<HomeView, HomePresenter>
        implements HomeView {

    @BindView(R.id.adView)
    AdView mAdView;
    @BindView(R.id.home_joke_button)
    Button mHomeJokeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        AdRequest adRequest =
                new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
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
        new EndpointsAsyncTask().execute(this);
    }
}

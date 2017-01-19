package yel.com.myapp.ui;

import android.util.DisplayMetrics;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import butterknife.BindView;
import yel.com.myapp.R;
import yel.com.myapp.base.BaseActivity;

public class NewsActivity extends BaseActivity {

    @BindView(R.id.web)
    WebView web;

    private String url;

    @Override
    public int setLayout() {
        return R.layout.activity_news;
    }

    @Override
    public void init() {
        url = getIntent().getStringExtra("url");

        web.getSettings().setAppCacheEnabled(true);
        web.getSettings().setDomStorageEnabled(true);

        web.getSettings().setLoadsImagesAutomatically(true);
        web.getSettings().setJavaScriptEnabled(true);

        web.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);// 提高渲染优先级

//        web.setWebViewClient(new WebViewClient());
        web.getSettings().setSupportZoom(true);
        // 设置出现缩放工具
        web.getSettings().setBuiltInZoomControls(true);
        // 扩大比例的缩放
        web.getSettings().setUseWideViewPort(true);
        // 自适应屏幕

        web.getSettings().setUseWideViewPort(true);
        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setJavaScriptEnabled(true);
        /************************* 密度调整开始 ****************************/
        int screenDensity = getResources().getDisplayMetrics().densityDpi;
        WebSettings.ZoomDensity zoomDensity = WebSettings.ZoomDensity.MEDIUM;
        switch (screenDensity) {
            case DisplayMetrics.DENSITY_LOW:
                zoomDensity = WebSettings.ZoomDensity.CLOSE;
                break;
            case DisplayMetrics.DENSITY_MEDIUM:
                zoomDensity = WebSettings.ZoomDensity.MEDIUM;
                break;
            case DisplayMetrics.DENSITY_HIGH:
                zoomDensity = WebSettings.ZoomDensity.FAR;
                break;
        }
        web.getSettings().setDefaultZoom(zoomDensity);
        /************************* 密度调整结束 ****************************/
        web.setWebChromeClient(new WebChromeClient() {

            @Override
            public void onProgressChanged(WebView view, int progress) {
                // Activity和Webview根据加载程度决定进度条的进度大小
                if (progress == 100) {
                } else {
                }
            }
        });
//        web.addJavascriptInterface(new Inteface_Js() {
//
//            @Override
//            @JavascriptInterface
//            public void clickOnAndroid(String s) {
//                // TODO Auto-generated method stub
//                Intent in = new Intent(ZwzpyBrowser.this, Good_Detail.class);
//                Good_Detail.good_id = s;
//                startActivity(in);
//            }
//
//        }, "method_on_android_buy");

    }

    @Override
    public void netWrok() {

    }

    @Override
    public void doelse() {
        web.loadUrl(url);
    }

    @Override
    public void listen() {

    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        if (web != null) {
            try {
                web.destroy();
            } catch (Exception e) {
                // TODO Auto-generated catch block
            }
        }
    }
}

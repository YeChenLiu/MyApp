package yel.com.myapp.module;

import java.util.List;

/**
 * Created by xxb on 2017/1/17.
 */

public class OneFModel {
    private ConstellationModel constellationModel;
    private List<JestModel> listJesk;
    private HistoryToDayModle historyToDayModle;
    private List<NewsModel> listNews;

    public ConstellationModel getConstellationModel() {
        return constellationModel;
    }

    public void setConstellationModel(ConstellationModel constellationModel) {
        this.constellationModel = constellationModel;
    }

    public List<JestModel> getListJesk() {
        return listJesk;
    }

    public void setListJesk(List<JestModel> listJesk) {
        this.listJesk = listJesk;
    }

    public HistoryToDayModle getHistoryToDayModle() {
        return historyToDayModle;
    }

    public void setHistoryToDayModle(HistoryToDayModle historyToDayModle) {
        this.historyToDayModle = historyToDayModle;
    }

    public List<NewsModel> getListNews() {
        return listNews;
    }

    public void setListNews(List<NewsModel> listNews) {
        this.listNews = listNews;
    }
}

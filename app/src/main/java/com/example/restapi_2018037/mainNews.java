package com.example.restapi_2018037;
import java.util.ArrayList;
public class mainNews {
    private String status;
    private String totalResults;
    private ArrayList<mainNews> articles;
    public mainNews(String status, String totalResults,
                    ArrayList<mainNews> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }
    public ArrayList<mainNews> getArticles() {
        return articles;
    }
    public void setArticles(ArrayList<mainNews> articles) {
        this.articles = articles;
    }
}

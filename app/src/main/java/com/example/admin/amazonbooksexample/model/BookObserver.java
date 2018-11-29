package com.example.admin.amazonbooksexample.model;

import java.util.List;

public class BookObserver {
    public interface Callback{
        void onNext(List<Book> books);
        void onError(String error);
    }
    Callback callback;

    public static BookObserver addCallback(Callback callback){
        BookObserver bookObserver = new BookObserver();
        bookObserver.setCallback(callback);
        return bookObserver;
    }
    private void setCallback(Callback callback){this.callback = callback;}


}

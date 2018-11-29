package com.example.admin.amazonbooksexample.model.data.remote;

import com.example.admin.amazonbooksexample.model.Book;
import com.example.admin.amazonbooksexample.utils.NetworkAPI;

import java.util.List;
import io.reactivex.Observable;

import retrofit2.http.GET;

public interface RemoteService {

    @GET (NetworkAPI.PATH)
    Observable<List<Book>> getBooks();
}

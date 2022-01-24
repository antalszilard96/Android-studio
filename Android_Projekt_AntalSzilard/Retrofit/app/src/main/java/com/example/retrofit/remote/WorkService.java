package com.example.retrofit.remote;

import com.example.retrofit.model.Work;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface WorkService {

    @GET("api/works/")
        Call<Work> getWorks();
    @POST("api/works/")
        Call<Work> addWork(@Body Work work);
    @PUT("api/works/{id}")
    Call<Work> updateWork(@Path("id") int id, @Body Work work);
    @DELETE("api/works/{id}")
        Call<Work> deleteWork(@Path("id") int id);



}

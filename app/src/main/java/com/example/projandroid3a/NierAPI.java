package com.example.projandroid3a;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NierAPI {
    @GET("Nier%3AAutomata-API.json")
    Call<RestNierAPIResponse> getNierResponse();
}

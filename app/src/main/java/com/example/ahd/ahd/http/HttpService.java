package com.example.ahd.ahd.http;

import com.example.ahd.ahd.bean.ShouYe;
import java.util.Map;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface HttpService {
    @POST("/qszapi/homePageInfo")
    @FormUrlEncoded
    Observable<ShouYe>postShouYe(@FieldMap Map<String, String> map);
}

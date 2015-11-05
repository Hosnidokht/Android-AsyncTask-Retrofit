package android.mors.com.retrofitimages;

import android.mors.com.retrofitimages.model.Flower;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by mohammad on 11/5/15.
 */
public interface FlowersApi {

    @GET("/feeds/flowers.json")
    public void getFeed(Callback<List<Flower>> response);
}

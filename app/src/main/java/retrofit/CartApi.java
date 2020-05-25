package retrofit;

import java.util.List;

import model.MyProductData;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CartApi {

    @GET("getdata.php")
    Call<List<MyProductData>> getProductData();
}

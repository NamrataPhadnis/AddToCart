package retrofit;

import retrofit.CartApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Myretrofit {

    private static final String BASE_URL="https://softinfitechvilla.000webhostapp.com/add_to_cart/getdata/";
    private static retrofit.Myretrofit myClient;
    private Retrofit retrofit;

    private Myretrofit(){

        retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }
    public static synchronized retrofit.Myretrofit getInstance(){
        if (myClient==null){
            myClient=new retrofit.Myretrofit();
        }
        return myClient;
    }
    public CartApi getMyApi(){
        return retrofit.create(CartApi.class);
    }

}

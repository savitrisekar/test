package com.example.user.register;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface NetworkService {

    @POST("api/registrasi")
    Call<ResponseBody> registerRequest(@Field("nama") String nama,
                                       @Field("email") String email,
                                       @Field("no_wa") String noWa,
                                       @Field("no_telepon") String noTlp,
                                       @Field("alamat") String alamat);
}

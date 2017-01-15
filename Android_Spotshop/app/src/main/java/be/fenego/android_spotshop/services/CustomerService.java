package be.fenego.android_spotshop.services;

import be.fenego.android_spotshop.models.Address;
import be.fenego.android_spotshop.models.Addresses;
import be.fenego.android_spotshop.models.Customer;
import be.fenego.android_spotshop.models.CustomerFew;
import be.fenego.android_spotshop.models.PasswordChange;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Thijs on 5/01/2017.
 */

public interface CustomerService {
    @GET("customers/-")
    Call<Customer> getUserInformation();

    @POST("customers")
    Call<Customer> createCustomer(@Body Customer customer);

    @PUT("customers/-")
    Call<Customer> updateCustomer(@Body CustomerFew customer);

    @PUT("customers/-/credentials/password")
    Call<Customer> updatePassword(@Body PasswordChange password);


    @GET("customers/-/addresses")
    Call<Addresses> getCustomerAddresses();

    @GET("customers/-/addresses/{address-id}")
    Call<Address> getCustomerAddress(@Path("address-id") String addressId);



    /*{
        "password": "!InterShop00!"
    }

    {
        "customerNo": "Patricia1",
            "firstName" : "Patricia",
            "lastName" : "blubb",
            "email" : "patricia@test.intershop.de",
            "preferredLanguage" : "de_DE"
    }*/

}
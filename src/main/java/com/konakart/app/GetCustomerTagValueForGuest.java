package com.konakart.app;

/**
 *  The KonaKart Custom Engine - GetCustomerTagValueForGuest - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetCustomerTagValueForGuest
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetCustomerTagValueForGuest(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public String getCustomerTagValueForGuest(int customerId, String tagName) throws KKException
     {
         return kkEng.getCustomerTagValueForGuest(customerId, tagName);
     }
}
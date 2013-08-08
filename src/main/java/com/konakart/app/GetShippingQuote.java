package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetShippingQuote - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetShippingQuote
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetShippingQuote(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public ShippingQuoteIf getShippingQuote(OrderIf order, String moduleName, int languageId) throws KKException
     {
         return kkEng.getShippingQuote(order, moduleName, languageId);
     }
}
package com.konakart.app;

import java.math.BigDecimal;

/**
 *  The KonaKart Custom Engine - GetTaxRate - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetTaxRate
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetTaxRate(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public BigDecimal getTaxRate(int countryId, int zoneId, int taxClassId) throws KKException
     {
         return kkEng.getTaxRate(countryId, zoneId, taxClassId);
     }
}
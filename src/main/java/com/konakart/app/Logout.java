package com.konakart.app;

/**
 *  The KonaKart Custom Engine - Logout - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class Logout
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public Logout(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public void logout(String sessionId) throws KKException
     {
         kkEng.logout(sessionId);
     }
}
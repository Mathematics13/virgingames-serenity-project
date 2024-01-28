package com.virgingames.model;

public class GamesAPIRequest
{
    public static GamesPojo getAPIGamesRequest(String id,String name,String currency,double amount)
    {
        GamesPojo gamesPojo = new GamesPojo();

        if(id != null)
        {
            gamesPojo.setId(id);                                  //Using setters to set values of the parameters ,if not null/empty
        }

         if(name != null) {
             gamesPojo.setName(name);
         }

         if(currency != null) {
             gamesPojo.setCurrency(currency);
         }

         if(amount > 0)
         {
             gamesPojo.setAmount(amount);
         }
         return gamesPojo;

    }
}

package com.example.finalproject;

public class Hobbies {

    private String HobbiesName;
    private String HobbiesIngredients;
    private String HobbiesMethodTitle;
    private String Hobby;
    private int Thumbnail;


    public  Hobbies(String name, String hobbiesIngredients, String hobbiesMethodTitle, String hobby, int thumbnail) {

       HobbiesName = name;
       HobbiesIngredients = hobbiesIngredients;
       HobbiesMethodTitle = hobbiesMethodTitle;
       Hobby = hobby;
       Thumbnail = thumbnail;

    }


    public  String getHobbiesName(){

        return HobbiesName;
    }
    public  String getHobbiesIngredients(){
        return HobbiesIngredients;
    }

  public String getHobbiesMethodTitle(){
        return HobbiesMethodTitle;
  }

  public String getHobby(){
        return Hobby;
  }

  public int getThumbnail(){
        return  Thumbnail;
  }

}

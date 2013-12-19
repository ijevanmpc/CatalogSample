package com.mpci.catalogsample;

public class ListData {
    String name;       //User name
    int age;          //User age
    int image;       //Link to image
    String discribe; //HTML description names
    
    

    ListData(String _name, int _age, int _image, String _discribe) {
      name = _name;
      age = _age;
      image = _image;     
      discribe=_discribe;
    }
}
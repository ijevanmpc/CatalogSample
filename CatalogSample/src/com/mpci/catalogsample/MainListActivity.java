package com.mpci.catalogsample;


import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
/**
 * This activity is used to put images and text in array
 * 
 * @authors Hovik & Roza
 */
 
public class MainListActivity extends ListActivity {
    
   
    private ArrayList<ListData> catalog;
    /* 
     * This are names array
     */
    String[] names = { "Hovik Beglaryan", "Serine Bejanyan", "Lilit Antonyan",
            "Artush Markosyan", "Artak Niazyan", "Roza Martirosyan"};
    /*
     * HTML description names
     */
String[] desc = {"<h1>Hovik Beglaryan</h1> <center><img src=\"hov.jpg\"></center>", 
       
        "<h1>Serine Bejanyan</h1>", "<h1>Lilit Antonyan</h1>",
        "<h1>Artush Markosyan</h1>", "<h1>Artak Niazyan</h1>",
        "<h1>Roza Martirosyan</h1>"};
      /*
       *This are ages array                      
       */
    int[] age={30,21,20,22,24,22};
    /*
     *This are images array                      
     */
    
    int[] img={R.drawable.hov,R.drawable.ser,R.drawable.lil,
                    R.drawable.art,R.drawable.artk,R.drawable.roz}; 
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        /*
         *Create an array of objects ListData and fill them with data                  
         */
        catalog = new ArrayList<ListData>();
        for (int i = 0; i <names.length ; i++) 
        {
        	
        		 catalog.add(new ListData(names[i], age[i], img[i],desc[i]));
            		
        }
 
        /*
         * Create a data adapter
         */
        CatalogAdapter catalogAdapter;
        catalogAdapter = new CatalogAdapter(this, catalog);
        setListAdapter(catalogAdapter);
    }    
    
}

package com.mpci.catalogsample;


import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
 
public class MainListActivity extends ListActivity {
    /** Called when the activity is first created. */
   
    private ArrayList<ListData> catalog;
    String[] names = { "Hovik Beglaryan", "Serine Bejanyan", "Lilit Antonyan",
            "Artush Markosyan", "Artak Niazyan", "Roza Martirosyan"};
String[] desc = {"<h1>menejer</h1> <center><img src=\"hov.jpg\"></center><p>menejer <b>menejer</b>!!!</p>", 
       
        "<h1>menejer</h1>", "<h1>menejer</h1>",
        "<h1>menejer</h1>", "<h1>menejer</h1>",
        "<h1>menejer</h1>"};
                           
    int[] age={30,21,20,22,24,22};
    int[] img={R.drawable.hov,R.drawable.ser,R.drawable.lil,
                    R.drawable.art,R.drawable.artk,R.drawable.roz}; 
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
 
        catalog = new ArrayList<ListData>();
        for (int i = 0; i <names.length ; i++) 
        {
        	
        		 catalog.add(new ListData(names[i], age[i], img[i],desc[i]));
                 Log.i("porc", catalog.get(i).toString());
        		   
        		
        }
 
        
        CatalogAdapter catAdapter;
        catAdapter = new CatalogAdapter(this, catalog);
        setListAdapter(catAdapter);
    }    
    
}

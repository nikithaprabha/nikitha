class Series{

   
   static String hindiSeries[] = {"Farzi" ,"Undekhi" ,"Paatal Lok" ,"Girls Hostel" ,"Undekhi" ,"Aashram" ,"Anupamaa" ,"C.I.D." ,"Gullak" ,"Mismatched" };
   static String kannadaSeries[] = {"Amruthadhare" ,"Karimani" ,"Seetha Raama" ,"Aase" ,"Naagin" ,"Mahabharat" ,"Gattimela" ,"Tenali Rama" ,"Brahmagantu" ,"Ramachaari" };
   static String malayalamSeries[] = {"1000 Babies" ,"Marimayam" ,"Patharamattu" ,"Poacher" ,"Mounaragam" ,"Manorathangal" ,"Masterpeace" ,"Mizhirandilum" ,"Mangalyam" ,"Kumkumapoovu" };
   static String englishSeries[] = {"tvd" ,"last ship" ,"under the dome" ,"stranger things" ,"wednesday" ,"river diale" ,"13 reasons why" ,"game of thrones" ,"the family man" ,"money heist"  };
   
   
            public static void main (String k[]){
   
                  System.out.println("main starts");
				  
				      gethindiSeries();
				      getkannadaSeries();
				      getmalayalamSeries();
				      getenglishSeries();
				 System.out.println("main ends"); 
			}
			
			
			
		//logic for hindiSeries
		
		public static void gethindiSeries(){
			
		System.out.println("inside the list()");
			System.out.println("list of Hindi Series avaiable in netflix and colours are:  ");
		
			for(String series1 : hindiSeries ){
			
			  System.out.println(series1);	
			}
		System.out.println("end of new list()");	
			}
			
		//logic for kannada Series	
			
		public static void getkannadaSeries(){
			
			System.out.println("inside the list()");
			System.out.println("list of kannada Series avaiable in  colours are:  ");
		
			for(String series2 : kannadaSeries ){
			
			  System.out.println(series2);	
				
			}
			System.out.println("end of new list()");
			}	
	    //logic for malayalamSeries


        public static void getmalayalamSeries(){
			
			System.out.println("inside the list()");
			System.out.println("list of malayalam Series avaiable in  hotstar are:  ");
		
			for(String series3 : malayalamSeries ){
			
			  System.out.println(series3);	
			}	
				System.out.println("end of new list()");	
			}	
        //logic for english Series
		
		
		
        public static void getenglishSeries(){
			
			System.out.println("inside the list()");
			System.out.println("list of english Series avaiable in  prime and netflix are:  ");
		
			for(String series4 : englishSeries ){
			
			  System.out.println(series4);	
			}
			System.out.println("end of new list()");
			}	

     





}


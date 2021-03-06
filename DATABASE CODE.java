package finalist;

/*
 * Developer:	Allan Benjamin Katamba & Brian Kakembo
 * Date:		25th February 2019
 */
public class finalistscode {
	public static void main(String[] args) {
		//This is where program execution starts, we first instantiate the class and use the object to call the method in the class
		finalistscode obj = new finalistscode(); 
		obj.generatePhonetics();
	}
	
	private static String parsePhoneme(String word) {
	    StringBuilder buffer = new StringBuilder();
	    char[] letters = word.toCharArray();
	    
	    int i = 0, j = 1;
	    while (j < letters.length) {
	      if (Character.compare(letters[i], letters[j]) == 0) {
	    	  if(letters[i] == 'n' && letters[j+1] =='y' ){
	    		  buffer.append("ɲ:");
	    		  i+=2; j+=2;
	    	  }
	    	  
	    	  else{
	    		  if(letters[i] == 'y') { 
	    			  buffer.append('j').append(":");
	    			 i++;j++;
	    		  }
	    	  
	    	  else{
	    		  if(letters[i] == 'j') { 
	    			  buffer.append('ɟ').append(":");
	    			 i++;j++;
	    		  }
	    		   
	    		 
	    		  
	    		  
	    		  
	    		  else {
	    			  buffer.append(letters[i]).append(":");
		    		  i++; j++;
	    		  }
	    		  } 
	    	  }
	    	  }
	    		  
	      else if(letters[i] == 'n' && letters[j] == 'k' && letters[j+1] == 'i') {
	    	  buffer.append("ɲci");
	    	  i+=2; j+=2;
	      }
	        else if( letters[i] == 'n' && ( letters[j] == 'k' || letters[j] == 'j')){
	    	  buffer.append('ɲ').append(letters[j]);
	    	  i++; j++;
	      }
	      
	    	 
	        else if( letters[i] == 's'  && letters[j] == 'h') {
	        	buffer.append('ʃ');
	        	i++; j++;
	        }
	      
	        else if( letters[i] == 'n'  && letters[j] == 'y') {
	        	buffer.append('ɲ');
	        	i++; j++;
	        }
	      else if( letters[i] == 'n' && letters[j] == 'f' ){
	    	  buffer.append('ɱ').append("fʷ");
	    	  i++; j++;
	      }
	    	  else if( letters[i] == 'm' && letters[j] == 'b' ){
		    	  buffer.append('ɱ').append("b");
		    	  i++; j++;
	    	  }
		    	  
		    	  else if( letters[i] == 'm' && letters[j] == 'p' ){
			    	  buffer.append('ɱ').append("p");
			    	  i++; j++;
			    	  
	      }
	      else if( letters[i] == 'n' && letters[j] == 'v' ){
	    	  buffer.append('ɱ').append("vʷ");
	    	  i++; j++;
	      }
	    	  else if( letters[i] == 'n' && letters[j] == 's' ){
		    	  buffer.append('ɲ').append("s");
		    	  i++; j++;
	    	  }
		    	  else if( letters[i] == 'n' && letters[j] == 't' ){
			    	  buffer.append('ɲ').append("t");
			    	  i++; j++; 
		    	  }
			    	  else if( letters[i] == 'n' && letters[j] == 'z' ){
				    	  buffer.append('ɲ').append("z");
				    	  i++; j++;
			    	  }
				    	  else if( letters[i] == 'n' && letters[j] == 'd' ){
					    	  buffer.append('ɲ').append("d");
					    	  i++; j++;
				    	  }
				    	  else if( letters[i] == 'n' && letters[j] == 'c' ){
					    	  buffer.append('ɲ').append("c");
					    	  i++; j++;
	      }
	      else if( letters[i] == 'n' && letters[j] == 'g' ){
	    	  buffer.append('ŋ').append(letters[j]);
	    	  i++; j++;
	      }
	      else if( letters[i] == 'g' && letters[j] == 'y' ){
	    	  buffer.append('ɟ');
	    	  i++; j++;
	    	  
	      }
	      else if( letters[i] == 'k' && letters[j] == 'y' ){
	    	  buffer.append('c');
	    	  i++; j++;
	     
	      }
	      //if the word is arusha then output is arusha
	      else if( letters[i] == 'a' && letters[j] == 'r' && letters[j+1] == 'u' && letters[j+2] == 's' && letters[j+3] == 'h' && 
	    		  letters[j+4] == 'a'){
	    	  buffer.append("aruʃa");
	    	  i+=3; j+=5;
	      }
	    //if the word is mbarara then output is mβarara
	      else if( letters[i] == 'm' && letters[j] == 'b' && letters[j+1] == 'a' && letters[j+2] == 'r' && letters[j+3] == 'a' &&
	    		  letters[j+4] == 'r' && 
	    		  letters[j+5] == 'a'){
	    	  buffer.append("mβaɾaɾa");
	    	  i+=3; j+=6;
	      }
	      else if( letters[i] == 'e' && letters[j] == 'l' ){
	    	  buffer.append('e').append('r');
	    	  i++; j++;
	    	  
	      }
	      else if( letters[i] == 'i' && letters[j] == 'l' ){
	    	  buffer.append('i').append('r');
	    	  i++; j++;
	    	  
	      }
	      else if( letters[i] == 'a' && letters[j] == 'r' ){
	    	  buffer.append('a').append('l');
	    	  i++; j++;
	    	  
	      }
	      else if( letters[i] == 'o' && letters[j] == 'r' ){
	    	  buffer.append('o').append('l');
	    	  i++; j++;
	      }
	    	   
	      else if( letters[i] == 'u' && letters[j] == 'r' ){
	    	  buffer.append('u').append('l');
	    	  i++; j++;
	    	  
	      }
	      
	      else if(letters[i] == 'x') {
	    	  buffer.append("kisi");
	    	  i++;
	      }
	      
	      //if the word is genda then output is ge:nda
	      else if( letters[i] == 'g' && letters[j] == 'e'&& letters[j+1] == 'n' && letters[j+2] == 'd' && letters[j+3] == 'a' ){
	    	  buffer.append("ge:nda");
	    	  i+=3; j+=4;
	    	  
	      }
	      
	      //if the word is box then output is βokisi
	      else if( letters[i] == 'b' && letters[j] == 'o' && letters[j+1] == 'x'  ){
	    	  buffer.append("βokisi");
	    	  i+=3; j+=4;
	    	  
	      }
	      
	      else {
	    	  if(letters[i]=='b') {
	    		  buffer.append("β") ;
	    	  }
	    	  
	    		  else {
	    	    	  if(letters[i]=='r') {
	    	    		  buffer.append("ɾ") ;
	    		
	    		  }
	    	  
	    	  else {
	    		  if(letters[i]=='j') {
	    			  
	    			  buffer.append("ɟ") ;
	    		  }
	    		 
	    		  //else {
	    			 // if(letters[i] == 'x'){
	    				//  buffer.append("kisi");
	    			 // }
	    	  else{
	    				  buffer.append(letters[i]);
	    			   
	    		  }
	    	  }		  
	    	  }
	    	  //add an if and an else
	        
	      }
	      i++; j++;
	      
	      if (j == letters.length) buffer.append(letters[i]);
	      else if (i == letters.length) break;
	    }
	    
	    return buffer.toString();
	  }
	
	//private static String convertLetters(String word { 	
	//}
	
	 private void generatePhonetics()
	 {
		
		 String usersSentence;
		 usersSentence = javax.swing.JOptionPane.showInputDialog("Enter a word or sentence");
	     String wordsInSentence[] = usersSentence.split(" "); 
	     for (String word : wordsInSentence) {
	    		System.out.print(parsePhoneme(word) + " ");
	    	}
	    
	     
	   
	}
}




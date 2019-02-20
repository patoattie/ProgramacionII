/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacita_mecon
 */
public class DVD {
   private List movies=new ArrayList();	
	public DVD(){}
	public List getMovies() {
		return movies;
	}
	public void setMovies(List movies) {
		this.movies = movies;
	}	
	public String toString(){
		String movies="";
		for(Object movie:getMovies()){
                    Movie m;
                    m=(Movie) movie;
			movies += m.getName()+"\n";
		}
		return movies; 
	}	 
}

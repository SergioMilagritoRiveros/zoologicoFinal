import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RatingService {
  

    constructor(private http: HttpClient) { 
  
    }
    rating  = '/Zoologico/api/Rating ';
  
  getRating () {
    return this.http.get(this.rating );
  } 
  getRatingid(id:number) {
    return this.http.get(this.rating +'/'+id);
  }
  deleteRating  (id: number) {
    
    return this.http.delete(this.rating +'/'+id);
  }
  postRating (id2:number, puntuacion2:number,comentarios2:string){
    return this.http.post(this.rating,{id:id2,puntuacion:puntuacion2,comentarios:comentarios2} );
  }
  putRating (idhor:number, puntuacion2:string,comentarios2:string){
    return this.http.put(this.rating +'/'+idhor,{id:idhor,puntuacion:puntuacion2,comentarios:comentarios2});
  }
  }
  
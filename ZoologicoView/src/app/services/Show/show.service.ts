
  import { Injectable } from '@angular/core';
  import { HttpClient } from '@angular/common/http';
  @Injectable({
    providedIn: 'root'
  })
  export class ShowService {
  
    constructor(private http: HttpClient) { 
  
    }
    show = '/Zoologico/api/Show';
  
  getShows() {
    return this.http.get(this.show);
  } 
  getShowsid(id:number) {
    return this.http.get(this.show+'/'+id);
  }
  deleteShow (id: number) {
    
    return this.http.delete(this.show+'/'+id);
  }
  postShow(id:number, show:string){
    return this.http.post(this.show,{show,id});
  }
  putShow(id:number, show:string){
    return this.http.put(this.show+'/'+id,{show,id});
  }
  }
  
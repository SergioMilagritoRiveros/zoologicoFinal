import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { 

  }
  especie = '/Zoologico/api/User';

login() {
  return this.http.get(this.especie);
} 
getUsersid(id:number) {
  return this.http.get(this.especie+'/'+id);
}
deleteUser (id: number) {
  
  return this.http.delete(this.especie+'/'+id);
}
postUser(id:number, especie:string){
  return this.http.post(this.especie,{especie,id});
}
putUser(id:number, especie:string){
  return this.http.put(this.especie+'/'+id,{especie,id});
}
}

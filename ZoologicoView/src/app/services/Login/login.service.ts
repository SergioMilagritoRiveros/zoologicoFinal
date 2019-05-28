import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { 

  }
  user = '/Zoologico/api/User';

login() {
  return this.http.get(this.user);
} 
getUsersid(id:number) {
  return this.http.get(this.user+'/'+id);
}
deleteUser (id: number) {
  
  return this.http.delete(this.user+'/'+id);
}
postUser(id:number, user:string){
  return this.http.post(this.user,{user,id});
}
putUser(id:number, user:string){
  return this.http.put(this.user+'/'+id,{user,id});
}
}

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
postUser(id23:number, apellido:string, contrasena:string, correo:string, nombre:string, tipo_user:string){
  return this.http.post(this.user,{apellido: apellido,contrasena: contrasena,correoElectronico: correo,id: id23,nombre: nombre,tipoUser: tipo_user});
}
putUser(id:number, user:string){
  return this.http.put(this.user+'/'+id,{user,id});
}
}

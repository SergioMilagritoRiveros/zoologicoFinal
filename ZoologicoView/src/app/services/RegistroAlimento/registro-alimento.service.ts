import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class RegistroAlimentoService {

  constructor(private http: HttpClient) { 

  }
  registroAlimento = '/Zoologico/api/RegistroAlimento';

  getRegistroAlimentos() {
  return this.http.get(this.registroAlimento);
} 
getRegistroAlimentosid(id:number) {
  return this.http.get(this.registroAlimento+'/'+id);
}
deleteRegistroAlimento (id: number) {
  
  return this.http.delete(this.registroAlimento+'/'+id);
}
postRegistroAlimento(id:number, registroAlimento:string){
  return this.http.post(this.registroAlimento,{registroAlimento,id});
}
putRegistroAlimento(id:number, registroAlimento:string){
  return this.http.put(this.registroAlimento+'/'+id,{registroAlimento,id});
}
}

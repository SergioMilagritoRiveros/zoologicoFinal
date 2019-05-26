import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HorarioAlimentacionService {

  constructor(private http: HttpClient) { 

  }
  horarioALimentacion = '/Zoologico/api/Genero';

getGeneros() {
  return this.http.get(this.horarioALimentacion);
} 
getGenerosid(id:number) {
  return this.http.get(this.horarioALimentacion+'/'+id);
}
deleteGenero (id: number) {
  
  return this.http.delete(this.horarioALimentacion+'/'+id);
}
postGenero(id:number, horarioALimentacion:string){
  return this.http.post(this.horarioALimentacion,{horarioALimentacion,id});
}
putGenero(id:number, horarioALimentacion:string){
  return this.http.put(this.horarioALimentacion+'/'+id,{horarioALimentacion,id});
}
}

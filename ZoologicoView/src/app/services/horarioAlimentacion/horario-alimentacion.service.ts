import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HorarioAlimentacion } from 'app/interfaces/horarioAlimentacion.interface';

@Injectable({
  providedIn: 'root'
})
export class HorarioAlimentacionService {

  constructor(private http: HttpClient) { 

  }
  horarioALimentacion = '/Zoologico/api/HorarioAlimentacion';

getHorarioAlimentacion() {
  return this.http.get(this.horarioALimentacion);
} 
getHorarioAlimentacionid(id:number) {
  return this.http.get(this.horarioALimentacion+'/'+id);
}
deleteHorarioAlimentacion (id: number) {
  
  return this.http.delete(this.horarioALimentacion+'/'+id);
}
postHorarioAlimentacion(id2:number, desyuno:string,comida:string){
  
  var horari:HorarioAlimentacion={
    horaComida:comida,
    horaDesayuno:desyuno,
    id:id2
  }
  console.log(horari);
  return this.http.post(this.horarioALimentacion,horari);
}
putHorarioAlimentacion(idhor:number, desayuno:string,comida:string){
  return this.http.put(this.horarioALimentacion+'/'+idhor,{comida,desayuno,idhor});
}
}

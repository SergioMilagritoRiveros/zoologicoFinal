import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TipoEmpleadoService {

  constructor(private http: HttpClient) { }
  tipoEmpleado = '/Zoologico/api/TipoEmpleado';

getTipoEmpleado() {
  return this.http.get(this.tipoEmpleado);
} 
getTipoEmpleadoid(id:number) {
  return this.http.get(this.tipoEmpleado+'/'+id);
}
deleteTipoEmpleado (id: number) {
  
  return this.http.delete(this.tipoEmpleado+'/'+id);
}
postTipoEmpleado(id2:number, horasDiarias2:number, ocupacion2: string, salario2: number){
  console.log({horasDiarias2,id2,ocupacion2,salario2});
  return this.http.post(this.tipoEmpleado,{horasDiarias:horasDiarias2,id:id2,ocupacion:ocupacion2,salario:salario2});
}
putTipoEmpleado(id:number, horasDiarias:number, ocupacion: string, salario: number){
  return this.http.put(this.tipoEmpleado+'/'+id,{id,horasDiarias,ocupacion,salario});
}
}

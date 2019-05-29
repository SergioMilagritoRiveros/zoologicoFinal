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
postTipoEmpleado(id:number, horasDiarias:number, ocupacion: string, salario: number){
  return this.http.post(this.tipoEmpleado,{id,horasDiarias,ocupacion,salario});
}
putTipoEmpleado(id:number, horasDiarias:number, ocupacion: string, salario: number){
  return this.http.put(this.tipoEmpleado+'/'+id,{id,horasDiarias,ocupacion,salario});
}
}

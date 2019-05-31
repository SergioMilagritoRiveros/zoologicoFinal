import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EmpleadoService {

  constructor(private http: HttpClient) { 

  }
  empleado = '/Zoologico/api/Empleado';

getEmpleados() {
  return this.http.get(this.empleado);
} 
getEmpleadosid(id:number) {
  return this.http.get(this.empleado+'/'+id);
}
deleteEmpleado (id: number) {
  
  return this.http.delete(this.empleado+'/'+id);
}
postEmpleado(id:number, empleado:string){
  return this.http.post(this.empleado,{empleado,id});
}
putEmpleado(id:number, empleado:string){
  return this.http.put(this.empleado+'/'+id,{empleado,id});
}
}

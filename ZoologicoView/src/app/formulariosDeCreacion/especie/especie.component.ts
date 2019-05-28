import { Component, OnInit } from '@angular/core';
import { EspecieService } from 'app/services/Especie/especie.service';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
declare var $ :any;
declare var informacion2:any[];
@Component({
  selector: 'app-especie',
  templateUrl: './especie.component.html',
  styleUrls: ['./especie.component.css']
})
export class EspecieComponent implements OnInit {
  informacion :any;
  idCrear:number;
  especieCrear:string='';
  idActualizar:number;
  especieActualizar:string;
 

  constructor(private _especieService:EspecieService,private _UserService: UserService, private router: Router) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._especieService.getEspecies().subscribe((data) => {
      console.log(data),
      this.informacion=data,
       this.idCrear=this.informacion.length+1
     });
  }
  eliminar(id:number) {
    this._especieService.deleteEspecie(id).subscribe(data=>{
      this.ngOnInit();
      $('#tablex').load()});
    
  }

  crear(){
    this.especieCrear=$('#Especie').val();
    if (this.especieCrear!='') {
      this._especieService.postEspecie(this.idCrear,this.especieCrear).subscribe(data=>{
        this.ngOnInit();
        $('#tablex').load();
        $('#crearf').load();
        
      });
    }else{
      this.showNotification('top','rigth')
    }
   
  }
  actualizarFormulario(id:number){
   this._especieService.getEspeciesid(id).subscribe(data=>{
    this.idActualizar=data['id'];
    this.especieActualizar=data['especie'];
   });
  }
  actualizar(){
    this._especieService.putEspecie(this.idActualizar,this.especieActualizar).subscribe(data=>{
      this.ngOnInit();
      $('#tablex').load();
      $('#actualizarf').load();});
  }
  showNotification(from, align){
    const type = ['','info','success','warning','danger'];

    const color = Math.floor((Math.random() * 4) + 1);

    $.notify({
        icon: "notifications",
        message: "Especie vacio , porfavor ingrese un valor <br>en la descripcion del especie"

    },{
        type: type[color],
        timer: 4000,
        placement: {
            from: from,
            align: align
        },
        template: '<div data-notify="container" class="col-xl-4 col-lg-4 col-11 col-sm-4 col-md-4 alert alert-{0} alert-with-icon" role="alert">' +
          '<button mat-button  type="button" aria-hidden="true" class="close mat-button" data-notify="dismiss">  <i class="material-icons">close</i></button>' +
          '<i class="material-icons" data-notify="icon">notifications</i> ' +
          '<span data-notify="title">{1}</span> ' +
          '<span data-notify="message">{2}</span>' +
          '<div class="progress" data-notify="progressbar">' +
            '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
          '</div>' +
          '<a href="{3}" target="{4}" data-notify="url"></a>' +
        '</div>'
    });
}
}

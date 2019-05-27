import { Component, OnInit } from '@angular/core';
import { HorarioAlimentacionService } from 'app/services/horarioAlimentacion/horario-alimentacion.service';

declare var $:any;
@Component({
  selector: 'app-horario-alimentacion',
  templateUrl: './horario-alimentacion.component.html',
  styleUrls: ['./horario-alimentacion.component.scss']
})
export class HorarioAlimentacionComponent implements OnInit {
  informacion :any;
  idCrear:number;
  horarioDesayunoCrear:string='';
  horarioComidaCrear:string='';
  constructor(private _horarioAlimentacionService:HorarioAlimentacionService) { }

  ngOnInit() {
    this._horarioAlimentacionService.getHorarioAlimentacion().subscribe((data) => {
      console.log(data),
      this.informacion=data,
       this.idCrear=this.informacion.length+1
     });
  }
  eliminar(id:number) {
    this._horarioAlimentacionService.deleteHorarioAlimentacion(id).subscribe(data=>{
      this.ngOnInit();
      $('#tablex').load()});
    
  }
  crear(){
    
    
    if ($('#desyuno').val()!='' && $('comida').val()!='' ) {
      this._horarioAlimentacionService.postHorarioAlimentacion(this.idCrear,$('#desyuno').val(),$('#comida').val()).subscribe(data=>{
        this.ngOnInit();
        $('#tablex').load();
        $('#crearf').load();
        
      });
    }else{
      this.showNotification('top','rigth')
    }
   
  }
  showNotification(from, align){
    const type = ['','info','success','warning','danger'];

    const color = Math.floor((Math.random() * 4) + 1);

    $.notify({
        icon: "notifications",
        message: "Horario de alimentacion vacio , porfavor ingrese un valor <br>en el horario de desayuno y/o comida"

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

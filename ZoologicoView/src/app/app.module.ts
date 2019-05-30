import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app.routing';
import { AppComponent } from './app.component';
import { IndexComponent } from './index/index.component';
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { UserLayaoutComponent } from './layouts/user-layaout/user-layaout.component';
import { AnimalesViewComponent } from './AnimalesView/AnimalesView.component';
import { RatingComponent } from './formulariosDeCreacion/rating/rating.component';
import { ShowsViewComponent } from './shows-view/shows-view.component';
import { ShowComponent } from './formulariosDeCreacion/show/show.component';
import { RegistroAlimentoComponent } from './formulariosDeCreacion/registro-alimento/registro-alimento.component';
import { EspacioComponent } from './formulariosDeCreacion/espacio/espacio.component';






@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    RouterModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  declarations: [
    AppComponent,
    AdminLayoutComponent,
    UserLayaoutComponent,
    IndexComponent,
    AnimalesViewComponent,
    RatingComponent,
    ShowsViewComponent,
    ShowComponent,
    RegistroAlimentoComponent,
    EspacioComponent,
  
    

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

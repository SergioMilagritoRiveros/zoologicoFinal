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
import { AnimalViewComponent } from './animal-view/animal-view.component';

import { RatingComponent } from './formulariosDeCreacion/rating/rating.component';
import { ShowsViewComponent } from './shows-view/shows-view.component';
import { EmpleadoComponent } from './formulariosDeCreacion/empleado/empleado.component';




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
    AnimalViewComponent,
    RatingComponent,
    ShowsViewComponent,
    EmpleadoComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

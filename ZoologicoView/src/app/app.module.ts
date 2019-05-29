import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app.routing';


import { AppComponent } from './app.component';
import { IndexComponent } from './index/index.component';
import { AgmCoreModule} from '@agm/core';

import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';

import { UserLayaoutComponent } from './layouts/user-layaout/user-layaout.component';
import { AnimalesViewComponent } from './AnimalesView/AnimalesView.component';




@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    RouterModule,
    AppRoutingModule,
    HttpClientModule,
    AgmCoreModule.forRoot({
      apiKey: 'YOUR_GOOGLE_MAPS_API_KEY'
    })

  ],
  declarations: [
    AppComponent,
    AdminLayoutComponent,
    UserLayaoutComponent,
    IndexComponent,
    AnimalesViewComponent,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

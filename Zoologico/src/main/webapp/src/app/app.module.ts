import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { AnimalesComponent } from './animales/animales.component';
import { GeneroComponent } from './genero/genero.component';
import { EspecieComponent } from './especie/especie.component';
import { TipoAnimalComponent } from './tipo-animal/tipo-animal.component';
import { IndexComponent } from './index/index.component';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SidebarComponent,
    AnimalesComponent,
    GeneroComponent,
    EspecieComponent,
    TipoAnimalComponent,
    IndexComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

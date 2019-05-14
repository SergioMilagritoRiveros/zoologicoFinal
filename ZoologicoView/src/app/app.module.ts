import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { AnimalesComponent } from './animales/animales.component';
import { GeneroComponent } from './genero/genero.component';
import { EspecieComponent } from './especie/especie.component';
import { TipoAnimalComponent } from './tipo-animal/tipo-animal.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SidebarComponent,
    AnimalesComponent,
    GeneroComponent,
    EspecieComponent,
    TipoAnimalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

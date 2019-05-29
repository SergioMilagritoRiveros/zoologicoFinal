import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule  } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';
import { IndexComponent } from './index/index.component';


import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { UserLayaoutComponent } from './layouts/user-layaout/user-layaout.component';
import { AnimalesViewComponent } from './AnimalesView/AnimalesView.component';
import { RatingComponent } from './formulariosDeCreacion/rating/rating.component';
const routes: Routes =[
  {
    path:'rating',
    component:RatingComponent
  },
  {
    path:'animelesView',
    component:AnimalesViewComponent
  },
  {
    path: '',
    component: IndexComponent
  },
  {
    path: 'dasboard',
    redirectTo: 'dashboard',
    pathMatch: 'full',
  }, {
    path: '',
    component: AdminLayoutComponent,
    children: [
        {
      path: '',
      loadChildren: './layouts/admin-layout/admin-layout.module#AdminLayoutModule'
  }, {
    path: 'dashboardUser',
    component: UserLayaoutComponent,
    children: [
        {
      path: '',
      loadChildren: './layouts/user-layaout/user-layaout.module#UserLayaoutModule'
  }]}
]
}
    // { path: 'dashboard',      component: DashboardComponent },
    // { path: 'user-profile',   component: UserProfileComponent },
    // { path: 'table-list',     component: TableListComponent },
    // { path: 'typography',     component: TypographyComponent },
    // { path: 'icons',          component: IconsComponent },
    // { path: 'maps',           component: MapsComponent },
    // { path: 'notifications',  component: NotificationsComponent },
    // { path: 'upgrade',        component: UpgradeComponent },
    // { path: '',               redirectTo: 'dashboard', pathMatch: 'full' }
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  exports: [
  ],
})
export class AppRoutingModule { }

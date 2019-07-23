import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { HomeComponent } from '../home/home.component';
import { StartComponent } from '../start/start.component';
import { ContinueComponent } from '../continue/continue.component';
import { ReviewComponent } from '../review/review.component';
import { ManagerComponent } from '../manager/manager.component';
import { ContactComponent } from '../contact/contact.component';
import { HelpComponent } from '../help/help.component';
import { HeaderComponent } from '../header/header.component';
import { FooterComponent } from '../footer/footer.component';
import { AdminComponent } from '../admin/admin.component'

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'start',
    component: StartComponent
  },
  {
    path: 'continue',
    component: ContinueComponent
  },
  {
    path: 'review',
    component: ReviewComponent
  },
  {
    path: 'manager',
    component: ManagerComponent
  },
  {
    path: 'contact',
    component: ContactComponent
  },
  {
    path: 'help',
    component: HelpComponent
  },
  {
    path: 'admin',
    component: AdminComponent
  },
];

@NgModule({
  imports: [CommonModule, RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }



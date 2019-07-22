import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home/home.component';
import { StartComponent } from 'src/start/start.component';
import { ContinueComponent } from 'src/continue/continue.component';
import { ReviewComponent } from 'src/review/review.component';
import { ManagerComponent } from 'src/manager/manager.component';
import { ContactComponent } from 'src/contact/contact.component';
import { HelpComponent } from 'src/help/help.component';

const routes: Routes = [
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
];

@NgModule({
  imports: [CommonModule, RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }

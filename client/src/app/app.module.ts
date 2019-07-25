import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StartComponent } from '../start/start.component';
import { ContinueComponent } from '../continue/continue.component';
import { ReviewComponent } from '../review/review.component';
import { ManagerComponent } from '../manager/manager.component';
import { AdminComponent } from '../admin/admin.component';
import { ContactComponent } from '../contact/contact.component';
import { HelpComponent } from '../help/help.component';
import { HomeComponent } from '../home/home.component';
import { FormsModule } from '@angular/forms';
import { ProfileComponent } from '../profile/profile.component';
import { LoginComponent } from '../login/login.component';
import { RegisterComponent } from '../register/register.component';
// import { HeaderComponent } from '../header/header.component';
// import { FooterComponent } from '../footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    StartComponent,
    ContinueComponent,
    ReviewComponent,
    ManagerComponent,
    AdminComponent,
    ContactComponent,
    HelpComponent,
    HomeComponent,
    ProfileComponent,
    LoginComponent,
    RegisterComponent,
    // HeaderComponent,
    // FooterComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}




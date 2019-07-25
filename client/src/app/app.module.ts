import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
// import { HelpComponent } from './help/help.component';
import { HelpModule } from './help/help.module';
import { ContactComponent } from './contact/contact.component';

const rootRouting: ModuleWithProviders = RouterModule.forRoot([], { useHash: true });

=======
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
>>>>>>> d1f02cbc7e7499df316d55d71b1fac3922194155

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
=======
    StartComponent,
    ContinueComponent,
    ReviewComponent,
    ManagerComponent,
    AdminComponent,
>>>>>>> d1f02cbc7e7499df316d55d71b1fac3922194155
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
<<<<<<< HEAD
    HelpModule,
    rootRouting,
=======
    HttpClientModule,
>>>>>>> d1f02cbc7e7499df316d55d71b1fac3922194155
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}




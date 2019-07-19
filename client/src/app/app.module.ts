import { ModuleWithProviders } from '@angular/compiler/src/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// import { HelpComponent } from './help/help.component';
import { HelpModule } from './help/help.module';
import {
  FooterComponent,
  HeaderComponent,
  SharedModule
} from './shared';
import { ContactComponent } from './contact/contact.component';

const rootRouting: ModuleWithProviders = RouterModule.forRoot([], { useHash: true });


@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    ContactComponent,
    // HelpComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HelpModule,
    rootRouting,
    SharedModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

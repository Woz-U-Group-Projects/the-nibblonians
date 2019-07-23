import { ModuleWithProviders, NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { HelpComponent } from './help.component';
import { SharedModule } from '../shared';

const helpRouting: ModuleWithProviders = RouterModule.forChild([
  {
    path: '',
    component: HelpComponent
  }
]);

@NgModule({
  imports: [
    helpRouting,
    SharedModule
  ],
  declarations: [
    HelpComponent
  ],
  providers: []
})
export class HelpModule {}



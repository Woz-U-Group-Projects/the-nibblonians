import { enableProdMode } from '@angular/core';
import { platformBrowser } from '@angular/platform-browser';

import { AppModule } from './app/app.module';
import { environment } from '../../environments/environment';

if (environment.production) {
  enableProdMode();
}

platformBrowser().bootstrapModule(AppModule);

// Logging bootstrap information
bootstrapPromise.then(success => console.log(`Bootstrap success`))
  .catch(err => console.error(err));
import { Component } from '@angular/core';
export * from './footer.component';
 

@Component({
  selector: 'layout-footer',
  templateUrl: './footer.component.html'
})

export class FooterComponent {
  today: number = Date.now();
}
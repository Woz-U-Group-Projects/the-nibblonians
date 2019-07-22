import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';
import { StartComponent } from 'src/start/start.component';
import { ContinueComponent } from 'src/continue/continue.component';
import { ReviewComponent } from 'src/review/review.component';
import { ManagerComponent } from 'src/manager/manager.component';
import { AdminComponent } from 'src/admin/admin.component';
import { ContactComponent } from 'src/contact/contact.component';
import { HelpComponent } from 'src/help/help.component';
import { BrowserModule } from '@angular/platform-browser';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule,
        BrowserModule,
      ],
      declarations: [
        AppComponent,
        StartComponent,
        ContinueComponent,
        ReviewComponent,
        ManagerComponent,
        AdminComponent,
        ContactComponent,
        HelpComponent
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'HiredHyperspace'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('HiredHyperspace');
  });

  it('should render title in a h1 tag', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to HiredHyperspace!');
  });
});

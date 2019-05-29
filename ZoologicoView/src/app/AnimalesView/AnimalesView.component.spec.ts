import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimalesViewComponent } from './AnimalesView.component';

describe('AnimalesViewComponent', () => {
  let component: AnimalesViewComponent;
  let fixture: ComponentFixture<AnimalesViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnimalesViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnimalesViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

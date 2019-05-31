import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserLayaoutComponent } from './user-layaout.component';

describe('UserLayaoutComponent', () => {
  let component: UserLayaoutComponent;
  let fixture: ComponentFixture<UserLayaoutComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserLayaoutComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserLayaoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

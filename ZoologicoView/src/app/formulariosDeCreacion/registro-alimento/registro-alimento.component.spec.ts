import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistroAlimentoComponent } from './registro-alimento.component';

describe('RegistroAlimentoComponent', () => {
  let component: RegistroAlimentoComponent;
  let fixture: ComponentFixture<RegistroAlimentoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegistroAlimentoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistroAlimentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
